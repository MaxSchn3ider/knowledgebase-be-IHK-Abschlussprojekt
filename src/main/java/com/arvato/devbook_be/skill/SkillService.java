package com.arvato.devbook_be.skill;

import com.arvato.devbook_be.common.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {
    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public Skill createSkill(Skill skill)
    {
        return skillRepository.save(skill);
    }

    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    public Skill findById(long id) {
        return skillRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Skill not found"));
    }

    public Skill findByName(String name) {
        return skillRepository.findByName(name).orElseThrow(() -> new ResourceNotFoundException("Skill not found"));
    }

    public List<Skill> findAllByNameContainingIgnoreCase(String name) {
        return skillRepository.findAllByNameContainingIgnoreCase(name);
    }
}
