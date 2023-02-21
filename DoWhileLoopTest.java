/**
 *
 */
package day6;
import java.util.*;

/**
 * This is a simple program that will display
 * the sum of positive numbers.
 *
 * @author sleys
 *
 */
public class DoWhileLoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int num;
		System.out.println("============================================================");
		System.out.println("Please enter the numbers & the program will print the sum".toUpperCase());
		System.out.println("Until it finds a negative numbers.".toUpperCase());
		System.out.println("============================================================");

		do
		{
			System.out.print("N = ");
			num = sc.nextInt();
			sum += num;
		}
		while (num >= 0);
		sc.close();
		System.out.println("============================================================");
		System.out.println(" The sum is: ".toUpperCase() + sum);
		System.out.println("============================================================");

	}

}
