/**
 * 
 */
package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class ExtraLongFactorials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		extraLongFactorials(n);
		sc.close();
	}
	
	static void extraLongFactorials(int n) {
		BigInteger factorial = new BigInteger("1");
		for(int i=2; i<=n; i++) {
			factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
		}
		System.out.println(factorial);
    }

}
