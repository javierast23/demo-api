package com.nisum.demo.controller;

import com.nisum.demo.model.People;
import com.nisum.demo.repository.PeopleRepository;
import com.nisum.demo.service.PeopleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PeopleController {

//    @GetMapping("/") // retorna un json de persona
//    public People TestMethod() {
//        return People.builder().name("Javiera").lastName("Morales").rut("11111111-1").build();
//    }
    @GetMapping("/")
    public ArrayList<People> showPeople() {
        return PeopleRepository.newPeople();
    }

    @GetMapping("/olders")
    public ArrayList<People> showOlders() {
        return PeopleService.older18();
    }
}
