package com.arvato.devbook_be.user_skill_mapping;

import com.arvato.devbook_be.skill.Skill;
import com.arvato.devbook_be.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "user_skill_mapping")
public class UserSkillMapping {

    @EmbeddedId
    private UserSkillMappingId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("skill_id")
    @JoinColumn(name = "skill_id")
    @com.fasterxml.jackson.annotation.JsonIgnore
    private Skill skill;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("user_id")
    @JoinColumn(name = "user_id")
    @com.fasterxml.jackson.annotation.JsonIgnore
    private User user;

    @Column(name = "level", nullable = false)
    private int level;

    @Column(name = "helpable", nullable = false)
    private boolean helpable;

    // getter & setter
    public UserSkillMappingId getId() {
        return id;
    }

    public void setId(UserSkillMappingId id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isHelpable() {
        return helpable;
    }

    public void setHelpable(boolean helpable) {
        this.helpable = helpable;
    }
}