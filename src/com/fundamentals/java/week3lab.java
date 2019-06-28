package com.fundamentals.java;
/*
*
* */
import java.awt.*;
public class week3lab {
    public void Grade() {
        char Grade = 'X';
        switch (Grade) {
            case 'E':
                System.out.print("Excellent");
                break;
            case 'V':
                System.out.print("VeryGood");
                break;
            case 'G':
                System.out.print("Good");
                break;
            case 'A':
                System.out.println("Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println(Grade);

        }


    }//end of method

    public void basicDoWhileExample() {
        int today = 0;
        do {
            if (today % 3 == 0) {
                System.out.println(today);
            }

            today++;

        } while (today < 50);
    }

}