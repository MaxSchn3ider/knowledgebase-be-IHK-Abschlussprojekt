package com.arvato.devbook_be.project;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public Project createProject(@RequestBody Project project){
        return projectService.save(project);
    }

    @GetMapping
    public ResponseEntity<List<ProjectDTO>> findAll(){
        return new ResponseEntity<>(projectService.findAllDTOs(), HttpStatus.OK);
    }

    @GetMapping("/{searchValue}")
    public ResponseEntity<Project> findByIdOrName(@PathVariable String searchValue){
        return new ResponseEntity<>(projectService.search(searchValue), HttpStatus.OK);
    }

    @GetMapping("/contains/{name}")
    public ResponseEntity<List<Project>> findByNameContainingIgnoreCase(@PathVariable String name){
        return new ResponseEntity<>(projectService.findAllNameContainingIgnoreCase(name), HttpStatus.OK);
    }
}
