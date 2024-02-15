package org.prog;

import org.prog.cars.*;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();
        CargoTruck cargoTruck = new CargoTruck();
        Lorry lorry = new Lorry();
        Tesla tesla = new Tesla();
        Honda honda = new Honda();
        Ford ford = new Ford();

        car.turn();
        truck.turn();
        cargoTruck.turn();
        lorry.turn();
        tesla.closeOpenDoor();
        honda.closeOpenDoor();
        ford.closeOpenDoor();

    }
    public static void useCar(ICar iCar) {
        iCar.fillCar();
        iCar.goTo();
    }

    public static void useTesla(Tesla tesla) {
        tesla.goTo();
        tesla.closeOpenDoor();

    }
//        Samsung samsung = new Samsung();
//        SamsungAndroindGenOne samsungAndroindGenOne = new SamsungAndroindGenOne();
//        SamsungAndroindGenTwo samsungAndroindGenTwo = new SamsungAndroindGenTwo();
//        SamsungAndroindGenThree samsungAndroindGenThree = new SamsungAndroindGenThree();
//        SamsungAndroindGenFour samsungAndroindGenFour = new SamsungAndroindGenFour();
//        SamsungAndroindGenFive samsungAndroindGenFive = new SamsungAndroindGenFive();
//        SamsungAndroindGenSix samsungAndroindGenSix = new SamsungAndroindGenSix();
//
//        samsung.getResolution();
//        samsungAndroindGenOne.getResolution();
//        samsungAndroindGenTwo.getResolution();
//        samsungAndroindGenThree.getResolution();
//        samsungAndroindGenFour.getResolution();
//        samsungAndroindGenFive.getResolution();
//        samsungAndroindGenSix.getResolution();
//        Tesla tesla = new Tesla();
//        Honda honda = new Honda();
//        Ford ford = new Ford();
//
////        useTesla(tesla);
//
//        useCar(tesla);
//        useCar(honda);
//        useCar(ford);

//        ford.driveTo("Kyiv");
//        ford.driveTo("Kyiv", "Odessa");
//        ford.driveTo("Kyiv", "Odessa", "Dnepr");
//
//        Person person = new Person();
//
//
//        person.iWant("iPhone", "14 Pro max", "256 GB");
//        person.iWant("iPhone", "14 Pro max");
//        person.iWant("iPhone");
//        person.iWant();
//    }



}
