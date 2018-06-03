/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class BeautifulDaysAtTheMovies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(beautifulDays(i, j, k));
		sc.close();
	}
	
	static int beautifulDays(int i, int j, int k) {
		int beautifulDays = 0;
		for(int x=i; x<=j; x++){
			StringBuilder sb = new StringBuilder(Integer.toString(x));
			int xReverse = Integer.parseInt(sb.reverse().toString());
			if((Math.abs(x-xReverse) % k) == 0){
				beautifulDays++;
			}
		}
		return beautifulDays;
    }

}
