import java.util.Scanner;

public class ExK {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        for (int k = 1; k < userInput; k++) {

            int divisors = 0;

            for (int i = 1; i <= k; i++) {
                if (k % i == 0 && divisors < 3) { divisors++; }
            }

            if (divisors == 2){ System.out.println(k); }
        }
    }
}