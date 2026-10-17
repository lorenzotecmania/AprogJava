import java.util.Scanner;

public class ExF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long userInput = sc.nextLong();
        boolean isPalindrome = false;
        int firstDigitOfInput = 0;

        // como é q vou resolver esta merda
        // neste momento apenas pego o primeiro digito depois de todos os outros
        // preciso de um segundo loop q apanhe o primeiro digito e só depois pegue o ultimo
        for (long a = userInput; a > 0; a /= 10) {
            if (a < 10) {
                firstDigitOfInput = (int) a;
            }
        }
        for (long i = userInput; i > 0; i /= 10){
            int lastDigitOfInput =  (int) (i % 10);
            System.out.println("first digit =" + firstDigitOfInput + "last digit =" + lastDigitOfInput);
        }
        if (isPalindrome) {System.out.println("palindrome");}else{System.out.println("not palindrome");}
    }
}