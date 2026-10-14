import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();
        int inputLength = Integer.toString(userInput).length();
        int programOutput = userInput;
        int i = 0;

        while (i<10){



            programOutput = programOutput / 10;

            i++;

            System.out.println(programOutput);
        }
        }
    }