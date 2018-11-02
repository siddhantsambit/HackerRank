/**
 * 
 */
package algorithms.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * @author sambit
 *
 */
class PickingNumbers {

	/**
	 * @param args
	 */
	
	/*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */
	public static int pickingNumbers(List<Integer> a) {
	    // Write your code here
		HashMap<Integer,Integer> frequencies = new HashMap<Integer,Integer>();
		for(int i : a) {
			if(frequencies.containsKey(i)) {
				frequencies.put(i, frequencies.get(i)+1);
			}
			else {
				frequencies.put(i, 1);
			}
		}
		
		int maxSet = 0;
		for(int i : frequencies.keySet()) {
			int left = (frequencies.containsKey(i-1) ? frequencies.get(i) + frequencies.get(i-1) : frequencies.get(i));
		    int right = (frequencies.containsKey(i+1) ? frequencies.get(i) + frequencies.get(i+1) : frequencies.get(i));
		    if(left > maxSet) {
		    	maxSet = left;
		    }
		    if(right > maxSet) {
		    	maxSet = right;
		    }
		
		}
		return maxSet;
	}
	
	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> a = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++) {
        	a.add(sc.nextInt());
        }

        System.out.println(pickingNumbers(a));
    }
	
	

}
