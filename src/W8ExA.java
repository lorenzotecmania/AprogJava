import java.util.Scanner;

public class W8ExA {
	static Scanner sc = new Scanner(System.in);

	public static double getUserInput (boolean firstInput){
		double userInput = -1;
		if (firstInput)
			while (userInput < 0) userInput = sc.nextDouble();
		else
			while (userInput < 0 || userInput > 20) userInput = sc.nextDouble();
		return userInput;
	}
	public static double calculateAverage(double numberOfScores,double[] scores){
		double scoreSum = 0;

		for (double score : scores) scoreSum += score;

		return  scoreSum/numberOfScores;
	}

	public static int calculateFailures(double[] scores){
		int failureCounter = 0;

		for (double score : scores) if (score < 10) failureCounter++;

		return  failureCounter;
	}

	public static void showInfoScores(double average, int failures){

		System.out.printf("average=%.1f%nfailures=%d%n",average, failures);
	}

	public static void main(String[] args){

		int firstInput = (int) getUserInput(true);
		double[] scores = new double[firstInput];
		for (int i = 0; i < firstInput; i++)
			scores[i] = getUserInput(false);
		showInfoScores(calculateAverage(firstInput,scores),calculateFailures(scores));
	}
}
