package warmup;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String delimiters = ":";
        String noSpace = "";
        String finalHours ="";
        
        String timeMatrix[] = time.split(delimiters);
        
        int hours = Integer.parseInt(timeMatrix[0]);
        
        String parts[] = timeMatrix[2].split(noSpace);
       
        String timeZ = parts[3] + parts[4];
        String seconds = parts[1]+parts[2];
        
        if(timeZ.equals("PM")) {
            if(hours == 12 ){
               finalHours =  Integer.toString(12);
            }
            else{
               finalHours =  Integer.toString(hours+12); 
            }
        }
        if(timeZ.equals("AM")) {
            if(hours == 12 ){
               finalHours =  "00";
            }
            else if(hours == 10 || hours == 11){
               finalHours = Integer.toString(hours);
            }
            else{
               finalHours = "0" + Integer.toString(hours); 
            }
        }
        System.out.println(finalHours + delimiters + timeMatrix[1] + delimiters + seconds);
        in.close();
    }
}
