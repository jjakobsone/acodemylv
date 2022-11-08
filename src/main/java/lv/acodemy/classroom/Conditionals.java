package lv.acodemy.classroom;

public class Conditionals {
    public static void main(String[] args) {
        //Operator: IF
        //boolean: true/false
        //5>2 (true)
        //10<1 (false)
        if(1 < 2) {
            System.out.println("Yes 1 < 2");
        }

        if(10 < 1) {
            System.out.println("Hello World!");
        }

        //boolean
        boolean isNikitaToxic = false;
        if(isNikitaToxic){
            System.out.println("Spank him!");
        }

        //String example
        String myCity = "Riga";
        if(myCity.equals("Riga")){
            System.out.println("Yes, city is Riga!");
        }

        //call methods
        //create variables
        //create new objects

        if (myCity.contains("Rig")){
            System.out.println("Yes, city is Riga!");
        }

        String name = "Julija";
        if (!name.equals("Nikita")){
            System.out.println(name + " is not Nikita, so it can be registered");
        }

        //if-else
        int age = 24;
        if(age <18){
            System.out.println("Please come later!");
        } else {
            System.out.println("You can by everything you want! Your age is \" + age");
        }

        //<= less or equals
        //=> more or equals

        //if - else - if - else

        //curentTime<=11 && currentTime >6 -> good morning;
        //currentTime >11 & currentTime <17 -> good day!

        // && means AND (true/false)
        // || means OR (should be least one true in order to return true)

        int currentTime =17;
        if(currentTime <=11 && currentTime >=6) {
            System.out.println("Good morning!");
        } else if (currentTime > 11 && currentTime <= 17){
            System.out.println("Good day!");
        } else if (currentTime>17 && currentTime <= 24){
            System.out.println("Good evening!");
        } else if (currentTime >=0 && currentTime < 6){
            System.out.println("Good Night!");
        } else {
            System.out.println("Current time is not correct! " + currentTime);
        }





    }
}
