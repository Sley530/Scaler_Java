/**
 *
 */
package day4;
import java.util.*;
/**
 * This is a simple program that will test switch statement
 * @author sleys
 *
 */
public class SwithTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter any month to know its number of days:");
		System.out.println("\nOR\n");
		System.out.println("Enter the day position in the week to know this day:");
		String month = sc.nextLine();
		int week = sc.nextInt();
		sc.close();

		switch (week) {
		case 1 ->
		{
			System.out.println("This is Sunday.");
		}
		case 2 ->
		{
			System.out.println("This is Monday.");
		}
		case 3 ->
		{
			System.out.println("This is Tuesday.");
		}
		case 4 ->
		{
			System.out.println("This is Wednesday.");
		}
		case 5 ->
		{
			System.out.println("This is Thursday.");
		}
		case 6 ->
		{
			System.out.println("This is Friday.");
		}
		case 7 ->
		{
			System.out.println("This is Saturday, It's the SABBATH!!!\n");
		}
		default ->
		{
			System.out.println("Sorry, there is no such day in the week at this position.");
		}
		}

		switch (month) {
		case "January", "March", "", "May", "July", "August", "October", "December" ->
		{
			System.out.println("This is a month that contains 31 days.");
		}
		case "February" ->
		{
			System.out.print("This is the only month that contains 28 days(non-leap year) ");
			System.out.println("and 29 days(leap year).");
		}
		case "April", "June", "September", "November" ->
		{
			System.out.println("This is a month that contains 30 days.");
		}
		default ->
		{
			System.out.println("Sorry, this is not a month.");
		}
		}

	}

} // end of SwithTest
