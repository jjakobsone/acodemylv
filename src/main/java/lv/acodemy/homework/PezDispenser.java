package lv.acodemy.homework;

public class PezDispenser {
    private String name;
    private String color;
    private String series;
    private int maxNumberOfCandies = 12;
    private int currentAmountOfCandies;




    public void printAllInfo (){
        System.out.println("PEZ name: " + name);
        System.out.println("PEZ color: " + color);
        System.out.println("PEZ series: " + series);
        System.out.println("The maximum number of candies: " + maxNumberOfCandies);
    }

    public PezDispenser(String name, String color, String series) {
        this.name = name;
        this.color = color;
        this.series = series;
    }

    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getSeries() {
        return series;
    }
    public int getCurrentAmountOfCandies() {
        return currentAmountOfCandies;
    }

    public void giveCandie(){
        if (maxNumberOfCandies > 0){
            System.out.println("You can take one candie.");
            maxNumberOfCandies--;
            maxNumberOfCandies = maxNumberOfCandies;
            System.out.println("Now in your PEZ is " + maxNumberOfCandies + " candies.");
        } else {
            System.out.println("Your PEZ don't have anymore candies.");
        }
    }

    public void giveCandie(int giveAmountCandies){
        if (giveAmountCandies > 0 && giveAmountCandies <=12){
            System.out.printf("You can take %s candies. %n", giveAmountCandies);
            maxNumberOfCandies -= giveAmountCandies;
        } else {
            System.out.println("Your PEZ don't have anymore candies.");
        }
    }



    public void uploadCandie(){
        if(currentAmountOfCandies < 12){
            System.out.println("You can upload one candie.");
            currentAmountOfCandies++;
        } else {
            System.out.println("You can't upload your PEZ, because it is full.");
        }
    }

    public void uploadCandie(int giveAmountCandies){
        if (giveAmountCandies < 12){
            System.out.printf("You can take %s candies. %n", giveAmountCandies);
            maxNumberOfCandies -= giveAmountCandies;
        } else {
            System.out.println("Your PEZ don't have anymore candies.");
        }
    }


//   public void walk() {
//        if (energy <= 0) {
//            System.out.println("Not enough energy to walk!");
//        } else {
//            System.out.println("Walking...");
//            energy--;
//        }
//    }
}

