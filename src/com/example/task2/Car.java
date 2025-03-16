//Завдання 2
//Використовуючи Intellij IDEA, створити проєкт, пакет.
// Створити клас Машина з полями рік(int), колір(String).
// Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами.
// Створити клас Main в якому створити екземпляри, викликаючи різні конструктори.

package com.example.task2;

public class Car {
    private int year;
    private String color;

    public Car(){}

    public Car(int year) {
        this.year = year;
        this.color = "red";
    }

    public Car(String color) {
        this.year = 2020;
        this.color = color;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
