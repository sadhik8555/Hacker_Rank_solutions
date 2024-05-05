package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class Strange_Counter {
	 /*
     * Complete the 'strangeCounter' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER t as parameter.
     */

    public static int strangeCounter(int t) {
    // Write your code here
    	if(t>3) {
    		return strangecount(t-3,3*2);
    	}
    	else {
    		
    		return 3-t+1;
    		
    	}

    }




    private static int strangecount(int l, int t) {
    	System.out.println(l+" "+t+" "+111);
		if(l<=0) {
			System.out.println(t+" "+"t"+222);
			return t+1;
		}
		else if(l<t){
			
			System.out.println(t-l+"  "+"t"+333);
			return t-l+1;
			
		}
		
		return strangecount(l-t, (t*2));
		
	}




	public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner (System.in);
        int t = sc.nextInt();

        long result = strangeCounter(t);

        System.out.print(result);
    }
}
