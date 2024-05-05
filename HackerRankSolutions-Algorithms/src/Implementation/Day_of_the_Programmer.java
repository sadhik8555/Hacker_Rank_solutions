package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day_of_the_Programmer {
	 /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static void dayOfProgrammer(int year) {
    // Write your code here
    	if(year%100==0){
    		System.out.print("000");
    	    if(year%4==0&&year%400==0){
    	    	
    	    	System.out.println("1111");
    	        
    	        System.out.print("12.09."+year);
    	        
    	    }
    	    else{
    	    	System.out.println("1111");
    	        System.out.print("13.09."+year);
    	    
    	    }
    	    }
    	    else {
    	        if(year%4==0){
    	        	System.out.println(year%10);
    	        	System.out.println("222");
    	        
    	        System.out.print("12.09."+year);
    	        
    	    }
    	    else{
    	    	System.out.println(year%10);
    	    	System.out.println("3333");
    	        System.out.print("13.09."+year);
    	    
    	    }
    	        
    	    }

    	    }

    	



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       
        int year = Integer.parseInt(bufferedReader.readLine().trim());

        dayOfProgrammer(year);

       
    }
}
