import java.util.Scanner;

public class ExQ {
    static Scanner sc = new Scanner(System.in);

//    Q - Skills
//    The company SoftSkills wants to know what skills it has available among all its employees.
//    Each skill is represented by a digit. The digit zero (0) does not represent any skill.
//    An employee's skills are expressed as a whole number whose digits represent the respective skills.
//
//    The aim is to read the numbers with the skills of the company's employees and determine the number
//    that combines all the different skills available.
//    The reading ends with the number zero.
//
//    In the company, skills are analyzed from left to right of the numbers.
//    The resulting number must have the digits in the sequence in which they appear, from left to right.
//
//            input:
//    A set of integers, one on each line, representing each employee's skills. The last number is zero.
//
//    output:
//    The whole number with the distinct competencies found, among all employees
//
//    note: You should solve the problem using only integer type variables.

    public static void main(String[] args){

        int run = 1;
        int programOutput = 0;
        int discardAmount = 0;

        while(run == 1){
            int lengthOfUserInput = 0;
            int repeatedDigit = 0;
            int userInput = sc.nextInt();

            for (int i = userInput; i > 0; i /= 10) {
                    int inputDigit = i % 10;
                    lengthOfUserInput++;
                for (int k = programOutput; k > 0; k /= 10){
                    int outputDigit = k % 10;
                    if (outputDigit == inputDigit) {
                        repeatedDigit = inputDigit;
                        discardAmount = repeatedDigit * (int) Math.pow(10,lengthOfUserInput);
                        userInput -= repeatedDigit* (int) Math.pow(10,lengthOfUserInput);
                        System.out.println("p"+programOutput);
                        System.out.println("r"+repeatedDigit);
                        System.out.println("d"+discardAmount);

                    }
                }
            }

            programOutput *= (int) Math.pow(10,lengthOfUserInput);
            programOutput += userInput;
            if (userInput == 0) run = 0;
            //System.out.println(repeatedDigit);
        }
        if (programOutput != 0) System.out.println(programOutput);

    }
}
