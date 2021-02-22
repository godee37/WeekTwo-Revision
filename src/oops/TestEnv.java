package oops;

public class TestEnv {

    /**
     *
      * When a constructor receives a parameter it forces the user to pass an argument
     * It is way to write simple clean code without creating the several instances of a class.
     */



/*
Testing Encapsulation
 */
    public static void main(String[] args) {
        Encapsulation test = new Encapsulation();

        System.out.println(test.getFirstname());// the GET method allow users to access class variable but can't change it

        test.setFirstname("Dede");// set method allow to set the variable FirstName to a different name
        System.out.println(test.getFirstname());

        /**
        Testing constructors
        "this" keyword is used when you a  assign a value to global variable through a constructor or setter
         */
        ConstructorPractice car = new ConstructorPractice("Motor bicycle");
        ConstructorPractice truck = new ConstructorPractice("Heavy Duty Vehicle", "DAWOO");

//We can change the variables in the ConstructorPractice class to prevent users from change the variables we want to chang
        //Also we can access the private variables of a class by using getters ans setters to manipulate them

        car.vehicleManufacturer = "honda";
        car.vehicleModel = "RAV4";
        truck.vehicleType = "Suzziki";
        truck.vehicleModel = "Construction";

        System.out.println(car.vehicleManufacturer);
        System.out.println(car.vehicleModel);

        //practicing overloading constructor with different parameters but the same name.

        System.out.println("Truck Objects\n ++++++++++++++++++++++++++");
        System.out.println(truck.vehicleType);
        System.out.println(truck.vehicleManufacturer);
        System.out.println(truck.vehicleModel);



    }


}
