package com.Isomorphism.ApirestJava.animal;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {
    private final AnimalService animalService;

    public AnimalController(AnimalService animalService){
        this.animalService = animalService;
    }

    @PostMapping("/add")
    public String createAnimal(@RequestBody Animal animal){
        animalService.createAnimal(animal);
        return "Animal Creado";
    }

    @GetMapping("/get")
    public List<Animal> getAnimales(){
        return animalService.getAnimales();
    }

    @DeleteMapping("/del/{id}")
    public void deleteAnimal(@PathVariable Long id){
        animalService.deleteAnimales(id);
    }
}
