package com.arvato.devbook_be.project;

import com.arvato.devbook_be.user_project_mapping.UserProjectMapping;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class ProjectDTO {
    public ProjectDTO(Project project) {
        this.id = project.getId();
        this.name = project.getName();
        this.description = project.getDescription();
        this.projectStartDate = project.getProjectStartDate();
        this.userProjectMappings = project.getUserProjectMappings();
    }

    private Long id;
    private String name;
    private String description;
    private Timestamp projectStartDate;
    private Set<UserProjectMapping> userProjectMappings = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Timestamp getProjectStartDate() {
        return projectStartDate;
    }

    public Set<UserProjectMapping> getUserProjectMappings() {
        return userProjectMappings;
    }
}