/**
 * 
 */
package algorithms.strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author sambit
 *
 */
class StrongPassword {
	
	private static String numbers = "0123456789";
	private static String lower_case = "abcdefghijklmnopqrstuvwxyz";
	private static String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static String special_characters = "!@#$%^&*()-+";
	
	// Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
    	if(n != password.length()) return 0;
    	boolean notContainsDigit = true;
    	boolean notContainsLowerCase = true;
    	boolean notContainsUpperCase = true;
    	boolean notContainsSpecial = true;
    	
    	int retVal = 0;
    	for(int i=0; i<n; i++) {
    		if(numbers.contains(String.valueOf(password.charAt(i)))) notContainsDigit =false;
    		if(lower_case.contains(String.valueOf(password.charAt(i)))) notContainsLowerCase = false;
    		if(upper_case.contains(String.valueOf(password.charAt(i)))) notContainsUpperCase = false;
    		if(special_characters.contains(String.valueOf(password.charAt(i)))) notContainsSpecial = false;
    	}
    	
    	if(notContainsDigit) retVal++;
    	if(notContainsLowerCase) retVal++;
    	if(notContainsUpperCase) retVal++;
    	if(notContainsSpecial) retVal++;
    	
    	if(n+retVal < 6) {
    		retVal+=6-n-retVal;
    	}
    	
    	return retVal;
    }
	
	
	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();

        String password = scanner.next();

        int answer = minimumNumber(n, password);
        System.out.println(String.valueOf(answer));

        scanner.close();
    }

}
