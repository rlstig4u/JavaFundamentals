package com.fundamentals.java;

public class Lesson14 {
    public static final int My_First_FINAL = 2019;

    public static int myFirstStatic = 35;

    public static void setMyFirstStaticMethod(int num) {
        int total  = My_First_FINAL * num;
        System.out.println(total);
    }//end method

    public static class MyInnerClass {

        public void myInnerMethod() {
            System.out.println(myFirstStatic);
        }
    }

}// end class
