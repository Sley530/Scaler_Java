/**
 * 
 */
package day7;

/**
 * @author sleys
 *
 */
public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declaring an integer array.
		int[] even = new int[5];
		
		//Declaring another array
		int[] odd = {1, 0, 1, 0, 1};
		
		even[1] = 1;
		even[2] = 0;
		even[3] = 1;
		even[4] = 0;
		
		for (int j = 0; j <= 2; j++) {
			for (int i = 0; i < even.length; i++) {
				int sum = even[i] + odd[i];
				int mult = even[i] * odd[i];
				
				System.out.printf("%d\n %d\n", sum, mult);
			}
		}
		
		

	}

}
