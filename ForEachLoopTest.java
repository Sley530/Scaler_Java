/**
 * 
 */
package day9;
import java.util.*;
/**
 * @author sleys
 *
 */
public class ForEachLoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		for (int n : num) {
			String result = n % 2 == 0 ? "Even" : "Odd";
			System.out.println(n + " = " + result);
		}
		
		
		

	}

}
