//OOP. 2
//Поля
//Найменування
//Виробник
//Рік_випуску
//Кількість
//Ціна
//
//Визначити загальну вартість усіх товарів, випущених у поточному році та вивести відомості про ці товари.

package com.example.practice.oop2task2;

public class AllArticle {
    private String name;
    private String manufacture;
    private int year;
    private int count;
    private double price;

    public AllArticle(String name, String manufacture, int year, int count, double price) {
        this.name = name;
        this.manufacture = manufacture;
        this.year = year;
        this.count = count;
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", year=" + year +
                ", count=" + count +
                ", price=" + price +
                '}';
    }
}
