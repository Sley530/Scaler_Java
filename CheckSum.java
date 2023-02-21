/**
 * 
 */
package day6;
import java.util.*;
/**
 * @author sleys
 *
 */
public class CheckSum {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		boolean result = a + b == 20 || a + c == 20 || b + c == 20? true : false;
		System.out.println(result);

	}

}
