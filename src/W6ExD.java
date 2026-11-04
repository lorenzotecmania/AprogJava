import java.util.Scanner;

public class  W6ExD {

	static Scanner sc = new Scanner(System.in);

//	D - Combinations and permutations
//	Write a program that calculates the number of possible combinations and permutations of a set of elements. You must
//	enter the total quantity of elements (m) and the subset size to group (n).
//	The formulas are as follows:
//
//			- Combinations of m elements, in subsets of size n (m> = n).
//	m!
//	C (m, n) = -----------
//	n! (m-n)!
//
//	Permutations of m elements, in subsets of size n (m> = n).
//	m!
//	P (m, n) = ---------
//			(m-n)!
//
//	Each result should appear on separate line and in the following format:
//	C(5,2)=10
//	P(5,2)=20
//
//	NOTE: Implement the following methods:
//	factorial ()
//	combinations ()
//	permutations ()

	public static int factorial (int number){

		int factorial = 1;

		for (int i = 1; i < number+1; i++) factorial *= i;

		return factorial;

	}
	public static int combinations (int m, int n){
		return factorial(m)/(factorial(n)*(factorial(m-n)));
	}
	public static int permutations (int m, int n){
		return factorial(m)/factorial(m-n);
	}

    public static void main(String[] args){

		int numberOfElements = sc.nextInt();
		int subSetSize = sc.nextInt();

		int permutations = permutations(numberOfElements,subSetSize);
		int combinations = combinations(numberOfElements,subSetSize);

		if (numberOfElements >= subSetSize) System.out.printf(
				"C(%d,%d)=%d%nP(%d,%d)=%d%n",numberOfElements,subSetSize,combinations,numberOfElements,subSetSize,permutations);

    }
}
