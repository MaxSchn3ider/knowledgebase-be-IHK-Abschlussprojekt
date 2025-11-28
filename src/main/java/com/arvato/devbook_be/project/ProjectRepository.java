package com.arvato.devbook_be.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    Optional<Project> findById(long id);

    Optional<Project> findByName(String name);

    List<Project> findAllByNameContainingIgnoreCase(String name);
}
