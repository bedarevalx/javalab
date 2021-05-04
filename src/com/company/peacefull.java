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
    public peacefull(String name,int populate,double milit){
        this.title=name;
        this.population=populate;
        this.millitarypow=milit;
        nation.counter++;
    }
    public peacefull(){
        this.title="Greece";
        this.population=12000;
        this.millitarypow=1.2;
        nation.counter++;
    }
}
