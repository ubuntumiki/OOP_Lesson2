package com.example.task4;

public class Main {
    public static void main(String[] args) {
        Car mashine1 = new Car();
        Car mashine2 = new Car(2021);
        Car mashine3 = new Car(2022, 355);
        Car mashine4 = new Car(2023, 2555, "white");
        Car mashine5 = new Car(2024, 399, 2450, "black");

//        mashine1.setYear(2017);
//        mashine1.setSpeed(400);
//        mashine1.setWeight(2500);
//        mashine1.setColor("Blue");

        System.out.println(mashine1);
        System.out.println(mashine2);
        System.out.println(mashine3);
        System.out.println(mashine4);
        System.out.println(mashine5);
    }
}
