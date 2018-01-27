/**
 * 
 */
package algorithms.implementation;

import java.util.Scanner;

/**
 * @author BABAI
 *
 */
class DesignerPDFViewer {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean flag = false;
        int count1 = 0;
        int count2 = 0;
        while(flag != true){
            if(x2 > x1 && v2 >= v1){
                break;
            }
            if(x1 > x2 && v1 >= v2){
                break;
            }
            x1 += v1;
            count1++;
            x2 += v2;
            count2++;
            if(x1 == x2){
                flag = true;
                break;
            } 
        }
        
        if(flag == true && count1 == count2) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO"); 
        }
        
        in.close();
    }
}
