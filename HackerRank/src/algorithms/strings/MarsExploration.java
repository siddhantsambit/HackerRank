/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author sambit
 * Iterate the string if there is no 'O' at index 
 * with a remainder of 1 with divisor as 3 and at
 * other indexes if there is no 'S' increase the 
 * count
 * Time Complexity - O(n), where n is the length of the
 * array
 * Space Complexity - O(1), no external space is used
 */
class MarsExploration {
	// Completed the marsExploration function below
    static int marsExploration(String s) {
    	int count=0;
    	for(int i=0; i<s.length(); i++) {
    		if(i%3==1) {
    			if(s.charAt(i)!='O') {
    			count++;
    			}
    		}
    		else if (s.charAt(i)!='S') {
    			count++;
    		}
    	}
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        String s = scanner.next();

        int result = marsExploration(s);

        System.out.println(result);

        scanner.close();
    }

}
