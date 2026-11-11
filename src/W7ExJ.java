import java.util.Scanner;

public class W7ExJ {

	static Scanner sc = new Scanner(System.in);

	static final int MIN_INPUT = 3;
	static final int MAX_INPUT = 100;

	public static int calculateTriples(int number){
		int numberOfCombinations = 0;

		for (int a = number - 2; 3 * a >= number; a--) {
			int target = number - a;

			for (int b = target - 1; b >= target - target / 2; b--) {
				int c = target - b;

				if (a >= b) {
					System.out.println(a + " + " + b + " + " + c);
					numberOfCombinations++;
				}
			}
		}

		return numberOfCombinations;
	}

	public static void main(String[] args) {
		int userInput = sc.nextInt();
		System.out.println("triples=" + calculateTriples(userInput));
	}
}