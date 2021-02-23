package dataStructure;

public class LearnArrays {

    /*
    Data structure is how data is organized
    Array - That is how data is stored in memory
     */

    public static void main(String[] args) {
        //Declare an array
        String[] arraysOfNames;
        arraysOfNames = new String[4];

        arraysOfNames[0] = "John";
        arraysOfNames[1] = "Fish";
        arraysOfNames[2] = "George";
        arraysOfNames[3] = "Dede";

        //we access data by the index
        System.out.println(arraysOfNames[0]);
//        System.out.println(arraysOfNames[1]);
//        System.out.println(arraysOfNames[2]);
//        System.out.println(arraysOfNames[3]);

        //Another way of declaring an array
        String[] arraysOfName2 = new String[4];
        arraysOfName2[0] = "Gary";
        arraysOfName2[1] = "Addo";
        arraysOfName2[2] = "Willy";
        arraysOfName2[3] = "Addae";

        //Third way to declare arrays
        String[] arrayOfName3 = {"Sacks", "Hammer", "Dan", "Phil", "Doo"};

        System.out.println("The index of arrayOfName3 b4 change is  " + arrayOfName3[1]);
        //Changing index of name
        arraysOfName2 [1] = "John";
        System.out.println("\nThe index of arrayOfName3 after change is  " + arrayOfName3[1]);


     }

}
