package com.nisum.demo.service;

import com.nisum.demo.model.People;
import com.nisum.demo.repository.PeopleRepository;

import java.util.ArrayList;

public class PeopleService {

    public static ArrayList<People> older18 () {
        ArrayList<People> original = PeopleRepository.newPeople();
        ArrayList<People> olders = new ArrayList<>();
        int age;
        for(People p : original) {
            age = p.getAge();
            if (age >= 18) {
                olders.add(p);
            }
        }
        return olders;
    }
}
