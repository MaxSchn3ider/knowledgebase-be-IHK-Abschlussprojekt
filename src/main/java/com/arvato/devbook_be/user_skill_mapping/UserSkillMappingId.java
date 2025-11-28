package com.arvato.devbook_be.user_skill_mapping;

import jakarta.persistence.Embeddable;

@Embeddable
public class UserSkillMappingId {
    private long user_id;
    private long skill_id;

    public UserSkillMappingId() {}

    public UserSkillMappingId(long user_id, long skill_id) {
        this.user_id = user_id;
        this.skill_id = skill_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(long skill_id) {
        this.skill_id = skill_id;
    }
}
