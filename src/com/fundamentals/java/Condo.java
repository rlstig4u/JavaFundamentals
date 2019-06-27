package com.fundamentals.java;

public class Condo extends House {

    private String balcony;

    public  Condo(){
        System.out.print("Default condo constructor");
    }

    public  Condo(String balcony) {
        this.balcony = balcony;
    }

    public Condo(String balcony, String doorColor, int windowSize, String foundation, String roofytpe){
        super(doorColor, windowSize, foundation, roofytpe);
        this.balcony = balcony;
    }

    public  void maintenance() {
        System.out.print("Will fix condo issues");
    }

    public String getBalcony() {
        return balcony;
    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }

    @Override
    public void doorOpenClose() {
        System.out.print("My condo door is open.");
    }
}
