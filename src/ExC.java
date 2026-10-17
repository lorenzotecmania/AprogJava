import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long userInput = sc.nextLong();
        int programOutput = 1;
        boolean oddDigits = false;

        for (long i = userInput; i > 0; i /= 10){
            int lastDigitOfInput =  (int) (i % 10);
            if (lastDigitOfInput % 2 != 0) {
                programOutput *= lastDigitOfInput;
                oddDigits = true;
            }
        }

        if (oddDigits) {System.out.println(programOutput);}else{System.out.println("no odd digits");}

    }
}