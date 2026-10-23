import java.util.Scanner;

public class ExJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstUserInput = sc.nextInt();
        float maxProgramOutput = 0;

        for (int i = firstUserInput; i>0; i--) {
            int userInput = sc.nextInt();

            float numberOfDigitsThatAreDividers = 0;
            int lengthOfUserInput = 0;

            for (int a = userInput; a>0; a/=10){
                int digitBeingTested = a % 10;
                lengthOfUserInput++;

                for (int potentialDiviser = 1; potentialDiviser <= 9; potentialDiviser++){
                    if (userInput % potentialDiviser == 0){
                        if (potentialDiviser == digitBeingTested){numberOfDigitsThatAreDividers++;}
                    }

                }

            }

            float programOutput = (numberOfDigitsThatAreDividers / lengthOfUserInput) * 100;

            if (programOutput > maxProgramOutput){ maxProgramOutput = programOutput;}

            System.out.printf("%.2f%%%n",programOutput);
        }
        if (firstUserInput > 0){System.out.printf("(%.2f%%)%n",maxProgramOutput);}
    }
}
