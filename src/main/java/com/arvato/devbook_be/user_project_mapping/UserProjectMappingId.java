package com.arvato.devbook_be.user_project_mapping;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserProjectMappingId implements Serializable {
    private Long user_id;
    private Long project_id;

    public UserProjectMappingId() {}

    public UserProjectMappingId(Long user_id, Long project_id) {
        this.user_id = user_id;
        this.project_id = project_id;
    }

    public Long getUser_id() { return user_id; }
    public void setUser_id(Long user_id) { this.user_id = user_id; }
    public Long getProject_id() { return project_id; }
    public void setProject_id(Long project_id) { this.project_id = project_id; }
}