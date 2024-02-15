package org.prog.cars;

public class Ford implements ICar {

    public String color;//red

    public int miles;//500

    @Override
    public void closeOpenDoor() {System.out.println("Honda doors can be opened with a key");}

    @Override
    public void goTo() {
        System.out.println("Ford uses diesel engine!");
    }

    @Override
    public void fillCar() {
        System.out.println("Ford is using diesel");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Ford) {
            Ford otherCar = (Ford) obj;
            return this.color.equals(otherCar.color) && this.miles == otherCar.miles;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (color + miles).hashCode();
    }

    public void driveTo(String city) {
        driveTo("current city", city);
    }

    public void driveTo(String fromCity, String destCity) {
        driveTo(fromCity, destCity, "nowhere");
    }

    public void driveTo(String fromCity, String destCity, String passingThrough) {
        System.out.println("Car is driving from " + fromCity + " to " + destCity + " stopping " + passingThrough);
    }

}
