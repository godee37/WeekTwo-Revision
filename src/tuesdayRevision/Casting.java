package tuesdayRevision;

public class Casting {


  static int x = 10; //widening cast
  static double y = 3.4; //narrowing cast
    static String a = "3";

    /*
    The process of converting the value of one data type (int, float, double, etc.)
     to another data type is known as typecasting.

The major 2 types.

1. Widening Type Casting - going form a smaller to larger

2. Narrowing Type Casting - going from larger to smaller
     */
    public static void main(String[] args) {
//Convert integer 10 to double
        System.out.println((double) x);


// another way to do that.
     double data = x;

        System.out.println(data);
        System.out.println((int) y);
        System.out.println((Integer.parseInt(a)));// Converting a string to integer 0R PRIMITIVE TO
                                                    // NON-PRIMITIVE DATA TYPE, we use the wrapper class

//Changing an integer to a string

        System.out.println(String.valueOf(y)); // Converting a integer to string, we use the wrapper class
    }

/**
@VISIT CASTING IN YOU TUBE VIDEOS
 **/
}
