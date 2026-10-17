import java.util.Scanner;

public class ExFA {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long userInput = sc.nextLong();
        boolean isPalindrome = false;
        int firstDigitOfInput = 0;
        int lastDigitOfInput = 0;
        int lenghtOfInput = 0;

        for (long i = userInput; i > 0; i /= 10){ lenghtOfInput++; }

        // !numeros inpares! FALTA SO ISTO
        for (int a = lenghtOfInput; a > 1; a -= 2){

            lastDigitOfInput = (int) userInput % 10;

            for (long b = userInput; b > 0; b/= 10) {
                if (b < 10) {
                    firstDigitOfInput = (int) b;
                }
            }
            System.out.println("firstDigitOfInput=" + firstDigitOfInput);
            System.out.println("lastDigitOfInput=" + lastDigitOfInput);
            System.out.println("a=" + a);
            userInput -= (long) Math.pow(10,(a-1))*firstDigitOfInput;
            //System.out.println(userInput);
            userInput /= 10;
            //System.out.println(userInput);


        }
        System.out.println("lenghtOfInput=" + lenghtOfInput);



        //if (isPalindrome) {System.out.println("palindrome");}else{System.out.println("not palindrome");}
    }
}