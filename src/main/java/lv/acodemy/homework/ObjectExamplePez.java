package lv.acodemy.homework;

public class ObjectExamplePez {
    public static void main(String[] args) {

        PezDispenser spiderMan = new PezDispenser("Spider-Man", "Red-blue-white", "Marvel", 20);
        spiderMan.printAllInfo();

        spiderMan.getCandies();
        System.out.printf("Now in your PEZ is %s candies. %n", spiderMan.getNumberOfCandies());

        int times = 5;
        while (times > 0){
            System.out.println("You can take candies");
            times-=5;
        }

    }
}

