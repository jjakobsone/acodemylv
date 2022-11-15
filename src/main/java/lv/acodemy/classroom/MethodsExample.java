package lv.acodemy.classroom;

public class MethodsExample {
    public static void main(String[] args) {
    printMyFullName();
    printMyFullName("John", "Doe");
    //printMyFullName ("Johm", "Doe");

//        String name = "john";
//        printMyFullName(name,lastname)

//        informationAboutMe("Julija", "Jakobsone", 30);

        String name = "Julija";
        String lastName = "Jakobsone";
        int age = 30;
        informationAboutMe(name, lastName, age);

        //print in method
        System.out.println(sum(10,20));

        int twoNumberSum = sum(50, 60);
        System.out.println(twoNumberSum);

        System.out.println(pow(4));

        //metodi v cikle
        for (int i=0; i<3; i++){
            printMyFullName("Max", "Payne");
        }

    }
    public static void printMyFullName() {
        System.out.println();
    }

    public static void printMyFullName (String name, String lastName){
        System.out.println(name + " " + lastName);
    }

    //Method overloading

    //sozdatj metod print information about you
    //method asks for name, last name,

    public static void informationAboutMe(String name, String lastName, int age){
//        System.out.println(name + " " + lastName + " " + age);
        System.out.printf("My name is %s. My last name is %s. I am %s years old. %n", name, lastName, age);
    }

    //metod kotorij vozvra6aet summu 2 4isel
    public static int sum(int x, int y){
        return x + y;
    }

    //metod vozvodit v kvadrat - method that squares the number
    public static int pow(int number) {
        return number * number;
    }

    //metod kotorij vernet boonean (true false)
    //metod prinimaet slovo
    //proverjaet slovo
    //polidrone - civic, kayak
    //string word = "";
    //ciklom zapisivatj slovo c i v i k
    //charAt (i); charAt(4);
    //..lenght
    //return ... equals ();

//imja familiju vozrast stolko skolko podam v metode


}
