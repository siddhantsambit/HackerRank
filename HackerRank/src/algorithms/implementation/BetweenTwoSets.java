/**
 * 
 */
package algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class BetweenTwoSets {
	
	static int getTotalX(int[] a, int[] b) {
        // Complete this function
		int finalCount = 0;
		int lcm = findLCM(a);
		
		int gcf = findGCF(b);
		
        for(int i = lcm, j =2; i<=gcf; i=lcm*j,j++){
            if(gcf%i==0){ finalCount++;}
        }
        
        return finalCount;
    }
	
	static int findLCM(int[] a) {
		int result = a[0];
		for(int i= 1; i < a.length ; i++){
			result = findLCM(result, a[i]);
		}
		return result ;
	}
	
	static int findLCM(int a, int b){
		int min,max,lcm=1,x;
		if(a > b){
			min = b;
			max = a;
		}
		else {
			min = a;
			max = b;
		}
		for(int i = 1; i < max;i++) {
			x = max*i;
			if(x%min == 0) {
				lcm = x;
				break;
			}
			
		}
		
		return lcm;
	}
	
	 static int findGCF(int b[]){
	        int result = b[0];
	        for (int i = 1; i < b.length; i++) {
	            result = findGCF(result, b[i]);
	        }
	        return result;
	 }
	 
	 static int findGCF(int a,int b) {
	        List<Integer> numberList = new ArrayList<Integer>();
	        numberList.add(a);
	        numberList.add(b);
	        Integer maxNumber = Collections.max(numberList);
	       // int minNumber = Collections.max(numberList);
	        int gcf = 1;
	        for (int i = maxNumber; i > 1; i--) { // taking max number for iterating loop
	            boolean check = false;
	            for (int j = 0; j < numberList.size(); j++) {
	                if (numberList.get(j) % i == 0) {
	                    check = true;
	                } else {
	                    check = false;
	                    break;
	                }
	            }
	            if (check) {
	                for (int j = 0; j < numberList.size(); j++) {
	                    numberList.set(j, numberList.get(j) / i);
	                }
	                gcf *= i;
	                maxNumber = Collections.max(numberList);
	            }
	        }
	        
	        return gcf;
	    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }

}
