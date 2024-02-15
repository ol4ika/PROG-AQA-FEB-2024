package org.prog;

public class Main {

    /**
     * ##########################################
     * ######phoneOne############################
     * ##########################################
     * ##########################################
     * ##########################################
     * ####################phoneTwo##############
     * ##########################################
     * ##########################################
     * ##########################################
     *
     * @param args
     */

    public static void main(String[] args) {
//        Phone phoneOne = new Phone();
//
//        phoneOne.pressPowerButton();
//
//
//        phoneOne.volumeDown();
//        phoneOne.volumeUp();
//        phoneOne.volumeUp();
//        phoneOne.volumeUp();

        Samsung samsung = new Samsung();
        samsung.pressPowerButton();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.volumeUp();
        samsung.pressFlashLightButton();
        samsung.pressFlashLightButton();
        samsung.pressPowerButton();

//        SamsungFold fold = new SamsungFold();
//        fold.pressPowerButton();
//        fold.volumeUp();;
//        fold.scanFingerPrints();
//        fold.foldThePhone();
    }
}
