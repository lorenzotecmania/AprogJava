import java.util.Scanner;

public class ExE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while (run){
            long userInput = sc.nextLong();
            long programOutput = 0;
            int a = 0;

            for (long i = userInput; i > 0; i /= 10) {
                int lastDigitOfInput =  (int) (i % 10);
                programOutput += ((long) lastDigitOfInput * (long)(Math.pow(8,a)));
                a++;
            }

            if (userInput >= 0){System.out.println(programOutput);}
            else{run = false;}
        }
    }
}