package oops;

public class Polymorphism {
    /**
     * Polymorphism is the ability to have multiple methods with the same name or
     * same functionality, but acting on different numbers/types of objects/variables
     * Types of polymorphism
     * 1. - Method overloading (Compile-Time polymorphism)
     * 2. - Method Overriding (Run-Time Polymorphism)
     */
    public static void main(String[] args) {
        printName(); //Calls the first method with no parameters
        printName("Weh");//This call the method with one parameter
        printName("John", "Weh");
        printName(3, "Wuah");

    }

    //Method overloading - it allows users to use method of the same name by having different parameters
    //The only ways to differentiate overloading methods are:
    //  - Number of parameters
    //  - The data types of parameters
    //  - Order of the

    /*
    NOTE THE THE RETURN TYPE OF THE METHOD DO NOT COUNT
     */
    public static void printName() {
        System.out.println("George Odom");
    }

    public static void printName(String firstName) {
        System.out.println(firstName + " John");
    }

    public static void printName(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
}
    public static void printName(int firstName, String lastName){
        String firstName1 = String.valueOf(firstName);
        System.out.println(firstName1 + " " + lastName);
    }
}

