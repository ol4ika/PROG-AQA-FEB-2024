package org.prog.exceptions;

public class ExceptionsDemo2 {

    private static String[] sArray = new String[10];

    public static void main(String[] args) {
        printString1("123123123123123123");
        printString1(null);
        printString1("");
        System.out.println("END");
    }

    public static void printString1(String s) {
        try {
            printString2(s);
        } catch (NullPointerException e) {
            System.out.println("npe!");
        }
    }

    public static void printString2(String s) {
        try {
            printString3(s);
        } catch (NullPointerException e) {
            System.out.println("NPE ERROR!");
            throw new RuntimeException(e);
        } catch (RuntimeException rte) {
            System.out.println("RTE ERROR!");
        } finally {
            System.out.println("=====");
        }
//            printString3(s);
    }

    public static void printString3(String s) {
        printString4(s);
    }

    public static void printString4(String s) {
        try {
            printString5(s);
        } finally {
            System.out.println("finally without catch");
        }
    }

    public static void printString5(String s) {
        if (s != null && s.length() == 0) {
            sArray[15] = s;
        }
        System.out.println(s.length());
    }
}
