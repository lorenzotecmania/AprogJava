import java.util.Scanner;

public class W6ExE {

    static Scanner sc = new Scanner(System.in);

    static int commonDigitsFound = 0;

    public static void commonDigitFinder(int firstNumber, int secondNumber){

        for (int i = firstNumber; i > 0; i /= 10){

            int digitOfFirstNumber = i % 10;

            for (int k = secondNumber; k > 0; k /= 10){

                int digitOfSecondNumber = i % 10;

                if (digitOfFirstNumber == digitOfSecondNumber) commonDigitsFound++;
            }

        }
    }

    public static void printOutput(){
        System.out.println(commonDigitsFound);
    }

    public static void main(String[] args){

        int firstUserInput = sc.nextInt();

        for (int numberOfPairInputs = firstUserInput; numberOfPairInputs > 0; numberOfPairInputs--){

            int userInput1 = sc.nextInt();
            int userInput2 = sc.nextInt();

            commonDigitFinder(userInput1,userInput2);

            printOutput();

        }


    }
}
