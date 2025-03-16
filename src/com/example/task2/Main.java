package com.example.task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2014);
        Car car3 = new Car("yellow");
        Car car4 = new Car(2021, "gray");

        car1.setYear(2012);
        car1.setColor("blue");

//        car2.setColor("green");

        System.out.println("Year: " + car1.getYear() + ", color: " + car1.getColor());
        System.out.println("Year: " + car2.getYear() + ", color: " + car2.getColor());
        System.out.println("Year: " + car3.getYear() + ", color: " + car3.getColor());
        System.out.println("Year: " + car4.getYear() + ", color: " + car4.getColor());
    }
}
