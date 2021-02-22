package oops;

public class ConstructorPractice {

    /**
     * Constructors are implicitly defined in every class by default (default constructors)
     * Constructors are used when creating instances (object) of a class
     * "this" keyword is used when you a  assign a value to global variable through a constructor or setter
     */

    //the default constructor
    public ConstructorPractice(String vehicleType) {
        this.vehicleType = vehicleType;
        System.out.println("This is a " + vehicleType);
    }

        String vehicleType;
        String vehicleManufacturer;
        String vehicleModel;
        int numDoor;

/** Overloaded constructed
 *
 */

public ConstructorPractice(String vehicleType, String vehicleManufacturer){
    this.vehicleType = vehicleType;
    this.vehicleManufacturer = vehicleManufacturer;
    System.out.println("This " + vehicleType + " is made by " + vehicleManufacturer + "\n");
}

        }



