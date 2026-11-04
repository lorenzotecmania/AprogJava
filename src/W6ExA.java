import java.util.Scanner;

public class W6ExA {

    static Scanner sc = new Scanner(System.in);

//    A - Average of numbers with less than N digits
//    a) Implement a module to determine the number of digits of a given number as a parameter.
//
//    b)Write a program to read a sequence of integers with less than N digits and average these numbers.
//    The value of N must be the first number read.
//
//    The program must first read the maximum number of digits (N) the numbers can have.
//    Then read integers smaller than N.
//    The program ends when a number with more than N digits is entered or when more than K numbers are read.
//
//    The average should be displayed to 2 decimal places.
//
//    Use a constant to define the maximum number of elements that can be read (K = 5).

    final static int MAX_USER_INPUTS = 5;

    public static int countDigits(int number){
        int lengthOfNumber = 0;
        for (int i = number; i > 0; i/=10){
            lengthOfNumber++;
        }
        return lengthOfNumber;
    }

    public static void main(String[] args){

        int firstUserInput = sc.nextInt();
        int lengthOfUserInput = 0;
        int inputCount = 0;
        int sumOfInputs = 0;
        float programOutput = 0;

        while (firstUserInput > lengthOfUserInput && inputCount < MAX_USER_INPUTS){

            int userInput = sc.nextInt();
            lengthOfUserInput = countDigits(userInput);
            if (lengthOfUserInput < firstUserInput) {
                inputCount++;
                sumOfInputs += userInput;
            }
        }
        if (inputCount != 0) programOutput = (float) sumOfInputs/inputCount;
        else programOutput = 0;

        System.out.printf("%.2f%n", programOutput);

    }
}
