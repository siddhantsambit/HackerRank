/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class AngryProfessor {

	/**
	 * @param args
	 * 
	 */
	static String angryProfessor(int a[], int k) {
		int onTime = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] <=0) {
				onTime++;
			}
		}
		if(onTime >=k) {
			return "NO";
		}
		else {
			return "YES";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tItr = 0; tItr < t; tItr++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n;i++) {
				a[i] = sc.nextInt();
			}
			String result = angryProfessor(a, k);
			System.out.println(result);
		}
		sc.close();

	}

}
