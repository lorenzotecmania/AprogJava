import java.util.Scanner;

public class W6ExJ {

	static Scanner sc = new Scanner(System.in);

	static final int MIN_INPUT = 3;
	static final int MAX_INPUT = 100;


	public static int calculateTriples(int number){

		for (int first = number-1, second = 1 ; first >= number/2 && second <= number/2; first--, second++){
			System.out.println(first + "+" + second);
		}
		return 5;
	}

	public static void main(String[] args) {

		int userInput = sc.nextInt();
		int x = calculateTriples(userInput);
	}
}