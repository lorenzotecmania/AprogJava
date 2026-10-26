import java.awt.*;
import java.util.Scanner;

//    N - Ascending Sequences
//    Build a program to read a set of positive integers and see which ones fall into an ascending sequence.
//    Reading ends when a negative number is entered.
//    A number belongs to an ascending sequence if it is greater than the previous number and its digits are presented in ascending order from left to right.
//
//    Each number should appear on a separate line.

public class ExN {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int lastUserInput = -1;
        StringBuilder outputStorage = new StringBuilder();

        while(run){

            int userInput = sc.nextInt();
            if (userInput < 0 ){ run = false;}

            boolean orderedDigits = true;
            int lastDigit = 10;

            for (int k = userInput; k > 0; k/= 10){
                int digit = k % 10;
                if (digit >= lastDigit){orderedDigits = false;}
                //System.out.println(lastDigit);
                lastDigit = digit;
            }
            if (userInput > lastUserInput && orderedDigits && lastUserInput != -1){
                outputStorage.append(userInput).append("\n");
            }
            //System.out.println(orderedDigits);
            lastUserInput = userInput;
        }
        System.out.print(outputStorage.toString());
    }
}
