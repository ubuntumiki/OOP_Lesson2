package com.example.task5;

import java.util.Scanner;

import static com.example.task5.MyArea.areaOfCircle;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Для знаходження площі кола введіть радіус кола: ");
        double radius = in.nextDouble();

        System.out.println(areaOfCircle(radius));
    }
}
