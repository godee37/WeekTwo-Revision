package oops;

public class LearnOOP {

    //main method
    public static void main(String[] args) {
        String x = "4";
        String y = "6";

        System.out.println(goAddition(x,y));
    }
    public static int goAddition(String num1, String num2){

        //casting within methods
        int firstnumber = Integer.parseInt(num1);
        int secondnumber = Integer.parseInt(num2);

       return firstnumber + secondnumber;
    }
}
