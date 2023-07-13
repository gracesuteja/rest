package com.grace.app.rest.Repo;

import com.grace.app.rest.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, Integer> {
}
