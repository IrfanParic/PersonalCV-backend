package com.example.CVbackend.Repositories;

import com.example.CVbackend.Models.ProjectModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectModel, Long> {

}
