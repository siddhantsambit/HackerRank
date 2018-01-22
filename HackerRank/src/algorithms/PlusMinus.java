/**
 * 
 */
package algorithms;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class PlusMinus {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int p =0, ne =0, e = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int arr_i=0; arr_i < n; arr_i++){
            if(arr[arr_i] < 0){
                ne++;
            }
            else if(arr[arr_i] > 0){
                p++;
            }
            else if(arr[arr_i] == 0){
                e++;
            }
        }
        System.out.println((double)p/(double)n);
        System.out.println((double)ne/(double)n);
        System.out.println((double)e/(double)n);
        in.close();
    }

}
