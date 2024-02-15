package org.prog.cycles;

public class CyclesDemo {

    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;

        if (trueFlag() || falseFlag() || b1) {
            System.out.println("always true");
        } else {
            System.out.println("never works");
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            if (i == 3) {
                break;
            }
        }
        int j = -10;
        while (j > 0) {
            System.out.println(j);
            j--;
        }

        int k = -10;
        do {
            System.out.println(k);
            k--;
        } while (k >= 0);

        test("CHROME");
        test("Avant");
    }

    //TODO: switch practice

    private static void test(String s) {
        switch (s) {
            case "CHROME":
                System.out.println("CHROME");
                break;
            case "OPERA":
                System.out.println("OPERA");
                break;
            case "FIREFOX":
                System.out.println("FIREFOX");
                break;
            case "EDGE":
                System.out.println("EDGE");
                break;
            case "SAFARI":
                System.out.println("SAFARI");
                break;
            default:
                throw new RuntimeException("Unsupported browser!");
        }
    }

    private static boolean falseFlag() {
        return false;
    }

    private static boolean trueFlag() {
        return true;
    }
}
