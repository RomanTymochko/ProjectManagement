package pl.edu.wsb.projectmanagement.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.edu.wsb.projectmanagement.entity.Project;
import pl.edu.wsb.projectmanagement.entity.Sprint;
import pl.edu.wsb.projectmanagement.entity.Task;
import pl.edu.wsb.projectmanagement.entity.User;
import pl.edu.wsb.projectmanagement.service.ProjectService;
import pl.edu.wsb.projectmanagement.service.SprintService;
import pl.edu.wsb.projectmanagement.service.TaskService;
import pl.edu.wsb.projectmanagement.service.UserService;

import java.security.Principal;
import java.util.Set;
import java.util.TreeSet;

@Controller
@RequestMapping("/task")
@AllArgsConstructor
public class TaskController {
    private TaskService taskService;
    private SprintService sprintService;
    private UserService userService;
    private ProjectService projectService;


    @GetMapping("/create/{sprintId}")
    public String createTask(@PathVariable int sprintId, Model model, Principal principal){
        User user = userService.getByUsername(principal.getName());
        model.addAttribute("user",user);
        Sprint sprint = sprintService.findById(sprintId);
        Set<User> colab = new TreeSet<>(sprint.getProject().getTeamList());
        colab.add(sprint.getProject().getOwner());
        model.addAttribute("users",colab);
        model.addAttribute("sprintId",sprintId);
        return "create_task";
    }

    @ResponseBody
    @PostMapping("/create/{sprintId}")
    public String createTask(@PathVariable int sprintId, Task task,String[] subTasks, int assignee){
        task.setSprint(sprintService.findById(sprintId));
        task.setAssignee(userService.findById(assignee));
        task = taskService.save(task,subTasks);
        projectService.countProgress(task.getSprint().getProject());
        return "redirect:/sprint/info/"+sprintId;
    }


    @GetMapping("/update/{taskId}")
    public String updateTask(@PathVariable int taskId,Model model,Principal principal){
        User user = userService.getByUsername(principal.getName());
        model.addAttribute("user",user);
        Task task = taskService.findById(taskId);
        Sprint sprint = sprintService.findById(task.getSprint().getId());
        Set<User> colab = new TreeSet<>(sprint.getProject().getTeamList());
        colab.add(sprint.getProject().getOwner());
        model.addAttribute("task",task);
        model.addAttribute("users",colab);
        return "edit_task";
    }

    @GetMapping("/update/deleteAssign/{taskId}")
    public String deleteAssign(@PathVariable int taskId){
       taskService.deleteAssigneeByID(taskId);
        return "redirect:/update/"+taskId;
    }

    @PostMapping("/update/{taskId}")
    public String updateTask(@PathVariable int taskId,Task task){
        task.setId(taskId);
        taskService.update(task);
        Task taskDB = taskService.findById(taskId);
        projectService.countProgress(taskDB.getSprint().getProject());
        return "redirect:/sprint/info/"+taskDB.getSprint().getId();
    }

    @GetMapping("/info/{id}")
    public String getTask(@PathVariable int id, Model model,Principal principal){
        User user = userService.getByUsername(principal.getName());
        model.addAttribute("user",user);
        model.addAttribute("task",taskService.findById(id));
        return "single_task";
    }

    @GetMapping("/delete/{sprintId}")
    public String deleteBacklog(@PathVariable int sprintId, int id){
        Project project = sprintService.findById(sprintId).getProject();
        taskService.deleteByID(id);
        projectService.countProgress(project);
        return "redirect:/sprint/info/"+sprintId;
    }
}
