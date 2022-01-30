package com.company.animals;

public class MainAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat", 5, 7, "black");
        Cat cat2 = new Cat("Cat", 5, 7, "black");
        Horse horse = new Horse("Horse1", 500, 10, 20);

        PetWalker petWalker = new PetWalker();
        Animal [] animals = {cat1, horse, cat2};
        for (Animal animal: animals) {
            petWalker.walk(animal);
        }

    }
}
