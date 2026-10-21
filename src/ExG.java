import java.util.Scanner;

public class ExG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfDividers = 0;

        int userInput = sc.nextInt();
        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                System.out.println(i);
                numberOfDividers++;
            }
        }
        System.out.println("(" + numberOfDividers + ")");
    }
}