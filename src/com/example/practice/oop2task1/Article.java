//Поля
//Найменування
//Кількість
//Ціна
//Виробник
//Дата_надходження_на_склад
//
//Визначити кількість усіх товарів, кількість яких більша за 5 і вивести відомості про ці товари.

package com.example.practice.oop2task1;

public class Article {
    private String name;
    private int count;
    private double price;
    private String manufacturer;
    private int year;

    public Article(String name, int count, double price, String manufacturer, int year) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.manufacturer = manufacturer;
        this.year = year;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                '}';
    }
}
