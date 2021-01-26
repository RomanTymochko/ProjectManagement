package pl.edu.wsb.projectmanagement.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wsb.projectmanagement.entity.Project;
import pl.edu.wsb.projectmanagement.entity.User;
import pl.edu.wsb.projectmanagement.service.ProjectService;
import pl.edu.wsb.projectmanagement.service.UserService;

import java.security.Principal;
import java.util.Set;
import java.util.TreeSet;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;
    private UserService userService;

    public ProjectController(ProjectService projectService, UserService userService) {
        this.projectService = projectService;
        this.userService = userService;
    }

    @GetMapping
    public String getAllProjects(Model model,Principal principal){
        User user = userService.getByUsername(principal.getName());
        Set<Project> projects = new TreeSet<>();
        projects.addAll(user.getProjectList());
        projects.addAll(user.getCollaborators());
        model.addAttribute("projects",projects);
        return "index";
    }

    @PostMapping("/create")
    public String addProject(Project project, Principal principal){
        String username= principal.getName();
        System.out.println(username);
        if(!username.isEmpty()){
            User user = userService.getByUsername(username);
            System.out.println(user.getUsername());
            project.setOwner(user);
            projectService.save(project);
        }
        return "redirect:/projects";
    }

    @PostMapping("/update")
    public String updateProject(Project project){
        projectService.update(project);
        return "redirect:/projects";
    }

    @GetMapping("/delete")
    public String deleteProject(int id){
        projectService.deleteByID(id);
        return "redirect:/projects";
    }

    @GetMapping("/info/{id}")
    public String getProjectInfo(@PathVariable int id,Model model){
        model.addAttribute("project",projectService.findById(id));
        return "project_backlogs_sprints";
    }
}
