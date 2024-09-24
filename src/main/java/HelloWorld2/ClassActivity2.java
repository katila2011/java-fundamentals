package HelloWorld2;
import java.util.Scanner;

public class ClassActivity2 {
    public static void getName() {
Scanner scanName = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = scanName.next();
        System.out.println("Please enter your second name");
        String secondName = scanName.next();
        String fullName = firstName + " " + secondName;
        scanName.close();
        System.out.println(fullName);
    }

    public static void main(String[] args) {
        getName();
    }




//    public void DisplayName(){
////        String p = GetName.fullName();
//        System.out.println (getName());
//    }
}



//String fullName = ClassActivity2.next();
//ClassActivity2  = new ClassActivity2;
//ClassActivity2.Demo();

/*Do this later
int n = 5;
        for (int sumloop = 1;sumloop<n;sumloop++){
            int sumfinal = n+sumloop;
            //System.out.println(sumloop);
            System.out.println(sumfinal);
        }
 */


/*for (int loopvar = 10;loopvar>=0;loopvar--){
            System.out.println(loopvar);*/