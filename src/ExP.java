import java.util.Scanner;

//    P - Repeated Digits
//    Check if an integer, read from the keyboard, has repeated digits. Checking must be done from right to left.
//    If a repetition is detected, immediately display the repeated digit and the respective positions in which they occur
//    (from right to left), in the following format:
//
//    <number> : digit (<d>) repeated in positions (<p1>) and (<p2>)
//
//    where <number> is the number read from the keyboard, <a> is the repeated digit and <p1> and <p2> the positions where they occur.
//
//            For example, the number 890230 has the digit (0) repeated in positions (1) and (4).
//
//    The algorithm must be applied to a sequence of integers terminated by a negative number.

public class ExP {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        boolean run = true;
        while (run){

            int firstPairDigit = 0;
            int secondPairDigit = 0;
            int firstDigitPositionCounter = 0;
            int secondDigitPosition = 0;
            int secondDigitPositionCounter = 0;
            boolean pairFound = false;
            int userInput = sc.nextInt();

            for (int i = userInput; i > 0; i /= 10){
                int potentialFirstPairDigit = i % 10;
                //System.out.println("firstPairDigit" + firstPairDigit);
                firstDigitPositionCounter++;
                secondDigitPositionCounter = 0;
                for (int k = (int) (userInput / Math.pow(10,firstDigitPositionCounter)); k > 0; k /= 10) {
                    int potentialSecondPairDigit = k % 10;
//                    System.out.println(k);
                    secondDigitPositionCounter++;
                    if (potentialFirstPairDigit == potentialSecondPairDigit) {
                        pairFound = true;
                        firstPairDigit = potentialFirstPairDigit;
                        secondPairDigit = potentialSecondPairDigit;
                        secondDigitPosition = secondDigitPositionCounter+firstDigitPositionCounter;
                        i = -1;
                        k = -1;
                    }
                }
            }
//            System.out.println("pairfound=" + pairFound + " " + firstPairDigit + " " + secondPairDigit );
//            System.out.println("1position" + firstDigitPositionCounter);
//            System.out.println("2position" + secondDigitPosition);
            if (pairFound)
                System.out.println(
                        userInput+" : digit ("+firstPairDigit+") repeated in positions ("+firstDigitPositionCounter+") and ("+secondDigitPosition+")");
            if (userInput < 0) run = false;
        }

    }
}
