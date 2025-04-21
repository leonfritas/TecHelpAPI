package br.com.TecHelpAPI.controllers;


import br.com.TecHelpAPI.model.User;

import br.com.TecHelpAPI.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServices service;

    @GetMapping(
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{idUser}",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public User findById(@PathVariable("idUser") Long id) {
        return service.findById(id);
    }

    @PostMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public User create(@RequestBody User user) {
        return service.create(user);
    }

    @PutMapping(
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public User update(@RequestBody User user) {
        return service.update(user);
    }

    @DeleteMapping(value = "/{idUser}")
    public ResponseEntity<?> delete(@PathVariable("idUser") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
