package com.fundamentals.java;

/*
* This class demonstrates Control Flow using a song.
* */

public class BottlesOfBeerSong {

    public void timeToSing() {
        int bottlesOfBeer = 99;
        String word = "bottles", results = "";

        while (bottlesOfBeer > 0) {
            if (bottlesOfBeer == 1) {
                word = "bottle";
            }
                //end if
                System.out.println(bottlesOfBeer + " " + word + " of Beer on the Wall");
                System.out.println(bottlesOfBeer + " " + word + " of Beer");
                System.out.println("Take one down");
                System.out.println("Pass it around");
                bottlesOfBeer--;

                if (bottlesOfBeer > 0) {
                    System.out.println(bottlesOfBeer + " " + word + "of Beer on the Wall");

                } else {
                    System.out.println("No more bottles of Beer on the Wall");
                } // end if/else
            }// end while


        }// end method

    }//end class



