package lv.acodemy.classroom;

public class Animal {

    //Constructor


    private String name;
    private String color;
    private int age;
    private boolean hasBody;
    private int energy = 4;

    public Animal(String name, String color, int age, boolean hasBody) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.hasBody = hasBody;
    }



    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //age ne ravno 0 i ne bolse 25
        if(this.age == age) {
            System.out.println("Same age provided, please try another one");
        } else if (age > 0 && age <=25){
            this.age = age;
            System.out.println("Age now is: " + age);
        } else {
            System.out.println("Can't set age");
        }
    }

    public boolean hasBody() {
        return hasBody;
    }

    public int getEnergy() {
        return energy;
    }

    //    public String talk;


    public void printAllInfo() {
        System.out.println("Has body: " + hasBody());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Color: " + getColor());
    }

    public void speak() {
        System.out.println("Mrrrrrr!");
    }

    public void feedAnimal() {

        System.out.println("Amamama");
    }

    public void walk() {
        if (energy <= 0) {
            System.out.println("Not enough energy to walk!");
        } else {
            System.out.println("Walking...");
            energy--;
        }
    }

    //metod pokormitj

    public void feed(){
        if (energy < 4){
            energy++;
            System.out.println("Om-nom-nom");
        } else {
            System.out.println("Can't eat because i am full");
        }
    }

    public void play (){
        if (energy < 2){
            System.out.println("U menja netu energii. Pokormi menja.");
        } else {
            energy -= 2;
            System.out.println("Let's get play");
        }
    }
}
