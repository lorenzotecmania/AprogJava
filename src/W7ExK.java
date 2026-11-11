import java.util.Scanner;

public class W7ExK {
	static Scanner sc = new Scanner(System.in);

	static final int MIN_ROLL = 1;
	static final int MAX_ROLL = 6;

	public static int calculatePlayerScore(int userInput){
		int score = 0;
		int lastRoll = 0;
		int reversedInput = 0;

		for (int i = userInput; i > 0; i /= 10){
			reversedInput = reversedInput*10 + (i % 10);
		}

		for (int i = reversedInput; i > 0; i /= 10){

			int roll = i % 10;


			if (roll != lastRoll) score += roll; else { score = -Math.abs(score); score -= roll; }

			lastRoll = roll;
		}

		return score;
	}

	public static void main (String[] args){

		int userInput = sc.nextInt();

		System.out.println("points=" + calculatePlayerScore(userInput));

	}
}
