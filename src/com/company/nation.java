package com.company;

import java.util.Scanner;

public class nation {
    Scanner in = new Scanner(System.in);
    void Read() {
        System.out.println("Введите название государства:");
        title = in.nextLine();
        System.out.println("Введите кол-во населения:");
        population = in.nextInt();
        System.out.println("Введите военную мощь (=<2):");
        millitarypow = in.nextDouble();
    }
    void Init(String a, int b, double c) {
        title = a;
        title += " Empire";
        population = b;
        millitarypow = c;

    }
    boolean surrend() {
        System.out.println("Государство " + title + " сдалось");
        this.surrender=true;
        return true;
    }
    void endwar() {
        score = population * millitarypow;
    }
    static int counter = 0;
    static void discounter(){
        System.out.println("В войне участвует " + counter + " государств");
        System.out.println("***********Начало войны***********");
        System.out.println("\nУ государств еще есть возможность этого избежать, если\n одно из государств сдастся");
    }

    String title;
    int population;
    double score;
    double millitarypow;
    boolean surrender = false;
    boolean win = false;
}
