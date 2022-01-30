package com.company.animals;

public class Cat extends Animal {

    private String color;

    public Cat(String name, int weight, int age, String color) {
        super(name, weight, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
