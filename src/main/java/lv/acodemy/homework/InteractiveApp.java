package lv.acodemy.homework;

import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {

        Scanner chatBotOliver = new Scanner(System.in);
        System.out.println("Hi. My name is Oliver. Do you want to register on our website?");
        System.out.println("Press 1 for registration or press 2 to stop chat:");
        byte answer = chatBotOliver.nextByte();
        if (answer == 1) {
            System.out.println("What is your name?");
            String name = chatBotOliver.next();

            System.out.println("What is your last name?");
            String lastName = chatBotOliver.next();

            System.out.println("What is your email adress?");
            String email = chatBotOliver.next();

            System.out.println("Please enter the date in following format: dd.mm.yy.");
            String registrationDate = chatBotOliver.next();

            System.out.printf("Thank you %s %s. You have registered on %s. %n", name, lastName, registrationDate);

        } else if (answer == 2) {
            System.out.println("Ok, this chat will be closed now.");
            chatBotOliver.close();
        } else {
            System.out.println("Option is not correct. Please try again.");
        }

        System.out.println();
        System.out.println("Want to determine daily calorie intake?");
        System.out.println("Press 1 if you want or 2 to stop chat:");
        byte answer1 = chatBotOliver.nextByte();
        if (answer1 == 1) {
            System.out.println("Press 1 if you are men or 2 if you are woman:");
            byte answer2 = chatBotOliver.nextByte();
            if (answer2 == 1) {
                System.out.println("We need to know how old are you?");
                int ageM = Integer.parseInt(chatBotOliver.next());

                System.out.println("What is your weight?");
                int weightM = Integer.parseInt(chatBotOliver.next());

                System.out.println("How tall are you?");
                int heightM = Integer.parseInt(chatBotOliver.next());

                float bmrMen = (float) (66.5 + (13.75 * weightM) + (5.003 * heightM) - (6.75 * ageM));
                System.out.println("Your basal metabolic rate is " + bmrMen);
            } else if (answer2 == 2){
                System.out.println("We need to know how old are you?");
                int ageW = Integer.parseInt(chatBotOliver.next());

                System.out.println("What is your weight?");
                int weightW = Integer.parseInt(chatBotOliver.next());

                System.out.println("How tall are you?");
                int heightW = Integer.parseInt(chatBotOliver.next());

                float bmrWoman = (float) (655.1 + (9.563 * weightW) + (1.850 * heightW) - (4.676 * ageW));
                System.out.println("Your basal metabolic rate is " + bmrWoman);
            } else {
                System.out.println("Option is not correct. Please try again.");
            }
        } else if (answer1 == 2) {
            System.out.println("Ok,this chat will be closed now.");
        } else {
            System.out.println("Option is not correct. Please try again.");
        }
    }
}
