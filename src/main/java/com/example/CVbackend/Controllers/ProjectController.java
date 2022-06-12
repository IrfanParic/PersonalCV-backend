package com.example.CVbackend.Controllers;

import com.example.CVbackend.Models.ProjectModel;
import com.example.CVbackend.Services.ProjectService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<ProjectModel> getProjects() {
        return projectService.getProjects();
    }
}
