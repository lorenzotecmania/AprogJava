import java.util.Scanner;

public class ExA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long userInput = sc.nextLong();
        int programOutput = 0;

        for (long i = userInput; i > 0; i /= 10){
            int lastDigitOfInput =  (int) (i % 10);
            if (lastDigitOfInput % 2 == 0) {
                programOutput += lastDigitOfInput;
            }
        }

        System.out.println(programOutput);

    }
}