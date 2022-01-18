package com.company.animals;

public abstract class Animal {
    String name;
    int weight;
    int age;

    public Animal(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
}
