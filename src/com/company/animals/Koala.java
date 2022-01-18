package com.company.animals;

public class Koala extends Animal {
        public Koala(String name, int weight, int age) {
            super(name, weight, age);
        }

    @Override
    public void makeSound() {
        System.out.println("Koala is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Koala is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Koala is sleeping");
    }
}
