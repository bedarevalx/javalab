package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        peacefull[] one = new peacefull[2];
        one[0] = new peacefull();
        one[1] = new peacefull();
        enemy two = new enemy();
        one[0].Read();
        two.Init("Rome", 11000, 1.1);
        one[1].Init("Greece",12000,1.2);
        one[0].Display();
        one[1].Display();
        two.Display();
        System.out.println("***********Начало войны***********");
        System.out.println("\nУ государств еще есть возможность этого избежать, если\n одно из государств сдастся");

        int num;
        do {
            System.out.println("\nГосударство " + one[0].title + " вы хотите сдаться? (1-да 2-нет)");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            if (num == 1) break;
            if (num == 2) break;
        } while (true);
        if(num== 1){
            one[0].surrend();
        }
        do {
            System.out.println("\nГосударство " + two.title + " вы хотите сдаться? (1-да 2-нет)");
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            if (num == 1) break;
            if (num == 2) break;
        } while (true);
        if (num == 1) {
            two.surrend();
        }
        one[1].surrend();
        System.out.println("Государство " + one[1].title + " сдалось\n");
        if (one[0].surrender && two.surrender) {
            System.out.println("Был заключен мирный переговор, война закончилась");
        }
        if (one[0].surrender && two.surrender) {
            System.out.println("Государство " + one[0].title + " сдалось, победу одержало государство " + two.title);
        }
        if (!one[0].surrender && two.surrender) {
            System.out.println("Государство" + two.title + " сдалось, победу одержало государство " + one[0].title);
        }
        if (!one[0].surrender && !two.surrender) {
            one[0].devpopulation();
            two.devmilitar();
            one[0].endwar();
            two.endwar();
            if (one[0].score > two.score) {
                System.out.println("\nВ ходе войны государство " + two.title + " потерпело поражение, победу одержало государство " + one[0].title);
            }
            if (one[0].score < two.score) {
                System.out.println("\nВ ходе войны государство " + one[0].title + " потерпело поражение, победу одержало государство " + two.title);
            }
            if (one[0].score == two.score) {
                System.out.println("В ходе войны силы обоих сторон оказались равными, объявлена ничья!");
            }
        }
    }
}


