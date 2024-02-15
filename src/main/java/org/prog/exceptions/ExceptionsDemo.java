package org.prog.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


//TODO: Catch parent exceptions (EXception / Throwable)
//TODO: Catch specific exception
//TODO: Convert FileNotFoundException into Throwable in readFile3
//TODO: Process Throwable in readFile1
public class ExceptionsDemo {

    public static void main(String[] args) {
        try {
            readFile1();
        } catch (Throwable t) {
            System.out.println("OOPS");
        }
        System.out.println("test");
    }

    public static void readFile1() {
        readFile2();
    }

    public static void readFile2() {
        readFile3();
    }

    public static void readFile3() {
        readFile4();
    }

    public static void readFile4() {
        try {
            readFile5();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile5() throws FileNotFoundException {
        File f = new File("abc.txt");
        FileReader fileReader = new FileReader(f);
        f.setReadable(true);
    }
}
