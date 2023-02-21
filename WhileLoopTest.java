/**
 *
 */
package day6;
import java.util.*;

/**
 * This is a simple program to test the number of digits in a
 * given number.
 * @author sleys
 *
 */
public class WhileLoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("please enter the number.".toUpperCase());
		System.out.println("===========================\n");
		System.out.print("Number = ");
		long number = sc.nextLong();
		sc.close();

		int digit = 0;

		while(number > 0)
		{
			number /= 10;
			digit++;
		}
		System.out.println("__________________________\n");
		System.out.print("The number of digit is: ".toUpperCase());
		System.out.println(digit);
		System.out.println("__________________________");

	}

}
