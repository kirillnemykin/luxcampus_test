package com.company.animals;

public class Horse extends Animal {

    private int speed;

    public Horse(String name, int weight, int age, int speed) {
        super(name, weight, age);
        this.speed = speed;
    }

    @Override
    public void makeSound() {
        System.out.println("Horse is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Horse is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }
}
