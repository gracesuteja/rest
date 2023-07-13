package com.grace.app.rest.Controller;

import com.grace.app.rest.Models.Project;
import com.grace.app.rest.Repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ApiControllers {

    @Autowired
    private ProjectRepo projectRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Hello World!";
    }

    @GetMapping(value = "/projects")
    public List<Project> getProjects(){
        return projectRepo.findAll();
    }

    @PostMapping(value = "/save")
    public String saveProject(@RequestBody Project project){
        try {
            Project existProject = projectRepo.findById(project.getId()).get();
            return "Project "+project.getId()+" existed, project can't be re-added with the same id.";
        }
        catch (Exception e) {
            projectRepo.save(project);
            return "New project successfully saved.";
        }
    }

    @PutMapping(value = "/update/{id}")
    public String updateProject(@PathVariable int id, @RequestBody Project project){
        try{
        Project updatedProject = projectRepo.findById(id).get();
        updatedProject.setTitle(project.getTitle());
        updatedProject.setImg(project.getImg());
        updatedProject.setUrl(project.getUrl());
        updatedProject.setProject(project.getProject());
        projectRepo.save(updatedProject);
        return "Project "+id+" successfully updated.";}
        catch (Exception e){
            return "Project "+id+" not existed.";
        }
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteProject(@PathVariable int id){
        try{
        Project deletedProject = projectRepo.findById(id).get();
        projectRepo.delete(deletedProject);
        return "Project "+id+" successfully deleted.";}
        catch (Exception e){
            return "Project "+id+" not existed.";
        }
    }
}
