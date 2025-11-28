package com.arvato.devbook_be.skill;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
    Optional<Skill> findById(long id);

    Optional<Skill> findByName(String name);

    List<Skill> findAllByNameContainingIgnoreCase(String name);
}
