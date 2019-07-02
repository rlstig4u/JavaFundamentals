package com.fundamentals.java;
/*
 *
 * */

public class week3lab {

    public String showGrade(char grade) {
        switch (grade) {
            case 'E':
                return "Excellent";
            case 'V':
                return "Very Good";
            case 'G':
                return "Good";
            case 'A':
                return "Average";
            case 'F':
                return "Fail";

            default:
                return "Not a valid grade";
//Lab3 lab3 = newLab3

        }
    }



        public void divisibleByThree() {

            for (int i = 0; i < 50; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }

            }
        }
    }

