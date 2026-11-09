import java.util.Scanner;

public class W6ExH {
	static Scanner sc = new Scanner(System.in);

	static final int MAX_USER_INPUTS = 5;

	public static boolean checkIfPalindrome(int number){

		int numberBackwards = 0;
		for (int i = number; i > 0; i /= 10) {
			int digit = i % 10;
			numberBackwards = (numberBackwards * 10) + digit;
		}

		return (number == 0 || number == numberBackwards);
	}

	public static void main (String[] args){

		int inputCounter = 0;
		boolean palindromeFound = false;

		while(MAX_USER_INPUTS > inputCounter && !palindromeFound) {
			int userInput = sc.nextInt();
			inputCounter++;
			if (checkIfPalindrome(userInput)) {
				System.out.println("palindrome");
				palindromeFound = true;
			}
		}
		if (!palindromeFound) System.out.println("attempts exceeded");
	}
}
