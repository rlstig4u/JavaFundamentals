package com.fundamentals.java;

public class Suv extends Truck {

    private  String thirdRowSeat;

    public Suv() {
        System.out.println("Default Suv constructor");
    }
    public Suv(String thirdRowSeat) {
        this.setThirdRowSeat(thirdRowSeat);
    }

    public void extraSeat() {
        System.out.print("will seat more");
    }

    public String getThirdRowSeat() {
        return thirdRowSeat;
    }

    public void setThirdRowSeat(String thirdRowSeat) {
        this.thirdRowSeat = thirdRowSeat;
    }

    @Override
    public void Driving() {
        System.out.print("My truck is cool.");
    }
}
