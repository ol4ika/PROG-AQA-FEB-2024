package org.prog.collections;

import java.util.*;

/**
 * Write HashMap of owned cars, set their colors using enum you create
 * print owners of cars of certain color
 */
public class HomeWork {

    public static void main(String[] args) {

        HashMap<String, CarColor> carOwners = new HashMap<>();

        carOwners.put("Kate", CarColor.RED);
        carOwners.put("Bob", CarColor.BlACK);
        carOwners.put("Ron", CarColor.BLUE);
        carOwners.put("Jonh", CarColor.GREEN);
        carOwners.put("Harry", CarColor.GREEN);

        System.out.println(carOwners);

        Set<String> keys = carOwners.keySet();
        System.out.println("List of owners: "+keys);

        ArrayList<CarColor> value = new ArrayList<>(carOwners.values());
        System.out.println("List color car: "+value);

//        Set<String> cars = carOwners.keySet();
//        for (Car c : cars){
//            if (c.color.equals("RED"){
//                carOwners.get(c);
//            }
//        }

        HashMap<String, CarColor>  kate = new HashMap<>();
         kate.put("Kate", CarColor.RED);
        HashMap<String, CarColor>  bob = new HashMap<>();
        bob.put("Bob", CarColor.BlACK);
        HashMap<String, CarColor>  ron = new HashMap<>();
        ron.put("Ron", CarColor.BLUE);
        HashMap<String, CarColor>  jonh = new HashMap<>();
        jonh.put("Jonh", CarColor.GREEN);
        HashMap<String, CarColor>  harry = new HashMap<>();
        harry.put("Harry", CarColor.GREEN);

        List<HashMap<String,CarColor>> ownersRedCar=new ArrayList<>();
         ownersRedCar.add(kate);
          System.out.println(ownersRedCar);

        List<HashMap<String,CarColor>> ownersBlackCar=new ArrayList<>();
        ownersBlackCar.add(bob);
        System.out.println(ownersBlackCar);

        List<HashMap<String,CarColor>> ownersBlueCar=new ArrayList<>();
        ownersBlueCar.add(ron);
        System.out.println(ownersBlueCar);

        List<HashMap<String,CarColor>> ownersGreenCar=new ArrayList<>();
        ownersGreenCar.add(jonh);
        ownersGreenCar.add(harry);
        System.out.println(ownersGreenCar);

    }

}
