package com.company;

public class peacefull extends nation {
    void devpopulation() {
        System.out.println("\nУ государства " + title + " выросла популяция, военная сила уменьшена");
        population *= 1.5;
        millitarypow -= 0.1;
    }
}
