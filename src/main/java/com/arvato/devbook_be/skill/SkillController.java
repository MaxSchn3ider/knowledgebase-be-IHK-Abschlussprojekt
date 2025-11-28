package com.arvato.devbook_be.skill;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")
public class SkillController {
    private final SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @PostMapping
    public Skill createSkill(@RequestBody Skill skill) {
        return skillService.createSkill(skill);
    }

    @GetMapping
    public List<Skill> findAll() {
        return skillService.findAll();
    }

    @GetMapping("/{searchValue}")
    public ResponseEntity<Skill> findByIdOrName(@PathVariable String searchValue) {
        if(searchValue.matches("\\d+")) {
            return new ResponseEntity<>(skillService.findById(Long.parseLong(searchValue)), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(skillService.findByName(searchValue), HttpStatus.OK);
        }
    }

    @GetMapping("/contains/{name}")
    public List<Skill> findByNameContainsIgnoreCase(@PathVariable String name) {
        return skillService.findAllByNameContainingIgnoreCase(name);
    }
}