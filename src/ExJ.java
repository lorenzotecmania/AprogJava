import java.util.Scanner;

public class ExJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstUserInput = sc.nextInt();

        for (int i = firstUserInput; i > 0; i--){

            int userInput = sc.nextInt();
            int numberOfDividers = 0;
            int digitsThatAreDividers = 0;

            for (int dividers = 1; dividers <= userInput; dividers++) {
                for (int h = userInput; h > 0; h /= 10){ digitsh % 10 ;}
                if (userInput % dividers == 0) {
                    System.out.println(dividers);
                    numberOfDividers++;

                }
            }
            //System.out.println(numberOfDividers);
        }
    }
}
