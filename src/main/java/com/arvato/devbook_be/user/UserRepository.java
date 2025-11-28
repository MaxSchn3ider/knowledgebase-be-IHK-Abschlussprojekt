package com.arvato.devbook_be.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findById(long id);

    User findByDisplayname(String displayname);

    List<User> findAllByDisplaynameContainingIgnoreCase(String displayname);
}
