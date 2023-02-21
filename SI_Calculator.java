package day4;
import java.util.*;
/**
 * This is a simple program that will calculate
 * the simple interest of a principal.
 * @author sleys
 *
 */
public class SI_Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the Principal:");
		double p = scan.nextInt();

		System.out.println("Please enter the Rate (decimal form):");
		double r = scan.nextDouble();

		System.out.println("Please enter the Time");
		double t  = scan.nextInt();
		scan.close();

		System.out.println("\n====================================================\n");

		System.out.println("The Simple Interest is:");
		double si = p * r * t;
		System.out.println("SI = " + si + "\n");

		System.out.println("=======================================================");

	}

}
