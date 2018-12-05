/**
 * 
 */
package algorithms.strings;

import java.util.Scanner;

/**
 * @author sambit
 * We could use a greedy approach and starting from the
 * left everytime we see a 010 replace the last 0 with a 1
 * and continue
 * Time Complexity - O(n), n length of the string
 * Space Complexity - O(1)
 */
public class BeautifulBinaryString {
	
	// Method for beautifulBinaryString to count change the bits
    static int beautifulBinaryString(String b) {
    	int switches= 0;
    	for(int i=0; i<b.length()-2; i++) {
    		if(b.charAt(i) == '0' && b.charAt(i+1) == '1' && b.charAt(i+2) == '0') {
    			switches++;
    			i+=2;
    		}
    	}
    	return switches;
    }
	private static final Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String b = scanner.nextLine();
        int result = 0;
        if(n == b.length()) {
        	result = beautifulBinaryString(b);
        }
        System.out.println(result);
        scanner.close();

	}

}
