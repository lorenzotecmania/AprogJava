import java.util.Scanner;

public class W8ExD {
	static Scanner sc = new Scanner(System.in);

	final static int MIN_GRADE = 0;
	final static int MAX_GRADE = 20;

	public static int readNonNegativeInput() {
		int input;
		do input = sc.nextInt();
		while (input < 0);
		return input;
	}

	public static int[] makeGradesArray(int size){
		int[] intArray = new int[size];
		for (int index = 0; index < size; index++){
			do intArray[index] = readNonNegativeInput();
			while (intArray[index] > MAX_GRADE);
		}
		return  intArray;
	}

	public static int findValueInArray(int[] array, int value){
		int numberOfOccurrences = 0;
		for (int grade : array) {
			if (grade == value) numberOfOccurrences++;
		}
		return numberOfOccurrences;
	}

	public static void printOutput(int[] gradesArray){
		for (int grade = MIN_GRADE; grade <= MAX_GRADE; grade++){
			System.out.printf("%d %d%n", grade, findValueInArray(gradesArray,grade));
		}
	}

	public static void main(String[] args){
		int numberOfInputs = readNonNegativeInput();
		int[] gradesArray = makeGradesArray(numberOfInputs);
		printOutput(gradesArray);
	}
}
