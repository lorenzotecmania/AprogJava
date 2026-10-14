import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double b = 0;
        double c = 0;
        for (int i = 0; i < n; i++) {
            double d = sc.nextDouble();
            if (d > b)
                b = d;
            else if (d < c)
                c = d;
        }
        if (b > 0)
            System.out.println("msg1" + b);
        else
            System.out.println("msg2");
        if (c < 0)
            System.out.println("msg3" + c);
        else
            System.out.println("msg4");
    }
    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int quantity = sc.nextInt();
//        double mostPositive = 0;
//        double mostNegative = 0;
//        for (int i = 0; i < quantity; i++) {
//            double number = sc.nextDouble();
//            if (number > mostPositive)
//                mostPositive = number;
//            else if (number < mostNegative)
//                mostNegative = number;
//        }
//        if (mostPositive > 0)
//            System.out.println("The most positive number entered was :" + mostPositive);
//        else
//            System.out.println("No positive numbers were entered");
//        if (mostNegative < 0)
//            System.out.println("The most negative number entered was :" + mostNegative);
//        else
//            System.out.println("No negative numbers were entered");
//    }

}