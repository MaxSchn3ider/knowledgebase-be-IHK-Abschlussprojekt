package com.arvato.devbook_be.user;

import com.arvato.devbook_be.common.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(long id){
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("user not found"));
    }

    public User findByDisplayname(String displayname){
        return userRepository.findByDisplayname(displayname);
    }

    public List<User> findAllByDisplaynameContainingIgnoreCase(String displayname){
        return userRepository.findAllByDisplaynameContainingIgnoreCase(displayname);
    }
}
