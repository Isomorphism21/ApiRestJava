package com.Isomorphism.ApirestJava.persona;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {
    
    private final PersonRepository personRepo;

    public void createPersona(Person person){
        personRepo.save(person);
    }

    public List<Person> getPersonas(){
        return personRepo.findAll();
    }

}
