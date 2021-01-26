package pl.edu.wsb.projectmanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.edu.wsb.projectmanagement.entity.Backlog;
import pl.edu.wsb.projectmanagement.entity.Sprint;
import pl.edu.wsb.projectmanagement.service.ProjectService;
import pl.edu.wsb.projectmanagement.service.SprintService;

@Controller
@RequestMapping("/sprint")
public class SprintController {

    private SprintService sprintService;
    private ProjectService projectService;

    public SprintController(SprintService sprintService, ProjectService projectService) {
        this.sprintService = sprintService;
        this.projectService = projectService;
    }

    @PostMapping("/create/{projectId}")
    public String createBacklog(@PathVariable int projectId, Sprint sprint){
        sprint.setProject(projectService.findById(projectId));
        sprintService.save(sprint);
        return "redirect:/projects/info/"+projectId;
    }

    @PostMapping("/update/{projectId}")
    public String updateBacklog(@PathVariable int projectId, Sprint sprint){
        sprint.setProject(projectService.findById(projectId));
        sprintService.update(sprint);
        return "redirect:/projects/info/"+projectId;
    }

    @GetMapping("/delete/{projectId}")
    public String deleteBacklog(@PathVariable int projectId, int id){
        sprintService.deleteByID(id);
        return "redirect:/projects/info/"+projectId;
    }
}
