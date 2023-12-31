package com.Isomorphism.ApirestJava.persona;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping("/add")
    public void createPersona(@RequestBody Person person){
        personService.createPersona(person);
    }

    @GetMapping("/get")
    public List<Person> getPersona(){
        return personService.getPersonas();
    }
}
