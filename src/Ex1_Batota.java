import java.util.Scanner;

public class Ex1_Batota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();

        for (int digits = userInput.length(); digits > 0; digits--){

            char a = userInput.charAt(digits);
            int b = (int) a;
            if (b % 2 == 0){
                System.out.println(b);
            }
        }

    }
}
