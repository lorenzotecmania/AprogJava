import java.util.Scanner;

public class ExF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long userInput = sc.nextLong();
        boolean isPalindrome = true;
        int firstDigitOfInput = 0;
        int lastDigitOfInput = 0;
        int lenghtOfInput = 0;


        for (long i = userInput; i > 0; i /= 10){ lenghtOfInput++; }

        for (int a = lenghtOfInput; a > 1; a -= 2){

            lastDigitOfInput = (int) userInput % 10;
            if (userInput != 0) {
                for (long b = userInput; b > 0; b /= 10) {

                    if (b < 10) { firstDigitOfInput = (int) b; }
                }
            }else{firstDigitOfInput = 0;}

            userInput -= (long) Math.pow(10,(a-1))*firstDigitOfInput;
            userInput /= 10;

            if (firstDigitOfInput != lastDigitOfInput){ isPalindrome = false;}


        }
        if (isPalindrome) {System.out.println("palindrome");}else{System.out.println("not palindrome");}
    }
}