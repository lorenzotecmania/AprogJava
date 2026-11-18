import java.util.Scanner;

public class W7ExY {
	static Scanner sc = new Scanner(System.in);

	public static int readPositiveValue(){
		int userInput = -1;

		while (userInput < 1) userInput = sc.nextInt();

		return userInput;
	}

	public static void showTablesInRange (int userInput1, int userInput2){

		int smallerInput = 0;
		int biggerInput = 0;

		if (userInput2 - userInput1 < 0) {
			smallerInput = userInput2;
			biggerInput = userInput1;
		}
		else {
			smallerInput = userInput1;
			biggerInput = userInput2;
		}

		for (int i = smallerInput; i <= biggerInput; i++){

			showTableOfNumber(i);
		}

	}

	public static void showTableOfNumber (int number){

		System.out.printf("Multiplication table of %d%n",number);
		for (int i = 1; i < 11; i++){
			int multiplicationResult = number * i;
			System.out.printf("%d x %d = %d%n", number, i, multiplicationResult);
		}
	}

	public static void main(String[] args){

		showTablesInRange(readPositiveValue(),readPositiveValue());
	}
}
