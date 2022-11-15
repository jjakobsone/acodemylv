package lv.acodemy.classroom;

public class Animal {
    public String name;
    public String color;
    public int age;
    public boolean hasBody;

    public String talk;

    public void printAllInfo (){
        System.out.println("Has body: " + hasBody);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Color: " + color);
    }

    public void speak(){
        System.out.println("Mrrrrrr!");
    }

    public void feedAnimal(){
        System.out.println("Amamama");
    }
}
