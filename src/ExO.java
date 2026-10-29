import java.awt.*;
import java.util.Scanner;

//    O - Pizza
//    A Pizza restaurant has a variety of Pizzas on its menu. The variety of Pizzas results from the different use of 10 possible ingredients. Each ingredient is identified by a number from 0 to 9.
//    In this way, each Pizza is identified by an integer whose digits correspond to the ingredients that compose it. For example, Pizza 6501 contains ingredients 0, 1, 5 and 6.
//            When ordering, the customer declares the ingredients that he does not like or is allergic to, and the restaurant only suggests, among the Pizzas available on the menu, those that do not contain any of these ingredients.
//
//    input:
//    An integer representing ingredients that the customer does not like or is allergic to.
//    Then, the number of Pizzas (N) in the menu is entered.
//    Finally, N integers are introduced referring to the N Pizzas in the menu (description of the ingredients of each Pizza).
//
//    output:
//    Show on separate lines each Pizza that satisfies the customer's requirements (which does not contain any ingredient that the customer does not like or is allergic to), in the following format:
//    Suggestion #<i>:<pizza>
//
//    Where <i> is the order of the suggestion sequence and <pizza> is the pizza code.

public class ExO {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        int firstUserInput = sc.nextInt();
        int secondUserInput = sc.nextInt();
        int sugestionCounter = 0;

        for (int i = secondUserInput; i > 0; i--){

            int userInput = sc.nextInt();
            boolean aprovedPizza = true;


            if (firstUserInput != 0) {
                for (int k = firstUserInput; k > 0; k /= 10){
                    int dislikedDigit = k % 10;
                    //System.out.println(dislikedDigit);
                    for (int h = userInput; h > 0; h /= 10){
                        int digitBeingTested = h % 10;
                        //System.out.println(k);
                        if (digitBeingTested == dislikedDigit) {aprovedPizza = false;}
                    }
                }
            }else{
                int dislikedDigit = 0;
                //System.out.println(dislikedDigit);
                for (int h = userInput; h > 0; h /= 10){
                    int digitBeingTested = h % 10;
                    //System.out.println(k);
                    if (digitBeingTested == dislikedDigit){aprovedPizza = false;}
                }
            }

            if (aprovedPizza){
                sugestionCounter++;
                System.out.println("Suggestion #" + sugestionCounter + ":" + userInput);
            }

        }
    } // time imit exceeded
}
