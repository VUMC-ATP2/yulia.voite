package classroom;

import java.util.concurrent.BlockingDeque;

public class MyFirstJavaCode {
    public static void main(String[] args) {

        //one line comment

        /*
        multi line comment
        Is the extremely good approach
        How to write a lot of comments
         */

        //byte data type
        byte floorCount = 7;
        System.out.println("My house has " + floorCount + " floors");
        System.out.printf("My house has %d floors\n", floorCount);

        // %d - numbers
        // %s - text/string
        // %b - boolean

        short salaryInEur = 1000;
        System.out.println(salaryInEur);
        System.out.println(1200);

        System.out.printf("Average salary for junior QA engineer is: %d\n", salaryInEur);

        int chinaPopulation = 1449687399;
        long currenrWorldPopulation = 794609700;
        System.out.printf("Current world population: %d people. In meanwhile China population: %d people\n", currenrWorldPopulation, chinaPopulation);

        // Floating numbers
        float myCurrentWeight = 51.5f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.83445d;
        System.out.println(gasPriceInEur);

        // Primitive text (char)
        char firstLetterOfMyName = 'Y';

        // Non-primitive String
        String myName = "Yulia";
        System.out.println(myName);

        String mySentence = "Hello, my name is Yulia. I'm 32 yeras old.";
        String mySecondSentence = "I live in Jurmala";
        System.out.println(mySentence);
        System.out.println(mySentence + mySecondSentence);
        System.out.println(mySentence + " " + mySecondSentence);

        System.out.printf("%s %s\n", mySentence, mySecondSentence);

        double residentCount = 13.0;
        System.out.printf("There are %.1f people living in my house\n", residentCount);

        // boolean
        // is / has
        // isSummer , hasItems

        boolean isSummer = false;
        boolean isSpring = true;
        System.out.println(isSpring);
        System.out.println(isSummer);

        if (isSummer) {
            System.out.println("Yes, it is Summer");
        } else {
            System.out.println("No, it os not Summer");
        }

        // Arithmetic operators + - / *
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
        int x = b + 15;
        System.out.println(x);

        System.out.println(7 + 7); // 14
        System.out.println("7" + 7); // 77
        System.out.println("7" + "7"); // 77

        boolean isAGreaterThanB = a > b; // 10 > 20
        boolean isASmallerThanB = a < b; // 10 < 20

        boolean isTrue = a != b;
        System.out.println(isTrue);
    }
}
