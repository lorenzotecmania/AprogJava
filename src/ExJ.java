import java.util.Scanner;

public class ExJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstUserInput = sc.nextInt();
        float programOutput = 0;

        int genericDivider = 3;
        float numberOfDigits = 0;
        float numberOfDigitsThatAreDividers = 0;

        // 2 partes: determinar os digitos depois encontrar divisores e testar contra os digitos
        // os digitos vao ficar numa variavel local logo o teste terá de estar dentro desse loop

        for(int i = firstUserInput; i>0; i--) {
            int userInput = sc.nextInt();
            int lengthOfUserInput = 0;

            for (int a = userInput; a>0; a/=10){
                int digitBeingTested = a % 10;
                lengthOfUserInput++;

                for (potentialDiviser = 0; potentialDiviser <= userInput; potentialDiviser++){
                    if (potentialDiviser % userInput == 0){ diviser}
                }

            }

//            for (int i = userInput; ) {
//                if (genericDivider == currentDigitBeingTested) {
//                    numberOfDigitsThatAreDividers++;
//                }
//            }
//            float programOutput = numberOfDigits / numberOfDigitsThatAreDividers;
            System.out.println(programOutput + "%");
        }
    }
}
