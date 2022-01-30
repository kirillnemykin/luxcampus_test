package com.company;

import com.company.enums.PlaneTypes;

public class Plane {

    private int id;
    private int wings;
    private String name;
    private PlaneTypes type;

    public Plane(int id, int wings, String name, PlaneTypes type) {
        this.id = id;
        this.wings = wings;
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", wings=" + wings +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(PlaneTypes type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getWings() {
        return wings;
    }

    public String getName() {
        return name;
    }

    public PlaneTypes getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plane plane = (Plane) o;

        if (id != plane.id) return false;
        if (wings != plane.wings) return false;
        if (!name.equals(plane.name)) return false;
        return type.equals(plane.type);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + wings;
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }
}
