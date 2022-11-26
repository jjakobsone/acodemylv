package lv.acodemy.homework;

import java.util.Scanner;

public class ObjectExamplePez {
    public static void main(String[] args) {

        PezDispenser spiderMan = new PezDispenser("Spider-Man", "Red-blue-white", "Marvel");
        spiderMan.printAllInfo();
        System.out.println();

        //give one candy (davatj po 1 konfete)
        spiderMan.giveCandie();
        System.out.println();

        //give any amount of candie we need
        spiderMan.giveCandie(5);
        System.out.println();


        System.out.println("Current amount of candies: " + spiderMan.getCurrentAmountOfCandies());
        System.out.println();


        //load the entire missing candies?????????

        //upload one candy (zagruzhatj po 1 konfete)
        spiderMan.uploadCandie();
        System.out.println();



        //load any number of candies????????
        spiderMan.giveCandie(4);
        System.out.println();

    }
}

