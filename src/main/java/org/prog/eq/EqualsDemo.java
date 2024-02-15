package org.prog.eq;

public class EqualsDemo {

    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";
        String s3 = "s1";

        isStringEqual(s2, s3);
        isStringEqual(s2, s1);
        isStringEqual(s1, s2);
        isStringEqual(s1, s1);
    }

    public static void isStringEqual(String stringOne, String stringTwo) {
        if (stringOne != null) {
            System.out.println(stringOne.equals(stringTwo));
        } else if (stringTwo != null) {
            System.out.println(stringTwo.equals(stringOne));
        } else {
            System.out.println("Both strings are null");
        }
    }
}
