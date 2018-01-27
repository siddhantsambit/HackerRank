/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class BonAppétit {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i = 0;c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }
        int b_charged = in.nextInt();
        
        int sum = 0;
        
        for(int i =0; i <n; i++){
            if(i != k) {
                sum += c[i];
            }
        }
        
        int b_actual = sum / 2;
        
        if((b_charged - b_actual) == 0) {
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(b_charged - b_actual); 
        }
        in.close();
    }
}
