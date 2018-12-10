package algorithms.strings;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author sambit
 *
 */
public class GameOfThrones {
	
	// Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
    	Map<Character,Integer> map = new HashMap<Character,Integer>();
    	for(char c : s.toCharArray()) {
    		if(map.containsKey(c)) {
    			map.put(c, map.get(c)+1);
    		}
    		else {
    			map.put(c, 1);
    		}
    	}
    	int odd=0;
    	for(int i: map.values()){
    		if(i%2 == 1) {
    			odd++;
    		}
    	}
    	if(odd>1) {
    		return "NO";
    	}
    	else {
    		return "YES";
    	}
    }
	private static final Scanner scanner = new Scanner(System.in);
	/**
	 * @param args
	 */
    public static void main(String[] args) throws IOException {
        String s = scanner.nextLine();
        String result = gameOfThrones(s);
        System.out.println(result);
        scanner.close();
    }
}
