import java.util.Scanner;

public class W7ExN {
    static Scanner sc = new Scanner(System.in);

    static final int MIN_INPUT = 1;
    static final int MAX_INPUT = (int) Math.pow(10,9);

    public static int calculateSumOfSquares(int number){

		int sumOfSquares = 0;

        for (int i = number; i> 0; i /= 10){
			int digit = i % 10;
			sumOfSquares = (int) (sumOfSquares + Math.pow(digit, 2));
		}
        return sumOfSquares;
    }


    public static void main(String[] args){
		int userInput = -1;
		int sumOfSquares = 0;
		int iterationCounter = 0;

		while (userInput < MIN_INPUT || userInput > MAX_INPUT){
			userInput = sc.nextInt();
		}

		System.out.print(userInput);

		do{
			sumOfSquares = calculateSumOfSquares(userInput);
			System.out.print(" > " + sumOfSquares);
			userInput = sumOfSquares;
			iterationCounter++;
		}while (sumOfSquares > 1);
		System.out.printf("%n");
    }
}
