package com.company;

public class enemy extends nation {
    void devmilitar() {
        System.out.println("\nУ государства " + title + " увеличилась военная мощь, популяция уменьшена");
        millitarypow += 1;
        population *= 0.7;
    }
}
