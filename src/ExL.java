import java.util.Scanner;

//    L - Perfect Numbers
//    Build a program that determines and visualizes the first N perfect numbers.
//    A number is perfect if it is natural and equals to the sum of all its divisors (excluding the number itself).
//
//    Each number should appear on a separate line.
public class ExL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        int potentialPerfect = 1;

        for (int i = 1; i <= userInput; i++){

            boolean perfectFound = false;

            while (perfectFound == false){

                int sumOfDivisors = 0;

                for (int a = 1; a < potentialPerfect; a++){
                    if (potentialPerfect % a == 0){ sumOfDivisors += a;}

                    for (int b = a; b


                }

                System.out.println("sumOfDivisors" + sumOfDivisors);
                potentialPerfect++;
            }


        }

    }
}
