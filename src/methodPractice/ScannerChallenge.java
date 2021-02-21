package methodPractice;

import java.util.Scanner;

public class ScannerChallenge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstname; String lastname; String sayName;// declare variables for the inputs
        System.out.println("please enter your firstname ");
         firstname = input.nextLine();

        System.out.println("please enter your lastname ");
        lastname = input.nextLine();

     sayName = printFullName(firstname, lastname);
     System.out.println("My Full Name is " + sayName);
/**
 * Calling the second method that makes the code in the main method clean
 */
        System.out.println("This produces a clean method " + printName());
    }
    public static String printFullName(String firstname, String lastname){
       String name = firstname + " " + lastname;
       return name;


    }
/**
 * Another way of writing the same code in a way that makes the main method clean
 * do all the work in the method
 */

static String printName(){

    Scanner input = new Scanner(System.in);

    System.out.println("please enter your firstname ");
    String firstname = input.nextLine();

    System.out.println("please enter your lastname ");
   String lastname = input.nextLine();


return firstname + " " + lastname;
}
}
