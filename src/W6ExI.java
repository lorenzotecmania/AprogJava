import java.util.Scanner;

public class W6ExI {
	static Scanner sc = new Scanner(System.in);

	public static boolean checkIfFibonacci(int number){

		int lastNumber = 1;
		int lastLastNumber = 0;

		for (int i = 0; i <= number; i++){
			if (i == lastLastNumber + lastNumber && i == number) return true;
			else if (i == lastLastNumber + lastNumber) {lastLastNumber = lastNumber; lastNumber = i;}

		}
		return false;
	}

	public static void main (String[] args){

		int userInput = sc.nextInt();
		if (checkIfFibonacci(userInput)) System.out.println("is a Fibonacci number");
		else System.out.println("is not a Fibonacci number");

	}
}
