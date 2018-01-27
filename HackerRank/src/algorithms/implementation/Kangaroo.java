/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class Kangaroo {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int length = word.length();
        int max = 0;
        
        for(int i = 0;i < length; i++){
            char tempChar = word.charAt(i);
            max = max < h[tempChar - 97] ? h[tempChar - 97] : max;
        }
        
        System.out.print(max*length);
        
        in.close();
    }

}
