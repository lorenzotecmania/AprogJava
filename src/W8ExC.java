import java.util.Scanner;

public class W8ExC {
	static Scanner sc = new Scanner(System.in);

	public static int readNonNegativeInput(){
		int userInput = sc.nextInt();
		while (userInput < 0) userInput = sc.nextInt();
		return userInput;
	}
	public static int[] getInputArray(int numberOfInputs){
		int[] userInputArray = new int[numberOfInputs];
		for (int index = 0; index < numberOfInputs; index++){
			userInputArray[index] = readNonNegativeInput();
		}
		return userInputArray;
	}
	public static boolean isArraySequenceAscending(int[] userInputArray){
		int lastInput = userInputArray[0];
		for (int index = 1; index < userInputArray.length; index++){
			if (userInputArray[index] <= lastInput) return false;
			lastInput = userInputArray[index];
		}
		return true;
	}
	public static void printOutput(boolean isArraySequenceAscending){
		System.out.printf("always ascending = %b%n",isArraySequenceAscending);
	}
	public static void main(String[] args){
		int numberOfInputs = readNonNegativeInput();
		int[] inputs =  getInputArray(numberOfInputs);
		if (inputs.length > 0) printOutput(isArraySequenceAscending(inputs));
	}
}
