//Завдання 5
//Використовуючи Intelij IDEA, створити проект, пакет.
// Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
// який повинен приймати радіус та використовуючи PI порахувати площу кола. Створити клас Main, де запустити цей метод.
//S=πr**2

package com.example.task5;

public class MyArea {
    private static final double PI = 3.14;
//    private double radius;

    static double areaOfCircle(double radius){
        return PI * Math.pow(radius, 2);
    }
}
