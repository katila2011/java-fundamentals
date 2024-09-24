package classAssignment;
import java.util.Scanner;


public class Assignment1709afternoon {
    public static void main(String[] args) {
       //Third class activity afternoon
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter your first name pls");
        String first = scanName.next();
        int length1 = first.length();
        System.out.println("Enter your second name pls");
        String sur = scanName.next();
        int length2 = sur.length();
        //Integer lenghtMain = Integer.valueof()
        //String c = String.valueof(
        boolean less = length2 < length1;
        System.out.println(String.valueOf(less));

    }
}

 /* Second class activity afternoon
        Scanner scanName = new Scanner(System.in);
        System.out.println("First number pls");
        double a = scanName.nextDouble();
        System.out.println("Second number pls");
        double b = scanName.nextDouble();
        String c = "correct";
        String d = "incorrect";
        String less = (a<b)? c:d;
        System.out.println(less);
        */




//Scanner scanName = new Scanner(System.in);
//        System.out.println("Pls input any whole number of your choice");
//double first = scanName.nextDouble();
//        System.out.println("Pls input another whole number of your choice");
//double second = scanName.nextDouble();
//        System.out.println("Below are the results:");
//        System.out.println("First number" + " x Second number = " + first*second);
//        System.out.println("First number" + " / Second number = " + first/second);
//        System.out.println("First number" + " + Second number = " + (first+second));
//        System.out.println("First number" + " + Second number = " + (first-second));
//        System.out.println("The modular division is:" + first%second);