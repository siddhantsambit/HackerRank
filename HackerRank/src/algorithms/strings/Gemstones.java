/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author sambit
 *We could use two sets one for the past rocks and one for the current rock
 *and just intersect the past with the current and set that to the past
 *so when we have moved through all the rocks the set will be
 *the intersection of all rocks which is the gemstones
 *Time Complexity - O(n)
 *Space Complexity - O(26)
 */
class Gemstones {
	static int gemstones(String[] arr) {
		Set<Character> gemStones = stringToSet(arr[0]);
		for(int i=1; i<arr.length; i++) {
			gemStones.retainAll(stringToSet(arr[i]));
		}
		return gemStones.size();
    }
	
	static Set<Character> stringToSet(String s) {
		Set<Character> set = new HashSet<Character>(26);
		for(char c : s.toCharArray()) {
			set.add(c);
		}
		return set;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }
        int result = gemstones(arr);
        System.out.println(result);
        scanner.close();
    }

}
