package dataStructure;

import java.util.Locale;

public class OperatorAndExpressions {


    public static void main(String[] args) {


        //Assignment Operators

        int x = 10;


        x += 1; //(10 + 1 )
        System.out.println(x);

        x -= 1; //(11 - 1)
        System.out.println(x);

        x *= 3; //(x = 10 * 3)
        System.out.println(x);

        x /= 3; //(x =30/3)
        System.out.println(x);


        // Comparison Operators
        // ==, !=, <, >, <=, >=, (They are used to compare only numerical values)
        x = 10;
        int y = 10;
        System.out.println(x == y);//This will print a boolean = True
        System.out.println(x != y);//This will print a boolean = False

        //Comparing Strings
        String name = "George";
        String lastname = "George";
        System.out.println(name.equals(lastname));

        String firstname = "George";
        String lastname1 = "george";
        System.out.println("Comparing case sensitive strings " + firstname.equals(lastname1));

        System.out.println(firstname.toLowerCase());//  converting everything into lowercase

/**
 * LOGICAL OPERATORS
 */
        int a = 10;
        int b = 15;
        int c = 19;
        int d = 10;

/*
Control flows
    - Conditional
    Loops
 */


        //condition
     if (a == b) ; {
            System.out.println(a + " is equal to " +  "\n");
        }
            System.out.println(a + "is not equal to " + b);






    }
}