package com.arvato.devbook_be.user_project_mapping;

import com.arvato.devbook_be.role.Role;
import com.arvato.devbook_be.user.User;
import com.arvato.devbook_be.project.Project;
import jakarta.persistence.*;

@Entity
@Table(name = "user_project_mapping")
public class UserProjectMapping {
    @EmbeddedId
    private UserProjectMappingId id = new UserProjectMappingId();

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("user_id")
    @JoinColumn(name = "user_id", nullable = false)
    @com.fasterxml.jackson.annotation.JsonIgnore
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("project_id")
    @JoinColumn(name = "project_id", nullable = false)
    @com.fasterxml.jackson.annotation.JsonIgnore
    private Project project;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    public UserProjectMapping() {}

    public UserProjectMapping(User user, Project project, Role role) {
        this.user = user;
        this.project = project;
        this.role = role;
        this.id = new UserProjectMappingId(user.getId(), project.getId());
    }

    public UserProjectMappingId getId() { return id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Project getProject() { return project; }
    public void setProject(Project project) { this.project = project; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}