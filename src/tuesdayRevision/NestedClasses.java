package tuesdayRevision;

public class NestedClasses {


    String studentName = "George"; // this is different from any variable of the sane name, because it a new instance of a class

/*"
creating class within class
Inner class are classes that are declared within a class
******* Inner classes are meant to be accessed by the parent classes ********
 */


    public static class InnerClass {
        String studentName = "John"; // this is different from the one up because it a new instance of a class

    }
}
