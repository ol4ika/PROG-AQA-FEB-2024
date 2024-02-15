package org.prog.collections;

import java.util.ArrayList;
import java.util.List;

public class ListsCollection {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        List<Car> cars = new ArrayList<>();
        Car myCar = new Car();
        for (int i = 0; i < 40; i++) {
            cars.add(new Car());
            if (i == 15) {
                cars.add(myCar);
            }
        }

        System.out.println("My car index: " + cars.indexOf(myCar));

        System.out.println(cars.size());
    }
}