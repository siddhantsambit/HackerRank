/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class CatsAndMouse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z = in.nextInt();
			System.out.println(Math.abs(x - z) == Math.abs(y - z) ? "Mouse C"
					: Math.abs(x - z) > Math.abs(y - z) ? "Cat B" : "Cat A");
		}

		in.close();
	}
}
