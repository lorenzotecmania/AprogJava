
import java.util.Scanner;

public class ExI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput1 = sc.nextInt();
        int userInput2 = sc.nextInt();
        int programOutput = 0;
        boolean lcmFound = false;
        int potential_lcm = 1;

        while(! lcmFound) {
            potential_lcm++;
            if (potential_lcm % userInput1 == 0 && potential_lcm % userInput2== 0){
                programOutput = potential_lcm;
                lcmFound = true;
            }
        }
        System.out.println(programOutput);
    }
}