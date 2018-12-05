/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author sambit
 *Simply use the same string but iterate from
 *beginning and end
 *With a time complexity of O(n/2) //With have to iterate through half of the string
 */
class FunnyString {
	
	//method to find whether string is funny or not
	static String funnyString(String s) {
		for(int i=1; i < (s.length()/2)+1; i++) {
			int left = Math.abs(s.charAt(i)-s.charAt(i-1));
			int right = Math.abs(s.charAt(s.length()-i-1)-s.charAt(s.length()-i));
			if(left != right) {
				return "Not Funny";
			}
		}
		return "Funny";
    }
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            String result = funnyString(s);
            System.out.println(result);
        }
        scanner.close();
    }

}
