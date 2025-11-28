package com.arvato.devbook_be.project;

import com.arvato.devbook_be.image.Image;
import com.arvato.devbook_be.role.Role;
import com.arvato.devbook_be.user.User;
import com.arvato.devbook_be.user_project_mapping.UserProjectMapping;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projects")
public class Project {

    public Project() {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "image")
    private Image image;

    @Column(name = "project_start_date")
    private Timestamp projectStartDate;

    @OneToMany(mappedBy = "project", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private Set<UserProjectMapping> userProjectMappings = new HashSet<>();

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<UserProjectMapping> getUserProjectMappings() {
        return userProjectMappings;
    }

    public void setUserProjectMappings(Set<UserProjectMapping> userProjectMappings) {
        this.userProjectMappings = userProjectMappings;
    }

    public Timestamp getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(Timestamp projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public void addUser(User user, Role role){
        UserProjectMapping mapping = new UserProjectMapping();
        mapping.setUser(user);
        mapping.setProject(this);
        mapping.setRole(role);

        this.userProjectMappings.add(mapping);
        user.getUserProjectMappings().add(mapping);
    }

    public void removeUser(User user) {
        userProjectMappings.removeIf(mapping -> {
            boolean match = mapping.getUser().equals(user);
            if (match) {
                user.getUserProjectMappings().remove(mapping);
                mapping.setUser(null);
                mapping.setProject(null);
            }
            return match;
        });
    }
}