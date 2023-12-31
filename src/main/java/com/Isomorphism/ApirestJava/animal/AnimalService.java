package com.Isomorphism.ApirestJava.animal;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    private final AnimalRepository animalRepo;

    public AnimalService(AnimalRepository animalRepo){
        this.animalRepo = animalRepo;
    }

    public void createAnimal(Animal animal){
        animalRepo.save(animal);
    }

    public List<Animal> getAnimales(){
        return animalRepo.findAll();
    }

    public void deleteAnimales(Long animalId){
        animalRepo.deleteById(animalId);
    }
}
