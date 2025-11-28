package com.arvato.devbook_be.user;

import com.arvato.devbook_be.user_project_mapping.UserProjectMapping;
import com.arvato.devbook_be.user_skill_mapping.UserSkillMapping;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    public User() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    private String displayname;

    @Column(name = "email_adress")
    private String emailAdress;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<UserProjectMapping> userProjectMappings = new HashSet<>();

    @CreationTimestamp
    @Column (name = "created_at", updatable = false)
    private Timestamp createdAt;

    @Column(name = "is_admin", nullable = false)
    private boolean isAdmin;

    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<UserSkillMapping> userSkillMappings = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDisplayname() {
        return firstname + " " + lastname;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public Set<UserProjectMapping> getUserProjectMappings() {
        return userProjectMappings;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


    public void setUserProjectMappings(Set<UserProjectMapping> userProjectMappings) {
        this.userProjectMappings = userProjectMappings;
    }

    public Set<UserSkillMapping> getUserSkillMappings() {
        return userSkillMappings;
    }
    public void setUserSkillMappings(Set<UserSkillMapping> userSkillMappings) {
        this.userSkillMappings = userSkillMappings;
    }
}