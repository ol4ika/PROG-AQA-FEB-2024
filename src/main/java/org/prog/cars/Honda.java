package org.prog.cars;

public class Honda implements ICar {
    @Override
    public void goTo() {
        System.out.println("Honda uses gas");
    }

    @Override
    public void fillCar() {
        System.out.println("Honda is using gas");
    }

    @Override
    public void closeOpenDoor() {System.out.println("Honda doors can be opened with a key");}
}
