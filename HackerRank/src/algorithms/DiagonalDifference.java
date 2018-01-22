/**
 * 
 */
package algorithms;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class DiagonalDifference {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int p = 0 ,s = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                if(a_i == a_j){
                    p = p + a[a_i][a_j];
                }
                if(a_i+a_j == n-1){
                    s = s + a[a_i][a_j];
                }
            }
        }
        System.out.print(Math.abs(p-s));
        in.close();
    }

}
