package com.fundamentals.java;

/*
 * The contents of this class is to go over the lesson 8 content
 * Control Flow Statement
 *
 * */
public class Lesson8 {


    public void basicIfExample(int value1, int value2) {

        System.out.println("Before if Statement");
        if (value1 == value2) {

            System.out.println("Value are equal");

        }
        System.out.println("After if Statement");

    }

    public void basicIfElseExample(int alpha, int beta) {
        System.out.println("Before if statement");
        if (alpha != beta) {
            System.out.println("The values are not equal");

        } else {
            System.out.println("The values are equal");
        }
        System.out.println("End of if statement");

    }//end method

    public void basicIfChainExample(int charlie) {
        System.out.println("Before if statement");
        if (charlie < 30) {
            System.out.println("The value is less than 30");
        } else if (charlie < 40) {
            System.out.println("The value is greater than 30 but less than 40");
        } else {

            System.out.println("The value is greater than 40");
        }

        System.out.println("End of if statement");
    }


    public void basicIfAndOrExample(int delta) {
        System.out.println("Before if statment");
        if (delta > 100 || delta < 50) {
            System.out.println("The value is not between 100 and 50");

        }

        if (delta % 2 == 0 && delta > 30) ;
        System.out.println("The value is greater than 30 amd am even number");
    }


    public void basicSwitchExample (int day){

        switch(day){
            case 1:
                System.out.println("day = 1");
                break;
            case 2:
                System.out.println("day = 2");
                break;
            case 3:
            case 4:

                System.out.println("day = 3 or 4");

                break;

            default:

                System.out.println("day is greater than 4.");
                break;

        }

    }//end method


   public void basicWhileExample(){
        int val = 0;
        while(val < 10){
            System.out.println(val);
            val++; //increment
        }

    } // end method

    public void basicDoWhileExample(){
       int today = 0;
       do {
           if (today % 2 == 0) {
               System.out.println(today);
           }

           today++;

       } while (today < 30);

    } // end method

    public void basicForLoopExample(){

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        }// end method

     public void basicBranchingExample() {
            for(int i = 0; i < 10; i++){
             if(i == 2) {
                 continue;
            }
             if(i == 4) {
                 System.out.println("Loop breaks");
                 break;
             }
         System.out.println(i);
        }
         System.out.println("End of Loop");
    }//end method

}
