package com.fundamentals.java;
import java.util.Scanner;
/*
* The contents of the class goes over the Lesson 7 content
* Java Operators
* */

public class Lesson7 {


    int value1 = 23, value2 = 45;



    public void basicMath () {

        //Arithmetic operators using basic math
        int addTotal = value1 = value2;
        int subtractionTotal = value2 - value1;
        int multiplyTotal = value1 * value2;
        int divisionTotal = value1 / value2;
        System.out.println(addTotal);
        System.out.println(subtractionTotal);
        System.out.println(multiplyTotal);
        System.out.println(divisionTotal);
    }

    public void exampleModulus (){
        //using basic math to find the modulus total

        int modulusTotal = value1 % value2;
        System.out.println(modulusTotal);

    }

    public void addTwoNumbers(){

        int x,y, z;
        System.out.println("Enter two integers to calculate their sum");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("The Sum of entered values = "+z);
    }


    public void exampleAssignment1() {
        //assignment operators
        int able = 10, may = 15;
        able += may;
        System.out.println(able);
        may -= able;
        System.out.println(may);
        able *= may;
        System.out.println(able);
        able /= may;
        System.out.println(able);
        may %=  able;
        System.out.println(may);

    }

    public void exampleAssignment2() {
        int beta = 10, charlie = 5;
        beta <<= charlie;
        System.out.println(beta);
        charlie >>= beta;
        System.out.println(charlie);
        beta &= charlie;
        System.out.println(beta);
        charlie ^= beta;
        System.out.println(charlie);



    }



    public void exampleRelational(){
        //Relational examples used to check relationship for variables
        int echo = 25, foxtrot = 30, golf = 25;
        boolean isSample1 = echo == foxtrot;
        System.out.println(isSample1);
        boolean isSample2 = echo != foxtrot;
        System.out.println(isSample2);
        boolean isActual = foxtrot > golf;
        System.out.println(isActual);
        boolean isActual2 = foxtrot < golf;
        System.out.println(isActual2);
        boolean isFamiliar = echo >=golf;
        System.out.println(isFamiliar);
        boolean isFamiliar2 = foxtrot <= echo;
        System.out.println(isFamiliar2);




    }


    public void exampleIncrement(){

        int home = 10, jump, car;
        jump = home++;
        System.out.println(jump);

        car = ++home;
        System.out.println(car); //answer is 12


    }


    public void exampleDecrement()  {
        int toy = 10, joe, jerry;
        joe = toy--;
        System.out.println(joe);


        jerry = --toy;
        System.out.println(jerry);




    }
}
