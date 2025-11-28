package com.arvato.devbook_be.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{searchValue}")
    public ResponseEntity<User> findByIdOrDisplayName(@PathVariable String searchValue){
        if(searchValue.matches("\\d+")) {
            return new ResponseEntity<>(userService.findById(Long.parseLong(searchValue)), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(userService.findByDisplayname(searchValue), HttpStatus.OK);
        }
    }

    @GetMapping("/contains/{displayname}")
    public List<User> findByDisplaynameContainingIgnoreCase(@PathVariable String displayname){
        return userService.findAllByDisplaynameContainingIgnoreCase(displayname);
    }
}
