/**
 * 
 */
package day7;
import java.util.*;
/**
 * @author sleys
 *
 */
public class Array_IO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//taking input in store it in an array
		int[] myArray = new int[n];
		
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = sc.nextInt();
		}
		sc.close();
		
		//Display the input values
		for(int i = 0; i < myArray.length; i++) {
			int arr = myArray[i];
			System.out.printf("At index: %d  Value = %d\n", i, arr);
		}

	}
 
}
