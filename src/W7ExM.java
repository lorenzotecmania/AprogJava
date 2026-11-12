import java.util.Scanner;

public class W7ExM {
	static Scanner sc = new Scanner(System.in);
    
    static int positiveInputCounter = 0;
    static int inputCounter = 0;
    static int uniqueCounter = 0;

    public static int checkUniqueDigits(int number){

        int absNumber = Math.abs(number);
        int repeatedCounter = 0;

        for (int i = absNumber; i > 0; i /= 10){

            int digitTesterOuter = i % 10;

            for (int k = i / 10; k > 0; k /= 10){

                int digitTesterInner = k % 10;

                if (digitTesterInner == digitTesterOuter) repeatedCounter++;
            }

        }

        if(!(repeatedCounter > 0)){
            uniqueCounter++;
            return 1;
        }else return 0;
    }

    public static double calculatePositivePercentage (int inputCount, int positiveInputCount){
        return ((double) positiveInputCount / inputCount)*100;
    }
    public static double calculateUniquePercentage (int inputCount, int uniqueCount){
        return ((double) uniqueCount / inputCount)*100;
    }

    public static void printRecurringOutput(int hasUniqueDigits, int userInput){

        if (hasUniqueDigits == 1) System.out.println(userInput);
    }
    public static void printFinalOutput(double positivePercentage, double uniquePercentage){
        System.out.printf("negatives: %.2f%%%npositives: %.2f%%%nwith unique digits: %.2f%%",
                100.0 - positivePercentage, positivePercentage, uniquePercentage);
    }

	public static void main(String[] args){

        int userInput = 1;

        while(userInput != 0) {
            userInput = sc.nextInt();
            if (userInput > 0) positiveInputCounter++;

            if (userInput != 0 ) {
                inputCounter++;
                printRecurringOutput(checkUniqueDigits(userInput),userInput);
            }
        }
        if (inputCounter > 0) {
            printFinalOutput(
                    calculatePositivePercentage(inputCounter, positiveInputCounter),
                    calculateUniquePercentage(inputCounter, uniqueCounter));
        }else System.out.println();
	}

}
