/**
 * 
 */
package algorithms.implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author sambit
 *
 */
class EqualizeTheArray {
	// Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
    	int highestFrequency = 1;
    	HashMap<Integer,Integer> map = new HashMap<>();
    	for(int i=0; i<arr.length; i++) {
    		if(map.containsKey(arr[i])) {
    			map.put(arr[i], map.get(arr[i])+1);
    			highestFrequency = (map.get(arr[i])) > highestFrequency ? map.get(arr[i]) : highestFrequency;
    		}
    		else {
    			map.put(arr[i], 1);
    		}
    	}
    	return (arr.length-highestFrequency);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
    	int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        System.out.println(result);

        scanner.close();
    }

}
