import java.util.Scanner;

public class W6ExE {

    static Scanner sc = new Scanner(System.in);

	final static int MIN_INPUT = 0;

    public static int commonDigitFinder(int firstNumber, int secondNumber){

		int commonDigitsFound = 0;

        for (int i = firstNumber, k = secondNumber; i > 0 && k > 0; i /= 10,k /= 10){

            int digitOfFirstNumber = i % 10;

			int digitOfSecondNumber = k % 10;

			if (digitOfFirstNumber == digitOfSecondNumber) commonDigitsFound++;
        }
		return commonDigitsFound;
    }

	public static boolean validateFirstUserInput(int firstUserInput){
		return firstUserInput >= MIN_INPUT;
	}

    public static void printOutput(int number1, int number2, int maxNumberOfDigitsFound){
        if (maxNumberOfDigitsFound > 0) System.out.println(number1 + "/" + number2);
		else System.out.println("no results");
    }

    public static void main(String[] args){

		int firstUserInput = -1;
		int numberOfDigitsFound = 0;
		int maxNumberOfDigitsFound = 0;
		int maxNumber1 = 0;
		int maxNumber2 = 0;


		while (!validateFirstUserInput(firstUserInput)){
			// fica a meu criterio o que fazer com um input inválido,
			// acho que faz tanto sentido pedir o input outra vez quanto fechar o programa,
			// uma das duas será

			firstUserInput = sc.nextInt();
		}

        for (int numberOfPairInputs = firstUserInput; numberOfPairInputs > 0; numberOfPairInputs--){

            int userInput1 = sc.nextInt();
            int userInput2 = sc.nextInt();

            numberOfDigitsFound = commonDigitFinder(userInput1,userInput2);

			if (numberOfDigitsFound >= maxNumberOfDigitsFound) {

				maxNumberOfDigitsFound = numberOfDigitsFound;

				maxNumber1 = userInput1;

				maxNumber2 = userInput2;


			}
        }

		printOutput(maxNumber1,maxNumber2, maxNumberOfDigitsFound);
    }
}
