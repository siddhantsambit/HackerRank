/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class MigratoryBirds {
	public static void main(String[] args) {
	       
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (2 <= n && n <= 200000) {
			int[] types = new int[n];
			for (int types_i = 0; types_i < n; types_i++) {
				types[types_i] = in.nextInt();
			}
			// your code goes here
			int count[] = new int[5];
			for (int types_i = 0; types_i < n; types_i++) {
				switch (types[types_i]) {
				case 1:
					count[0]++;
					break;
				case 2:
					count[1]++;
					break;
				case 3:
					count[2]++;
					break;
				case 4:
					count[3]++;
					break;
				case 5:
					count[4]++;
					break;
				}
			}

			int max = 0, id = 0;
			for (int i = 0; i < 5; i++) {
				if (count[i] > max) {
					max = count[i];
					id = i + 1;
				}
			}
			System.out.println(id);
		}
		in.close();
    }

}
