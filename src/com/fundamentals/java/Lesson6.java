package com.fundamentals.java;

/*
 * The contents of this class was for the Lesson 6 Slide Deck.
 * Strings & More
 * */
public class Lesson6 {

    String myString = "LaMars";

    //Method shows String method for charAT
    public void exampleCharAt() {
        char myChar = myString.charAt(2);
                System.out.println(myChar);

    }
        //Method shows String method for concat
    public void exampleConcat(String value) {
        String happy = myString.concat(value);
        //Keep Smiling
        System.out.println(happy);

    }
        //Method shows String method for equals
    public void exampleEquals(String donut) {
        boolean myBoolean = myString.equals(donut);
        System.out.println(myBoolean);
    }

        /* Method show String method lowercase
        followed by Upper
         */
    public String exampleLowercase(){
        return myString.toLowerCase();

    }
        //Method show String method for uppercase
    public String exampleUppercase () {
        return myString.toUpperCase();

    }

        /* Method show String method for Length or size of
        character of code
         */
    public void exampleLength(){
        int length = myString.length();
        System.out.println(length);


    }

        //Method show String method for Builder 2 or more objects
    public void exampleBuilder(String food,int value){
        StringBuilder build = new StringBuilder();
        build.append("My favorite food is ");
        build.append(food).append(" and I ate ")
                .append(value).append(" plates of it.");
        String fav = build.toString();
        System.out.println(fav);

    }

        // Method show String method for Char
    public void exampleChar() {
        char c1 = 't';
        char c2 = '\u00A7';
        System.out.println(c2);

        }

        // Method show String for Escape
     public void exampleEscape()  {

         System.out.println("That\'s a cool toy.\tCanI\n play with it.");

        }

    }

