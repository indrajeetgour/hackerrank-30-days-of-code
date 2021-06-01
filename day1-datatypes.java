import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");

        int count =0;
        while (scan.hasNext()) {
            String num=scan.next();
            // System.out.println(count+":"+num);
            if( count == 0){
            System.out.println(Integer.parseInt(num)+i);    
            }
            if( count == 1){
            System.out.println(Double.parseDouble(num)+d);
            }
            if( count == 2){
            System.out.println(s+num);
            }
            count+=1;
            
        }

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
