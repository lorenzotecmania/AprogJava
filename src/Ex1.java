import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        int digitCounter = 0;

        for (int i = userInput; i > 0; i /= 10){
            digitCounter += 1;
        }
        System.out.println(digitCounter);


        for (int i = 0; i < digitCounter; i++){
            char A = userInput.charAt(i);

        }
        */
        }
    }