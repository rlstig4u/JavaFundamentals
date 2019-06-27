package com.fundamentals.java;

/*
 *
 * */

public class Truck {

    private String wheelSize;
    private int boxbedType;
    private String colorType;
    private String windowType;

    public void Driving() {
        //print out a message
        System.out.println("truck is driving");
    }

    public void truckisdriving(String message) {
        System.out.print(message);
    }
    public Truck(String wheelSize, int boxbedType, String colorType) {
        this.wheelSize = wheelSize;
        this.boxbedType = boxbedType;
        this.colorType = colorType;
    }

    public Truck() {

        System.out.print("The Truck Default Constructor");
    }

    public Truck(String colorType, String windowType) {
        this.colorType = colorType;
        this.windowType = windowType;
    }

    public Truck(String boxbedType, int boxbed, String wheelSize, String windowType, String colorType) {
        this.setBoxbedType(boxbed);
        this.setWheelSize(wheelSize);
        this.setWindowType(windowType);
    }
    public void setcolor(String colorType) {
        this.setColorType(colorType);
    }

    public String getColorType() {
        return colorType;
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    public void setWindowType(String windowType) {
        this.windowType = windowType;
    }
    public String getWindowType() {
        return windowType;
    }

    public int getBoxbedType() {
        return boxbedType;
    }

    public void setBoxbedType(int boxbedType) {
        this.boxbedType = boxbedType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }
}


