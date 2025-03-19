package com.example.practice.oop2task3;

public class MaxPrice {
    private String name;
    private int count;
    private double price;
    private String manufacture;
    private int year;

    public MaxPrice(String name, int count, double price, String manufacture, int year) {
        this.name = name;
        this.count = count;
        this.price = price;
        this.manufacture = manufacture;
        this.year = year;
    }

    @Override
    public String toString() {
        return "MaxPrice{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", manufacture='" + manufacture + '\'' +
                ", year=" + year +
                '}';
    }

    public int getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }
}
