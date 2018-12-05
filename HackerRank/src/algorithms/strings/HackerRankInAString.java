/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author sambit
 *Initial Thoughts:
 *We have an array of chars and
 *advance our position when we 
 *find a matching char in S and
 *if we reach the last index before
 *our string is done then we print YES
 *else we print NO
 *Time Complexity: O(n) //We have to iterate through the whole string
 *Space Complexity: O(1) //We just store the HackerRank array
 */
class HackerRankInAString {

	/**
	 * @param args
	 */
	
	private static final Scanner scanner = new Scanner(System.in);
	private static final char find[] = "hackerrank".toCharArray();
	public static void main(String[] args) throws IOException {
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int q = scanner.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.next();
            String result = hackerrankInString(s);
            System.out.println(result);
            
        }

        scanner.close();
    }
	static String hackerrankInString(String s) {
		int findNext = 0;
		for(char c : s.toCharArray()) {
			if(find[findNext] == c) {
				findNext++;
			}
			if(findNext == find.length) {
				return "YES";
			}
		}
		return "NO";
    }

}
