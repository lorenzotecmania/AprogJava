import java.util.Arrays;
import java.util.Scanner;

public class W8ExB {
	static Scanner sc = new Scanner(System.in);

	static final int MAX_USER_INPUTS = 100;

	public static int[] getUserInput(){
		int[] userInputs = new int[MAX_USER_INPUTS];
		int arrayPos = 0;
		int userInput = sc.nextInt();
		while (userInput >= 0 && arrayPos < userInputs.length) {
			userInputs[arrayPos] = userInput;
			arrayPos++;
			userInput = sc.nextInt();
		}
		return Arrays.copyOf(userInputs, arrayPos);
	}

	public static int calculateMinInput(int[] userInputs){
		int smallest = userInputs[0];
		for (int input : userInputs){

			if (input < smallest) smallest = input;
		}
		return smallest;
	}

	public static int findMinInputOccurrences(int[] userInputs, int smallestInput){
		int pos = 0;
		int occurrencesCounter = 0;
		while (pos < userInputs.length){
			if (userInputs[pos] == smallestInput){
				occurrencesCounter++;
			}
			pos++;
		}
		return occurrencesCounter;
	}

	public static void printOutput(int minInput, int minInputOccurrences){

		System.out.printf("min=%d%noccurrences=%d%n", minInput, minInputOccurrences);
	}

	public static void main(String[] args){
		int[] userInputs = getUserInput();

		if (userInputs.length > 0){
			int minInput = calculateMinInput(userInputs);
			int minInputOccurrences = findMinInputOccurrences(userInputs,minInput);
			printOutput(minInput,minInputOccurrences);
		}
	}

}
