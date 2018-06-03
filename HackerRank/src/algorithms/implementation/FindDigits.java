/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class FindDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int[n];
		for(int i=0; i<n; i++){
			t[i] = sc.nextInt();
			int result = findDigits(t[i]);
			System.out.println(result);
		}
		sc.close();
	}
	
	static int findDigits(int n) {
		char ch[] = Integer.toString(n).toCharArray();
		int count = 0;
		for(char c: ch){
			if(Integer.parseInt(String.valueOf(c)) != 0
					&& (n % Integer.parseInt(String.valueOf(c)) == 0)){
				count++;
			}
		}
		return count;
    }

}
