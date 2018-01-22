/**
 * 
 */
package algorithms.warmup;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class Staircase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,j,k;
        for(i = 1; i<=n; i++){
           for(j = n-i; j>=1; j--){
                System.out.print(" ");
           }
            for(k=1 ; k<=i; k++){
                System.out.print("#");
           }
            System.out.println();
        }
        in.close();
    }
}
