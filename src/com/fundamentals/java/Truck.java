package com.fundamentals.java;

    /*
    *
    * */

    public class Truck {
        private String wheelSize;
        private int boxbedType;
        private String colorType;
        private String windowType;

        public Truck() {
            System.out.println("truck is driving");

            }

        public Truck(String boxbedType) {
            this(boxbedType, 26, "shortbed", "red", "automatic");
            System.out.print("The Boxbed Shortbed + Boxbed");
            }
         public Truck(String boxbedType, int boxbed, String wheelSize, String windowType, String colorType) {
                this.boxbedType = boxbed;
                this.wheelSize = wheelSize;
                this.windowType = windowType;
                }
          public void setcolor(String colorType) {
                    this.colorType = colorType;
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
           public void setWindowType(String windowType){
                    this.windowType = windowType;
        }
           public String getWindowType() {
                return windowType;
           }



    }


