/**
 * 
 */
package algorithms.warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class MiniMaxSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long min = 0;
        long max = 0;
        //int counter = 1;
        
        long[] arr = {a,b,c,d,e};
        
        int size = arr.length;
        
        Arrays.sort(arr);
        
        for(int i = 0 ; i < size - 1 ;i++){
           
           min = min + arr[i];
          
        }
        
        System.out.print(min + " ");
        
        for(int i = size - 1 ; i > 0 ;i--){
            max = max + arr[i];
        }
        
        System.out.print(max);
        in.close();
    }
}
