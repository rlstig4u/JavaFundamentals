package com.fundamentals.java;

/*
*The class content is for Lesson 18
* Exception Handling
* */

import java.util.IllegalFormatException;

public class Lesson18 {
    String myStringNull;

    public void exampleException() {
        try{
            System.out.println(myStringNull);
            System.out.println("Try Block ran");

        } catch (NullPointerException e){
            System.out.println("Null Exception thrown" + e.getMessage());
        } finally {
            System.out.println("Finally  block called");
        }

    } // end method

    public void myArrayException() {
        String[] names = {"Dave", "Matt", "Jody"};
        String[] values = {"243333", "42444444", "38543"};
        try {
            byte b = Byte.parseByte(values[1]);
            System.out.println(b);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Please provide at least 1 argument");
        } catch (NumberFormatException ed) {
            System.out.println("That is not a number");
        } catch (StackOverflowError e) {
            System.out.println("You have given me more than a byte");
        } catch (Exception ea) {
            System.out.println("I dunno what you did");
        } finally{
            System.out.println("Finally my number didn't work");
        }

    }
    } // end class
