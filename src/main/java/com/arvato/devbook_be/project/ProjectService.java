package com.arvato.devbook_be.project;

import com.arvato.devbook_be.common.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project save(Project project){
        return projectRepository.save(project);
    }

    public List<Project> findAll(){
        return projectRepository.findAll();
    }

    public List<ProjectDTO> findAllDTOs(){
        return findAll().stream().map(ProjectDTO::new).toList();
    }

    public Project search(String searchValue){
        if(searchValue.matches("\\d+")){
            return findById(Long.parseLong(searchValue));
        }
        else {
            return findByName(searchValue);
        }
    }

    public Project findById(long id){
        return projectRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Project not found"));
    }

    public Project findByName(String name){
        return projectRepository.findByName(name).orElseThrow(() -> new ResourceNotFoundException("Project not found"));
    }

    public List<Project> findAllNameContainingIgnoreCase(String name){
        return projectRepository.findAllByNameContainingIgnoreCase(name);
    }
}
