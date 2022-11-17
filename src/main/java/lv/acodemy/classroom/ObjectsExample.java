package lv.acodemy.classroom;

public class ObjectsExample {
    public static void main(String[] args) {

        Animal catBarsik = new Animal("Barsik", "gray", 0, true);
        catBarsik.printAllInfo();

        Animal dogRex = new Animal();

//        System.out.println();
//
//        catBarsik.name = "Barsik";
//        catBarsik.printAllInfo();
//
//        System.out.println();
//
//        catBarsik.hasBody = true;
//        catBarsik.color = "gray";
//        catBarsik.age = 5;
//        catBarsik.printAllInfo();

        //nau4itj objekt govoritj

        catBarsik.speak();

//        catBarsik.feed();

        for (int i = 0; i < 5; i++)
            catBarsik.walk();


        int times = 5;
        while (times > 0){
            catBarsik.feed();
            times--;
        }

        System.out.println("Energy: " + catBarsik.getEnergy());

        catBarsik.setAge(1);
        catBarsik.setAge(2);
        System.out.println(catBarsik.getAge());



    //create method play () - (minus 2 energy)
    //zovem igratj, esl ne hvataet energii to pokormi menja

        catBarsik.play();
        catBarsik.play();
        catBarsik.play();
        catBarsik.feed();
        catBarsik.play();
        catBarsik.feed();
        catBarsik.play();



    }

}
