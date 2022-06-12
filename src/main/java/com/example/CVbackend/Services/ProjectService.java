package com.example.CVbackend.Services;

import com.example.CVbackend.Models.ProjectModel;
import com.example.CVbackend.Repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<ProjectModel> getProjects() {
        return projectRepository.findAll();
    }
}
