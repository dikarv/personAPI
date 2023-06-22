package com.enigma.opo.controller;

import com.enigma.opo.entity.Wallet;
import com.enigma.opo.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class PersonController  {

    @Autowired
    PersonService personService;




    @PostMapping("/persons")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @GetMapping("/persons")
    public List<Person> findAllPerson() {
        return personService.findAllPerson();
    }

}

