/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class DivisibleSumPairs {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int count = 0;
        int sum = 0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int i =0; i < n-1; i++){
            for(int j =i+1; j< n; j++){
                if(i != j){
                    sum = a[i] + a[j];
                    if(sum%k == 0){
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);
        in.close();
    }

}
