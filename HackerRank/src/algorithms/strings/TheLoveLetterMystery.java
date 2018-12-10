/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author sambit
 * Iterating through the string from beginning and
 * end of the string comparing through the differences
 * of the character at each position to calculate number
 * of the operations.
 * Time Complexity - O(n/2), n is the length of the string
 * Space Complexity - O(1) no extra space required
 */
public class TheLoveLetterMystery {
	
	// Completed the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
    	int i=0, operations=0, j=s.length()-1;
    	while(i<j) {
    		operations+= Math.abs(s.charAt(i)-s.charAt(j));
    		i++;
    		j--;
    	}
    	return operations;
    }

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
        scanner.close();
    }

}
