import java.util.Scanner;
import java.util.Locale;

public class W6ExF {

	static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

	public static double calculateSolidVolume(String solid, double radius, double height){

		double result = 0;

		switch(solid){
			case "sphere":
				result = (4.0/3.0)*Math.PI*Math.pow(radius,3);
				break;
			case "cylinder":
				result = Math.PI * Math.pow(radius,2)*height;
				break;
			case "cone":
				result = (1.0/3.0)*Math.PI * Math.pow(radius,2)*height;
				break;
		}
		return result;
	}

	public static void printOutput(double programOutput){

		System.out.printf("%.2f%n", programOutput);
	}

	public static void main (String[] args){

		while (true){

			String nameUserInput = sc.next();
			if (nameUserInput.equals("end")){break;}
			double radiusUserInput = sc.nextDouble();
			double heightUserInput = 0;

			if (!"sphere".equals(nameUserInput)) heightUserInput = sc.nextDouble();

			double programOutput = calculateSolidVolume(nameUserInput,radiusUserInput,heightUserInput);

			printOutput(programOutput);

		}

	}
}
