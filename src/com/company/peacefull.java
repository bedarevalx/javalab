package com.company;

public class peacefull extends nation {
    void devpopulation() {
        System.out.println("\nУ государства " + title + " выросла популяция, военная сила уменьшена");
        population *= 1.5;
        millitarypow -= 0.1;
    }
    void Display() {
        System.out.println("Информация о государстве " + title);
        System.out.println("Популяция - " + population);
        System.out.println("Военная мощь - " + millitarypow);
        System.out.println("Тип государства - Дружелюбное");
    }
}
