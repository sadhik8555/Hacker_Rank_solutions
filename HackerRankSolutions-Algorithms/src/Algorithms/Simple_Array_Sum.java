package Algorithms;

import java.io.IOException;
import java.util.Scanner;

public class Simple_Array_Sum {
	 /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(int arr []) {
    // Write your code here
    int sum=0;
    for (int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    
    return sum;

    }



    public static void main(String[] args) throws IOException {
         Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        
        int arr [] = new int [a];
        
        for(int i=0;i<a;i++){
            arr[i]=in.nextInt();
        }
        
        int sum;
        
        Simple_Array_Sum res =new Simple_Array_Sum();
       
        sum = res.simpleArraySum(arr);
        System.out.println(sum);
  
}
}
