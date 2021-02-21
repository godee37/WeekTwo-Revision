package methodPractice;

import java.util.Scanner;

public class Parameterization {

/*
Parameter are the values we pass to methods at the time of creation
Arguments are the values we passed to a method when we call them
 */

    public static void main(String[] args) {


/**Another way to declare variables to take user inputs from the keyboard
 *
 */

Scanner input = new Scanner(System.in);
      int num1; int num2;
        System.out.println("Input the first number ");
        num1 = input.nextInt();
        System.out.println("Input the first number ");
        num2 = input.nextInt();
        System.out.println(doSubstration(num1, num2));

// INSERTING VARIABLES IN THE CODE

        int x = 70;
        int y = 30;

        System.out.println(doAddition(x,y));
        System.out.println(doSubstration(x, y)); //

        System.out.println(doAddition(num1, num2) - doSubstration(x,y));

    }

   public static int doAddition(int num1, int num2){


       int total = num1 + num2;
       return total;


    }

    //Parameters
    public static int doSubstration(int num3, int num4){

        int total1 = num3 - num4;
        return total1;

    }
//    public static int addTotals (){
//        int total2 = doAddition(num1,  num 2)  + doSubstration();
//        return total2;
//    }
}
