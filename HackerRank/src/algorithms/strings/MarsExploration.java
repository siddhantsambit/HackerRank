/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author sambit
 *
 */
class MarsExploration {
	// Complete the marsExploration function below.
    static int marsExploration(String s) {
    	int count=0;
    	for(int i=0; i<s.length(); i++) {
    		if(i%3==1 && s.charAt(i)!='O') {
    			count++;
    		}
    		else if(s.charAt(i)!='S') {
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
