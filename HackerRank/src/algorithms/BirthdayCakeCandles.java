/**
 * 
 */
package algorithms;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class BirthdayCakeCandles {
	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
		int count = 0;
		Arrays.sort(ar);
		for(int i = ar.length - 1 ; i >= 0 ; i--) {
			if(ar[i] == ar[ar.length - 1]) {
				count ++ ;
			}
		}
		
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
        in.close();
    }

}
