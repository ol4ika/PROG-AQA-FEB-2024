package org.prog;

public class Person {

    public void iWant() {
        iWant("Any brand");
    }

    public void iWant(String brand) {
        iWant(brand, "any model");
    }

    public void iWant(String brand, String model) {
        iWant(brand, model, "any memory");
    }

    public void iWant(String brand, String model, String memory) {
        iWant(brand, model, memory, "any color");
    }

    public void iWant(String brand, String model, String memory, String color) {
        System.out.println("I want " + brand + " " + model + " with " + memory + " " + color);
    }
}
