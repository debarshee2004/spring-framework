package com.debarshee.spring_boot_restapi.controller;

import com.debarshee.spring_boot_restapi.model.AlienModel;
import com.debarshee.spring_boot_restapi.repository.AlienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AlienController {

    @Autowired
    AlienRepository repository;

    public void addAlien(@ModelAttribute("alien") AlienModel alienModel) {}

    @GetMapping("aliens")
    @ResponseBody
    public List<AlienModel> getAliens() {
        List<AlienModel> aliens = repository.findAll();
        return aliens;
    }

    public void getAlien(@RequestParam int alien_id) {}
}
