package br.com.TecHelpAPI.controllers;


import br.com.TecHelpAPI.model.Skill;
import br.com.TecHelpAPI.services.SkillServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    private SkillServices service;

    @GetMapping(
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Skill> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{idSkill}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Skill findById(@PathVariable("idSkill") Long id) {
        return service.findById(id);
    }

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Skill create(@RequestBody Skill skill) {
        return service.create(skill);
    }

    @PutMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Skill update(@RequestBody Skill skill) {
        return service.update(skill);
    }

    @DeleteMapping(value = "/{idSkill}")
    public ResponseEntity<?> delete(@PathVariable("idSkill") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
