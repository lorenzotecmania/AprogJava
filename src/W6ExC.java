import java.util.Scanner;
import static java.lang.Math.acos;
import java.util.Locale;

public class W6ExC {

    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    static public double calculateInternalAngle(double a,double b,double c,int angle){

        switch (angle){
            case 1:
                double angAB = Math.acos((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,2))/(2*a*b));
				double angABinDegrees = angAB * (180.0 / Math.PI);
				return angABinDegrees;
            case 2:
                double angAC = Math.acos((Math.pow(a,2)+Math.pow(c,2)-Math.pow(b,2))/(2*a*c));
				double angACinDegrees = angAC * (180.0 / Math.PI);
				return angACinDegrees;
			case 3:
        		double angBC = Math.acos((Math.pow(b,2)+Math.pow(c,2)-Math.pow(a,2))/(2*b*c));
				double angBCinDegrees = angBC * (180.0 / Math.PI);
				return angBCinDegrees;
			default:
				return 0.0;
		}

    }

    static public void printOutput(double angle, int i){

		switch(i){
			case 1:
				System.out.printf("ang(a,b)=%.2f%n",angle);
				break;
			case 2:
				System.out.printf("ang(a,c)=%.2f%n",angle);
				break;
			case 3:
				System.out.printf("ang(b,c)=%.2f%n",angle);
				break;
		}
	}



	static public void main(String[] args){

		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();

		boolean isValidTriangle = (side1 > 0 && side2 > 0 && side3 > 0) &&
				(side1 + side2 > side3) &&
				(side1 + side3 > side2) &&
				(side2 + side3 > side1);

		if (!isValidTriangle) {
			System.out.println("impossible");
			return;
		}

		System.out.printf("a=%.2f%nb=%.2f%nc=%.2f%n", side1,side2,side3);

		for (int i = 1; i < 4; i++){
			double angle = calculateInternalAngle(side1,side2,side3,i);
			printOutput(angle,i);
		}
    }
}
