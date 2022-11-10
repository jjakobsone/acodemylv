package lv.acodemy.classroom;

import java.util.Scanner;

public class InteractiveApp {
    public static void main(String[] args) {
        Scanner chatBot = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = chatBot.next();

        System.out.println("What is your last name?");
        String lastName = chatBot.next();

        System.out.printf("Hello %s %s. My name is Bot Alex. How can I help you?%n", name, lastName);

        System.out.printf("Press 1 for registration or press 2 to stop chat%n");
        byte answer = chatBot.nextByte();
        boolean isCorrect = false;
        while (isCorrect == false) {
            if (answer == 1) {
                System.out.printf("Please enter the date in following format : (dd-MM-yyyy)%n");
                String registrationDate = chatBot.next();
                System.out.printf("You've registered on date: " + registrationDate);
                isCorrect = true;
            } else if (answer == 2) {
                System.out.printf("Ok, this chat will be closed now!");
                chatBot.close();
                isCorrect = true;
            } else {
                System.out.println("Option is not correct! Try again!");
                System.out.printf("Press 1 for registration or press 2 to stop chat%n");
                answer = chatBot.nextByte();
            }
        }
    }
}
