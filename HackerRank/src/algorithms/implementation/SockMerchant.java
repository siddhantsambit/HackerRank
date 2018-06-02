/**
 * 
 */
package algorithms.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class SockMerchant {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        Arrays.sort(c);
        
        int count = 0;
        
        Map<Integer, Integer>pairs= new HashMap<Integer, Integer>();
        
        for(int i=0; i < n; i++) {
            if(pairs.containsKey(c[i]))
             {
             int val=pairs.get(c[i]);
             pairs.put(c[i],++val);
             }
             else {
             pairs.put(c[i],1);
             }
       }
       
        Iterator<Integer> itr = pairs.keySet().iterator();
        
        while(itr.hasNext()){
            int val = (pairs.get(itr.next()))/2;
            count = count + val;
        }
        
        System.out.println(count);
        
        in.close();
        
    }

}
