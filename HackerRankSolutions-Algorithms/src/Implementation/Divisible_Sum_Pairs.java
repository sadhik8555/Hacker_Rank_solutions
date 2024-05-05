package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class Divisible_Sum_Pairs {
	 /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, int arr []) {
    int count=0;
    for( int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length;j++){
            int p=arr[i]+arr[j];
            if(i<j&&i!=j&&p%k==0){
            	
            	System.out.println(arr[i]+" "+arr[j]);
                count++;
            }
        }
    }
    return count;
    }




    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=sc.nextInt();
            
        int arr [] =new int [n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
       
         System.out.print(divisibleSumPairs(n,k,arr)); 

        
    }
}
