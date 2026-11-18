import java.util.Scanner;

public class W7ExZ {
	static Scanner sc = new Scanner(System.in);

	public static int getUserInput(){
		int userInput = 0;
		while (userInput < 1) userInput = sc.nextInt();
		return userInput;
	}

	public static void showFullTimePrimesInRange(int userInput1, int userInput2){
		int smallerInput = 0;
		int biggerInput = 0;
		int counter = 0;
		if (userInput2 - userInput1 > 0){
			smallerInput = userInput1;
			biggerInput = userInput2;
		}else{
			smallerInput = userInput2;
			biggerInput = userInput1;
		}
		for (int i = smallerInput; i <= biggerInput; i++){
			if (checkIfFullTimePrime(i)) {
				System.out.println(i);
				counter++;
			}
		}
		System.out.printf("(%d)%n", counter);
	}

	public static boolean checkIfFullTimePrime(int number){
		int lengthOfNumber = 0;
		int digit = 0;
		boolean isFullTimePrime = true;

		for (int i = number; i > 0; i /= 10) lengthOfNumber++;

		for (int i = lengthOfNumber; i > 0 && isFullTimePrime; i--){

			digit = number % 10;
			number = number / 10;
			number = (int) (number + Math.pow(10,lengthOfNumber-1)*digit);
			if (!checkIfPrime(number)) isFullTimePrime = false;
		}

		return isFullTimePrime;
	}
	public static boolean checkIfPrime(int number) {
		if (number < 2) return false;
		if (number == 2) return true;
		if (number % 2 == 0) return false;

		for (int i = 3; i * i <= number; i += 2) {
			if (number % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args){

		showFullTimePrimesInRange(getUserInput(),getUserInput());

	}
}
