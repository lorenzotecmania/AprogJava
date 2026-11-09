import java.util.Scanner;

public class W6ExG {

	static Scanner sc = new Scanner(System.in);

	public static boolean checkIfArmstrong(int number){

		int numberOfDigits = 0;
		int sumOfRaisedDigits = 0;

		for (int i = number; i > 0; i /= 10) numberOfDigits++;

		for (int i = number; i > 0; i /= 10) {

			int digit = i % 10;

			sumOfRaisedDigits += (int) Math.pow(digit,numberOfDigits);
		}


		return (sumOfRaisedDigits == number);
	}

	public static void main (String[] args){

		int userInput = sc.nextInt();

		for (int i = 0; i <= userInput; i++) {

			if (checkIfArmstrong(i)) System.out.println(i);
		}



	}
}
