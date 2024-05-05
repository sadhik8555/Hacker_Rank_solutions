package Implementation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Electronics_Shop {
	 /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
    	int max=-1;
    	for(int i=0;i<keyboards.length;i++) {
    		for(int j=0;j<drives.length;j++) {
    			int temp=keyboards[i]+drives[j];
    			if(temp<=b) {
    				if(max<=temp) {
    					max=temp;
    				}
    			}
    		}
    	}
    	return max;

    }

    private static final Scanner sc= new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       int b=sc.nextInt();
       
       int n=sc.nextInt();
       
       int m=sc.nextInt();
       
       int [] keyboards=new int [n];
       
       int [] drives =new int [m];
       
       for(int i=0;i<keyboards.length;i++) {
    	   keyboards[i]=sc.nextInt();
       }
       
       for(int j=0;j<drives.length;j++) {
    	   drives[j]=sc.nextInt();
       }
       
       int result=getMoneySpent(keyboards,drives, b);
       
       System.out.print(result);
    }
}
