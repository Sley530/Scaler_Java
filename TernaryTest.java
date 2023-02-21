/**
 *
 */
package day4;

import java.util.Scanner;

/**
 * This is a simple program to verify if a number is
 * even or odd.
 *
 * @author sleys
 *
 */
public class TernaryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter up to three (3) times any number ");
		System.out.println("to verify if it is an even number or not:");

		for (int i = 0; i < 3; i++)
		{
			int num = sc.nextInt();
			//Ternary operator
			String answer = num % 2 == 0 ? "Even" : "Odd";

			System.out.println(answer);
		}
		sc.close();

	}

} //end of TernaryTest
