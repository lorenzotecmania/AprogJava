import java.awt.*;
import java.util.Scanner;

public class ExH {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput1 = sc.nextInt();
        int userInput2 = sc.nextInt();
        int programOutput = 0;
        boolean lcmFound = false;


        while(! lcmFound) {
            int potential_lcm = 1;
            potential_lcm++;
            if (potential_lcm == 0 && userInput2 % potential_lcm == 0){
                programOutput = potential_lcm;
                lcmFound = true;
            }
        }
        System.out.println(programOutput);
    }
}