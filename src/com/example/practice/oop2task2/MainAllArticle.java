package com.example.practice.oop2task2;

public class MainAllArticle {
    public static void main(String[] args) {
        AllArticle article01 = new AllArticle("Mouse", "Razer", 2025, 25, 1001.00);
        AllArticle article02 = new AllArticle("Keyboard", "Logitech", 2024, 100, 324.25);
        AllArticle article03 = new AllArticle("Phone", "Apple", 2024, 50, 100_000.00);
        AllArticle article04 = new AllArticle("USB flash", "SanDisk", 2025, 100, 777.00);
        AllArticle article05 = new AllArticle("Router", "TP-Link", 2023, 35, 750.00);
        AllArticle article06 = new AllArticle("WiFi router", "Totolink", 2025, 125, 1200.00);
        AllArticle article07 = new AllArticle("Microphone", "Logitech", 2022, 250, 1050.00);
        AllArticle article08 = new AllArticle("Proliant Gen11", "HP", 2025, 5, 150_000.00);
        AllArticle article09 = new AllArticle("Headset", "Sony", 2025, 155, 1550.00);
        AllArticle article10 = new AllArticle("NVMe", "Western Digital", 2020, 25, 3500.00);

        AllArticle[] arrArticle = {article01, article02, article03, article04, article05, article06, article07, article08,
                                    article09, article10};

        int allCount = 0;
        for (int i = 0; i < arrArticle.length; i++) {
            if (arrArticle[i].getYear() == 2025){
                allCount += arrArticle[i].getCount();
                System.out.println(arrArticle[i]);
            }
        }
        System.out.println("All count: " + allCount);
    }
}
