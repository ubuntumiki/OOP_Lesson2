package com.example.practice.oop2task1;

public class Main {
    public static void main(String[] args) {
        Article article1 = new Article("NoteBook", 4, 22_000, "Asus", 2024);
        Article article2 = new Article("Monitor", 20, 12_500, "LG", 2023);
        Article article3 = new Article("SSD", 50, 8_300.50, "Kingston", 2024);

        Article[] arrArticle = {article1, article2, article3};

        int count = 0;

        for (int i = 0; i < arrArticle.length; i++) {
            if (arrArticle[i].getCount() > 5){
                System.out.println(arrArticle[i]);
                count += arrArticle[i].getCount();
            }
        }

        System.out.println("All count: " + count);
    }
}
