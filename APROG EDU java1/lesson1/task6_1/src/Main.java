import java.util.Scanner;

public class Main {
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
}