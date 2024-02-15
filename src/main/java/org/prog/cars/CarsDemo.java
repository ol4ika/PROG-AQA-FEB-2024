package org.prog.cars;

public class CarsDemo {

    /**
     * ########################################
     * <-s1
     * ########################################
     * ########################################
     * ########################################
     * ######[redCar##################i->#####]
     * ########################################
     * ####################greenCar############
     * ########################################
     * ########################################
     * ########################################
     * ############blueCar#####################
     * ########################################
     * ########################################
     * ########################################
     * ########################################
     * #########10##########550################
     *
     * @param args
     */

    public static void main(String[] args) {
        int i = 10;
        increaseI(i);
        i=550;
        System.out.println(i);
        Ford redCar = new Ford();
        Ford blueCar = new Ford();
        Ford greenCar = new Ford();

        Ford bobsCar = redCar;
        Ford sarahsCar = blueCar;
        Ford joesCar = greenCar;

//        redCar.miles = 500;
//        blueCar.miles = 501;
//        greenCar.miles = 500;
//
//        redCar.color = "red";
//        blueCar.color = "red";
//        greenCar.color = "green";

        System.out.println(redCar.equals(blueCar));
        System.out.println(redCar.equals(greenCar));
//
//        System.out.println(bobsCar.color);
//        System.out.println(bobsCar.miles);
//
//        System.out.println(sarahsCar.color);
//        System.out.println(sarahsCar.miles);
//
//        System.out.println(joesCar.color);
//        System.out.println(joesCar.miles);
//
//        paintCar(bobsCar, "black");
//        paintCar(sarahsCar, "yellow");
//        paintCar(joesCar, "purple");
//
//        System.out.println(bobsCar.color);
//        System.out.println(bobsCar.miles);
//
//        System.out.println(sarahsCar.color);
//        System.out.println(sarahsCar.miles);
//
//        System.out.println(joesCar.color);
//        System.out.println(joesCar.miles);
    }

    public static void paintCar(Ford car, String color) {
//        car.miles += 50;
//        car.color = color;
    }

    public static void increaseI(int i) {
        i = 500;
    }
}
