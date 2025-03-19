//OOP. 3
//Поля
//Найменування
//Кількість
//Ціна
//Виробник
//Дата_випуску
//Вивести на екран найменування товару з максимальною загальною вартістю

package com.example.practice.oop2task3;

public class Main {
    public static void main(String[] args) {
        MaxPrice artic1 = new MaxPrice("mouse", 10, 225, "LG", 2025);
        MaxPrice artic2 = new MaxPrice("keyboard", 155, 1755, "WD", 2024);
        MaxPrice artic3 = new MaxPrice("monitor", 5, 5035, "Razer", 2023);

        MaxPrice[] arrArtic = {artic1, artic2, artic3};

        double maxPrice = 0;
        int index = 0;
        for (int i = 0; i < arrArtic.length; i++) {
            double total = arrArtic[i].getCount() * arrArtic[i].getPrice();
            if (total > maxPrice){
                maxPrice = total;
                index = i;
            }
        }
        System.out.println(arrArtic[index]);
        System.out.println(maxPrice);
    }
}
