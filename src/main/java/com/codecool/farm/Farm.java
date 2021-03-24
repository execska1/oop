package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {
    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return this.animals;
    }

    public void feedAnimals() {
        animals.forEach(Animal::feed);
    }

    public void butcher(Butcher butcher) {
        animals.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        animals.forEach(animal -> result.add("There is a " + animal.getSize() + " sized " + animal.toString() +" in the farm."));

        return result;
    }

}
