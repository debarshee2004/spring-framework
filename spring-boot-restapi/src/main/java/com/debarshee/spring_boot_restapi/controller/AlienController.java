package com.debarshee.spring_boot_restapi.controller;

import com.debarshee.spring_boot_restapi.model.AlienModel;
import com.debarshee.spring_boot_restapi.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlienController {

    @Autowired
    AlienRepository repository;

    @PostMapping("alien")
    public AlienModel addAlien(@RequestBody AlienModel alienModel) {
        repository.save(alienModel);
        return alienModel;
    }

    @GetMapping("aliens")
    public List<AlienModel> getAliens() {
        List<AlienModel> aliens = repository.findAll();
        return aliens;
    }

    @GetMapping("alien/{alien_id}")
    public AlienModel getAlien(@PathVariable("alien_id") int alien_id) {
        AlienModel alien = repository.findById(alien_id).orElse(new AlienModel(0, ""));
        return alien;
    }
}
