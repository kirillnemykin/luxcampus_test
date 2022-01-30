package com.company.doors;

public class SlidingDoor extends Door {

    public SlidingDoor(String shape, String color) {
        super(shape, color);
        System.out.println("in sliding door");
    }

    @Override
    public void openDoor() {
        System.out.println("sliding to open");
    }

    @Override
    public void closeDoor() {
        System.out.println("sliding to close");
    }
}
