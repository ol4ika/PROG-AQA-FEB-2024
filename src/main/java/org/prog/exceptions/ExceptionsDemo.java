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

        try {
            readFile1();
        } catch (Throwable t) {
            System.out.println("OOPS");
            readFile2();
        }catch (Throwable e){
            System.out.println("Caught Throwable with message: " + e. getMessage());
        }
        System.out.println("test");
    }

    }
    public static void readFile2() throws Throwable {
        readFile3();
    }

public static void readFile3() throws Throwable {
    try {
        readFile4();
    } catch (FileNotFoundException e){
        throw new Throwable(e. getMessage());
    }

    public static void readFile4() {
        public static void readFile4() throws FileNotFoundException{
            try {
                readFile5();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (Throwable e) {
                throw new FileNotFoundException("File not found");
            }
    }

    public static void readFile5() throws FileNotFoundException {
        File f = new File("abc.txt");
        FileReader fileReader = new FileReader(f);
        f.setReadable(true);
    }
}
