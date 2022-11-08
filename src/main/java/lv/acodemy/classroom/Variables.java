package lv.acodemy.classroom;

public class Variables {
    public static void main(String[] args) {

        // Line comment
        //sout = sstem

        /*
        Hello World!
        My name is Julija
        */

        // byte
        byte byteVariable = 120;
        System.out.println(byteVariable);

        //short
        short salary = 2000;
        System.out.println(salary);

        //char
        char letterA = 'A';
        System.out.println(letterA);

        //int
        int populationInLatvia = 2000000;
        System.out.println(populationInLatvia);

        // integer min and max values
        int minIntValue = Integer.MIN_VALUE;
        System.out.println(minIntValue);

        int maxIntValue = Integer.MAX_VALUE;
        System.out.println(maxIntValue);

        //float
        float stockPrice = 5000.50f;
        System.out.println(stockPrice);

        //long
        long coronavirusCases = 6326589L;
        System.out.println(coronavirusCases);

        //double
        double twittersPriceInEur = 28659.54;
        System.out.println(twittersPriceInEur);

        //boolean prefix_ is or has
        boolean isSummer = false;
        boolean isAutumn = true;
        boolean hasValue = true;
        System.out.println(isAutumn);

        String name = "Julija";
        System.out.println(name);

        String surname ="Jakobsone";
        System.out.println(surname);
        System.out.println(name+ " " + surname);

        // %s - for text
        // %d - for numbers

        String fullName = String.format("Hello %s. I guess your surrname is %s", name, surname);
        System.out.println(fullName);

        int number = 1992;
        System.out.println("My name is " + name + "." + "I was born in " + number);

        //pos4itaet
        System.out.println(10+40);

        //pokazhet tolko tekst
        System.out.println("Summ:"+ "10+40");

        //rezultat s4itaem zaranee
        int res = 10+40;
        System.out.println("Summ: "+ res);


    }
}
