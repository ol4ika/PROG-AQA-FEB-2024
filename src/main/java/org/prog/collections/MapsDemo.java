package org.prog.collections;

import java.util.*;

public class MapsDemo {

    public static void main(String[] args) {
        HashMap<String, List<Car>> carOwners = new HashMap<>();
        carOwners.put("John", new ArrayList<>());
        carOwners.put("Jane", new ArrayList<>());
        carOwners.put("Bob", new ArrayList<>());
        carOwners.put("Alice", new ArrayList<>());
        carOwners.put("Pete", new ArrayList<>());
        carOwners.put("Kate", new ArrayList<>());

        registerCar("John", new Car(CarColors.BLACK), carOwners);
        registerCar("John", new Car(CarColors.RED), carOwners);
        registerCar("Jane", new Car(CarColors.GREEN), carOwners);
        registerCar("Bob", new Car(CarColors.WHITE), carOwners);
        registerCar("Bob", new Car(CarColors.WHITE), carOwners);
        registerCar("Alice", new Car(CarColors.RED), carOwners);
        registerCar("Pete", new Car(CarColors.BLACK), carOwners);
        registerCar("Kate", new Car(CarColors.WHITE), carOwners);

//        Set<String> ownersOfCarsWithSpecificColor = new HashSet<>();
//        Set<String> ownerNames = carOwners.keySet();
//
//        for (String owner : ownerNames) {
//            List<Car> carsBelongingToThisOwner = carOwners.get(owner);
//            for (Car c : carsBelongingToThisOwner) {
//                if (c.carColor.equals(CarColors.WHITE)) {
//                    ownersOfCarsWithSpecificColor.add(owner);
//                }
//            }
//        }
//
//        for (String o : ownersOfCarsWithSpecificColor) {
//            System.out.println(o);
//        }

    }

    private static void registerCar(String owner, Car car, HashMap<String, List<Car>> cars) {
        List<Car> johnsCars = cars.get(owner);
        johnsCars.add(car);
    }

    private static void printCarsByColor() {
        HashMap<Car, String> ownedCars = new HashMap<>();
        //TODO: print color of all cars owned by John and Alice
        ownedCars.put(new Car(CarColors.BLACK), "John");
        ownedCars.put(new Car(CarColors.WHITE), "John");
        ownedCars.put(new Car(CarColors.GREEN), "Jane");
        ownedCars.put(new Car(CarColors.RED), "Pete");
        ownedCars.put(new Car(CarColors.BLACK), "Bob");
        ownedCars.put(new Car(CarColors.WHITE), "Kate");
        ownedCars.put(new Car(CarColors.GREEN), "Bill");
        ownedCars.put(new Car(CarColors.RED), "Alice");
        ownedCars.put(new Car(CarColors.GREEN), "Alice");

        List<Car> carWithCertainColor = new ArrayList<>();
        Set<Car> cars = ownedCars.keySet();
        for (Car c : cars) {
            if (c.carColor.equals(CarColors.BLACK)) {
                carWithCertainColor.add(c);
//        List<Car> carWithCertainColor = new ArrayList<>();
//        Set<Car> cars = ownedCars.keySet();
//        for (Car c : cars) {
//            if (c.carColor.equals(CarColors.BLACK)) {
//                carWithCertainColor.add(c);
//            }
//        }
//
//        for (Car c : carWithCertainColor) {
//            System.out.println(ownedCars.get(c));
//        }

                List<Car> ownersOfCarsWithSpecificColor = new ArrayList<>();

                for (var owner : ownedCars.entrySet()) {
                    if (owner.getValue().equals("John") || owner.getValue().equals("Alice")) {
                        ownersOfCarsWithSpecificColor.add(owner.getKey());
                    }
                }

                for (Car ca : carWithCertainColor) {
                    System.out.println(ownedCars.get(ca));
                    for (Car car : ownersOfCarsWithSpecificColor) {
                        System.out.println(car.carColor);
                    }
                }
            }
        }
    }
}
