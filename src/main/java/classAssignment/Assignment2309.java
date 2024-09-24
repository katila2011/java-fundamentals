package classAssignment;
import java.util.Scanner;

public class Assignment2309 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your mother's maiden name");
        String maidenName = scanner.nextLine();
        String maidenName1 = maidenName.toUpperCase();
        int numVowels = maidenName1.length();
        String reverse = "";

        for (int i = maidenName1.length() - 1; i >= 0; i--) {
            reverse = reverse + maidenName1.charAt(i);
        }
        System.out.println("The reverse of your maiden name is " + reverse);
        if (!reverse.equals(maidenName)){
            System.out.println("Your mother's maiden name is not a palindrome");
        }
        else{
            System.out.println(reverse);
        }
    }
}
