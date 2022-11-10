package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] ages = {20, 18, 16, 16, 17, 18, 21};
        //array of 7 elements
        //in java counting starts from 0
        //get number 17 by index 4
        System.out.println(ages[4]);
        System.out.println("Size of array: " + ages.length);

        ages[3] = 10;
        System.out.println(ages[3]);

        System.out.println(Arrays.toString(ages));

        String[] dayOfTheWeek = new String[8];
        dayOfTheWeek[0] = "Monday";
        dayOfTheWeek[1] = "Tuesday";
        dayOfTheWeek[2] = "Wednesday";
        dayOfTheWeek[3] = "Thursday";
        dayOfTheWeek[4] = "Friday";
        dayOfTheWeek[5] = "Saturday";
        dayOfTheWeek[6] = "Sunday";

        System.out.println(Arrays.toString(dayOfTheWeek));

        String[] names = {"John", "Alex", "Roman", "Natalija" };
        System.out.println(names[2]);

        String[] stringArray = new String[3];
        System.out.println(Arrays.toString(stringArray));
        stringArray[0] = "1";
        System.out.println(Arrays.toString(stringArray));




    }
}
