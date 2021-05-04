package com.company;
public class enemy extends nation {
    void devmilitar() {
        System.out.println("\nУ государства " + title + " увеличилась военная мощь, популяция уменьшена");
        millitarypow += 1;
        population *= 0.7;
    }
    void Display() {
        System.out.println("Информация о государстве " + title);
        System.out.println("Популяция - " + population);
        System.out.println("Военная мощь - " + millitarypow);
        System.out.println("Тип государства - Военное");
    }
    public enemy(String nam){
        this.title=nam;
        this.population=12000;
        this.millitarypow=1.2;
        nation.counter++;
    }
}
