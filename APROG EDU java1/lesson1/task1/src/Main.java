import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double grade, sum = 0, result;
        grade = sc.nextDouble();
        while (grade >= 0) {
            sum = sum + grade;
            i++;
            grade = sc.nextDouble();
        }
        if (i > 0) {
            result = sum / i;
            System.out.println("msg1 = " + result);
        } else
            System.out.println("msg2");
    }
}