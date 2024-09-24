package classAssignment;
import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        Random randGen1 = new Random();  //Generating random number
        int randGen2 = randGen1.nextInt(100)+1;
        //System.out.println(randGen1);
        /*Scanner scanAns = new Scanner(System.in);  //Declaring scanner as object
    for (int loopCount = 0;loopCount<3;loopCount++){
    if (loopCount == 2){  //Getting input from user
            System.out.println("Last trial!");
    }
        System.out.println("Which number did the system generate? (hint: pick between 1 and 100. 3 trials permitted)");
        int input = scanAns.nextInt();
    if (input == randGen2) {
        System.out.println("Congratulations, you got it right!");
        break;
    }
    else if (input >= randGen2+10){
        System.out.println("Value too high");
    }
    else if (input <= (randGen2-10)){
        System.out.println("Value too low");
    }
    else if((input!=randGen2)&&(loopCount==2)){
        System.out.println("Sorry, trials exhausted");
        continue;
    }
    }
    scanAns.close();*/
    }
}
