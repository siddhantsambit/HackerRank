/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
public class DayOfTheProgrammer {
	static String solve(int year){
        // Complete this function
		String date = "";
		if(year == 1918) {
			date = "26.09." + year;
		}
		else if(year < 1918) {
			date = (year % 4 == 0) ? "12.09." + year : "13.09." + year;
		}
		else if(year > 1918){
			date = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
		}
		return date;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
        in.close();
    }
}
