package day5;
import java.util.*;

/**
 * This is a simple program to test the largest of N numbers
 *
 * @author sleys
 *
 */
public class ForLoopTest {

	public static void main (String[] param) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of numbers in the sequence.".toUpperCase());
		System.out.println("--------------------------------------------------------------------------");
		System.out.print("N = ");
		int n = sc.nextInt();
		System.out.println("--------------------------------------------------------------------------");

		//Variable to store the largest value.
		int maxValue = Integer.MIN_VALUE;

		//taking and read numbers from user
		System.out.println("Please enter the numbers.".toUpperCase());
		System.out.println("==============================================");
		for (int i = 1; i <= n; i++) {
			System.out.print("Number " + i + " = ");
			int current = sc.nextInt();
			maxValue = Math.max(maxValue, current);
		}
		System.out.println("==============================================");
		sc.close();

		System.out.println("The maximum value is " + maxValue);
	}

}
