package classAssignment;

import java.util.Scanner;
        
//package classAssignment;

public class Assignment1709morning {
    public static void main(String[] args) {
        //ClassActivity1 class = new ClassActivity1();
        Scanner scanName = new Scanner(System.in);

        /*Get the first input*/
        System.out.println("Please enter your first name");

        //Save the first input in name1
        String name1 = scanName.next();

        /*Get the second input*/
        System.out.println("Please enter your last name");

        //Save the second input in name2
        String name2 = scanName.next();

        //combine the names and print
        System.out.println("Dear," + "\n" + "Your full name is " + name1 + " " + name2);
        scanName.close();
    }
}
