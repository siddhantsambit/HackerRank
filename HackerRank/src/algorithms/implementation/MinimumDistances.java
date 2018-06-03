/**
 * 
 */
package algorithms.implementation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class MinimumDistances {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(minimumDistances(a));
		sc.close();
	}
	
	static int minimumDistances(int[] a) {
		int minimumDistance = -1;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0; i<a.length; i++) {
			if(map.containsKey(a[i])){
				int distance = Math.abs(map.get(a[i]) - i);
				if(minimumDistance > distance || minimumDistance == -1){
					minimumDistance = distance;
				}
				map.put(a[i], i);
			}
			else{
				map.put(a[i], i);
			}
		}
		return minimumDistance;
    }
}
