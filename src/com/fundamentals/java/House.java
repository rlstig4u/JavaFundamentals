package com.fundamentals.java;
/*
* This class is the starting class of this project
* This is an example of a multi-line comment.
* */
/*
*This is our first" class that we create ourselves.
* */

public class House {

    private String roofType;
    private int windowSize;
    private String foundation;
    private String doorColor;

    public House() {
        System.out.print("This is the default constructor");

    }

    public House(String doorColor) {
        this(doorColor, 24, "concrete", "shingle");
        System.out.print("The Door Color is "+ doorColor);
    }

    public House(String doorColor, int windowSize, String foundation, String roofType){
        this.doorColor = doorColor;
        this.windowSize = windowSize;
        this.foundation = foundation;
        this.roofType = roofType;

    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public String getRoofType() {
        return roofType;
    }

    //Our first method (function)
    public void doorOpenClose(){
        //Print out a message
           System.out.println("Open my door");

    }
}
