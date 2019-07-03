package com.fundamentals.java;
import com.fundamentals.lesson10.Lesson10;
/*
* This class is the starting class of this project
* This is an example of a multi-line comment
 */

public class Main {

    public static void week3Lab3() {
        week3lab lab3 = new week3lab();
        System.out.println(lab3.showGrade('G'));
    }


    public  static int num = 0;

    static {
        System.out.println("Static block 1");
        num = 42;
    } // end static block

    static{
        System.out.println("Static block 2");
        num = 62;
    } //end static block

    public static void main(String[] args) {

        //lesson18Example();
        //lesson17Example();
        //week3Lab3();
         //lesson16Example();
        //lesson15Example();
        //lesson14Example();
         //lesson12Example();
        //TruckExample();
        //lesson11Example();
        //lesson10Example();
        //lesson9Example();
        //beerSong();
        //lesson8Examples2();
        //lesson8Examples();
        //lesson7Examples();
        //moreLesson6();
        //lesson6Examples();
        //lesson5Examples();
        //houseExample();

    } // end main method

    public static void  lesson18Example() {
        Lesson18 myLesson18 = new Lesson18();
        myLesson18.exampleException();
        myLesson18.myArrayException();
    }

    public static void lesson17Example() {
        Lesson17 myLesson17 = new Lesson17();
       // myLesson17.exampleArrayList1();
       // myLesson17.exampleArrayList2();
        //myLesson17.exampleHashSet();
            myLesson17.exampleHashMap();
    }

    public static void lesson16Example() {
        Lesson16 myLesson16 = new Lesson16();
        myLesson16.showEnum();

        myLesson16.myFavoriteFlavor(Lesson16.IceCreamFlavors.STRAWBERRY);
        DaysOfTheWeek d1[] = DaysOfTheWeek.values();
        for(DaysOfTheWeek day: d1){
            System.out.println(day + " at index "+day.ordinal());
        }
    }


    public  static void lesson15Example() {
        int[] myKeys = {0,1,2,3,4,5,6,7,8,9};
        Blackberry myBlackberry = new Blackberry(25,myKeys,0,"Color Screen");
        myBlackberry.receiveCall();
        AbstractCellPhone myOldPhone = new Blackberry(30,myKeys,1, "Monochrome");
        myOldPhone.receiveCall();
        myOldPhone.endCall();
    } // end method


    public  static void lesson14Example() {
        //Lesson14.My_First_FINAL =10; // Can not change value of a final

        int total = Lesson14.My_First_FINAL * 35; //2019 * 35
        System.out.println(total);

        //Can change the value of a non-final static
        Lesson14.myFirstStatic = 98; // original is 35
        System.out.println(Lesson14.myFirstStatic);

        Lesson14.setMyFirstStaticMethod(10);

        System.out.println("Block number was"+num);
        Lesson14.MyInnerClass test = new Lesson14.MyInnerClass();
        test.myInnerMethod();
    }


    public static void lesson12Example() {
        Condo myCondo = new Condo();
        myCondo.doorOpenClose();
        Condo mySecondCondo = new Condo("railing","orange", 32,"composite", "steel");
        System.out.print(mySecondCondo.getDoorColor());

        House myHouse = new Condo();
        myHouse.doorOpenClose();
    }
    public static void TruckExample() {
        Truck myTruck = new Truck("boxbed ",26, "wheelSize", "windowType", "colorType");
        System.out.print(myTruck.getWheelSize());
    }

    public static void lesson11Example() {
        House house1 = new House();
        House house2 = new House("white");
    }

    public static void lesson10Example() {
        //Try to see a private method in another class
        Lesson6 myLesson6 =new Lesson6();
       //myLesson6.examplePrivate(); //cannot access
    Lesson10 myLesson = new Lesson10();
        //myLesson.showLesson(); // cannot access
        //myLesson.showProtected(); // cannot access
    }

    public static void lesson9Example() {
        Lesson9 myLesson9 = new Lesson9();
        myLesson9.basicIntArray();
    }

    public static void beerSong() {
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }
    public static void lesson8Examples2() {
        Lesson8 otherLesson = new Lesson8();
        otherLesson.basicWhileExample();
        otherLesson.basicDoWhileExample();
        otherLesson.basicForLoopExample();
        otherLesson.basicBranchingExample();
    }
    public static void lesson8Examples1(){
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,10); //prints before & after
        myLesson8.basicIfExample(5,5); //prints before if & after
        myLesson8.basicIfElseExample(10, 12);//not equal
        myLesson8.basicIfElseExample(12, 12); //equal
        myLesson8.basicIfChainExample(42);
        myLesson8.basicIfAndOrExample(36);
        myLesson8.basicSwitchExample(3);
    }
    public static void lesson7Examples(){

        Lesson7 myLesson7 = new Lesson7();
        myLesson7.basicMath();
        myLesson7.exampleModulus();
        // myLesson7.addTwoNumbers();
        myLesson7.exampleAssignment1();
        myLesson7.exampleAssignment2();
        myLesson7.exampleRelational();
        myLesson7.exampleIncrement();
        myLesson7.exampleDecrement();
        }

    public static void moreLesson6(){
        Lesson6 myOtherLesson6 = new Lesson6();
        myOtherLesson6.exampleBuilder ("Spaghetti", 2);
        myOtherLesson6.exampleChar();
        myOtherLesson6.exampleEscape();
    }

    public static void lesson6Examples(){
        Lesson6 myLesson6 = new Lesson6();
        myLesson6.exampleCharAt();
        myLesson6.exampleConcat(" has awesome donuts");
        myLesson6.exampleEquals("LaMars");
        String myLower = myLesson6.exampleLowercase();
        System.out.println(myLower);
        String myUpper = myLesson6.exampleUppercase();
        System.out.println(myUpper);
        myLesson6.exampleLength();

    }

    public static void lesson5Examples(){
        Lesson5 myLesson5 = new Lesson5();
        myLesson5.showLocalExample();
        myLesson5.showLocalWithParameter(10,12);
        int example =myLesson5.showLocalWithReturn(15,8);
        System.out.println(example);
        myLesson5.showInstanceVariable();
        myLesson5.showConversions();
    }
    public static void houseExample() {
        System.out.println("Welcome to Java");
        House myHouse = new House();
        myHouse.doorOpenClose();

    }
}


