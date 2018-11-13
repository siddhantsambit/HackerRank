/**
 * 
 */
package algorithms.strings;

import java.util.Scanner;

/**
 * @author sambit
 *
 */
class SeparateTheNumbers {

	
	// Complete the separateNumbers function below.
    static void separateNumbers(String s) {
    	long flag = 0;
    	if(s.charAt(0) == '0') {
    		flag = -1;
    	}
		if (flag == 0) {
			for (int length = 1; length * 2 <= s.length(); length++) {
				long firstNumber = Long.parseLong(s.substring(0, length));

				StringBuilder sequence = new StringBuilder();
				long number = firstNumber;
				while (sequence.length() < s.length()) {
					sequence.append(number);
					number++;
				}
				if (sequence.toString().equals(s)) {
					flag = firstNumber;
					break;
				}
			}
		}
    	if(flag <= 0 ) {
    		System.out.println("NO");
    	}
    	else {
    		System.out.println("YES "+flag);
    	}
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.next();

            separateNumbers(s);
        }

        scanner.close();
    }

}
