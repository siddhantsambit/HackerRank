/**
 * 
 */
package algorithms.strings;

import java.util.Scanner;

/**
 * @author sambit
 *
 */
class SuperReducedString {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();
        while(true){
            int len = s.length();
            s= s.replaceAll("(.)\\1","");
            if(s.length() == len){
                break;
            }
        }
        System.out.println((s.isEmpty()) ? "Empty String" : s);
    }

}
