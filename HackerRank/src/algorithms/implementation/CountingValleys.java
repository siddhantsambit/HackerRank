/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class CountingValleys {
	static int countingValleys(int n, String s) {
        // Complete this function
		int level = 0;
		int valleys = 0;
		boolean belowsea = false;
		
		for(int i= 0; i < n ; i++) {
			if(s.charAt(i) == 'U') {
				level++;
			}
			else{
				level--;
			}
			
			if(!belowsea && level < 0) {
				valleys++;
				belowsea =true;
			}
			
			else if(level >= 0) {
				belowsea = false;
			}
		}
		
		return valleys;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(n, s);
        System.out.println(result);
        in.close();
    }
}
