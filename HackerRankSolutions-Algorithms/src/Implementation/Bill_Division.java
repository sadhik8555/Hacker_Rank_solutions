package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class Bill_Division {
	  /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(int arr [], int k, int b) {
    // Write your code here
            int bill=0;
        for(int i=0;i<arr.length;i++){
            if(i!=k){
              bill+=arr[i];  
            }
        }
        
        bill=bill/2;
        if(Math.abs(bill-b)==0){
            System.out.print("Bon Appetit");
        }
        else{
            System.out.print(Math.abs(bill-b));
        }
        
    }




    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

       int arr [] =new int [n];
       
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }

        int b = sc.nextInt();

        bonAppetit(arr, k, b);

        
    }
}
