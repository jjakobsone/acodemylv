package lv.acodemy.homework;

public class PezDispenser {
    private String name;
    private String color;
    private String series;
    private int numberOfCandies = 20;


    public void printAllInfo (){
        System.out.println("PEZ name: " + name);
        System.out.println("PEZ color: " + color);
        System.out.println("PEZ series: " + series);
        System.out.println("The maximum number of candies: " + numberOfCandies);
    }

    public PezDispenser(String name, String color, String series, int numberOfCandies) {
        this.name = name;
        this.color = color;
        this.series = series;
        this.numberOfCandies = numberOfCandies;
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

    public int getNumberOfCandies() {
        return numberOfCandies;
    }

    public void getCandies(){
        if (numberOfCandies <= 0){
            System.out.println("Your PEZ don't have anymore candies");
        } else {
            System.out.println("You can take one candie.");
            numberOfCandies--;
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

}
