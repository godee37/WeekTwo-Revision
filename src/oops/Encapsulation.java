package oops;

public class Encapsulation {

    private String firstname = "George";
    private String secondname = "Odom";
    private int age = 21;
    private long ssn = 123456789;

    /*
    This class is private and we can access it using getters and setters
     */

    //This will be tested in the TestEnv

    //Create get method to allow classes within the same package to access
    //Create a method that allows user to access the variable
    //But users cannot change the variables

    public String getFirstname() {
        return firstname;
    }
//Getter - allow access to a private variables of a class
    public String getSecondname() {
        return secondname;
    }

    //creating a method that allows users to change private variables of a class.
//Setter
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

//"this" keyword is used when you a  assign a value to global variable through a constructor or setter

}
