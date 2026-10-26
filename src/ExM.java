import java.util.Scanner;

public class ExM {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        int lastOutput = 0;
        int beforeLastOutput = 0;
        int fibonnaciOutput = 0;

        for (int i = 0; i < userInput; i++){

            if (i == 0 ){ beforeLastOutput = 1;}

            System.out.println(fibonnaciOutput);
            fibonnaciOutput = lastOutput + beforeLastOutput;
            beforeLastOutput = lastOutput;
            lastOutput = fibonnaciOutput;
        }

    }
}
