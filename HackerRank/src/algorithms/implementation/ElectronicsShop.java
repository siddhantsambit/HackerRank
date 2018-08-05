/**
 * 
 */
package algorithms.implementation;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class ElectronicsShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		Integer k[] = new Integer[n];
		int p[] = new int[m];
		for(int i=0; i<n; i++) {
			k[i] = sc.nextInt();
		}
		for(int i=0; i<m; i++) {
			p[i] = sc.nextInt();
		}
		System.out.println(getMoneySpent(k, p, b));
		sc.close();
	}
	
	static int getMoneySpent(Integer[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
		Arrays.sort(keyboards, Collections.reverseOrder());//Descending order
        Arrays.sort(drives);
		int max = -1;
		for(int i=0,j=0; i<keyboards.length; i++){
			for(; j<drives.length; j++){
				if(keyboards[i]+drives[j]>b)
					break;
				if(keyboards[i]+drives[j]>max){
					max=keyboards[i]+drives[j];
				}
			}
		}
		return max;
    }

}
