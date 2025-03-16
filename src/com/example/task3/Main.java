package com.example.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2020);
        Car car3 = new Car(2021, 325.5);
        Car car4 = new Car(2024, 355, 2500);
        Car car5 = new Car(2023, 370.5, 2350, "Red");

        car1.setYear(2025);
        car1.setSpeed(350.0);
        car1.setWeight(2200);
        car1.setColor("white");

        Car[] arrcar = {car1, car2, car3, car4, car5};

        for (int i = 0; i < arrcar.length; i++) {
            System.out.println(arrcar[i]);  // оскільки по умові задачі не зрозуміло, що потрібно вивести,
                                            // то вирішив вивести таким методом.
        }
    }
}
