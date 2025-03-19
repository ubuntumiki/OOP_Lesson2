//Завдання 4
//Використовуючи Intelij IDEA, створити проект, пакет. (Наново!)
// Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
// Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-а, 4-а.
// Перевантажити конструктори викликаючи конструктор із конструктора.
// Створити клас Main, де створити екземпляри класу Машина з різними параметрами.

package com.example.task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car(){
        this.year = 2020;
        this.speed = 370;
        this.weight = 2700;
        this.color = "lightblue";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 350;
        this.weight = 2500;
        this.color = "blue";
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 2400;
        this.color = "yellow";
    }

    public Car(int year, int weight, String color) {
        this.year = year;
        this.speed = 377;
        this.weight = weight;
        this.color = color;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public double getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(double speed) {
//        this.speed = speed;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
