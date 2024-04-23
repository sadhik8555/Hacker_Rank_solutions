package Algorithms;

import java.io.IOException;
import java.util.Scanner;

public class A_Very_Big_Sum {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(int arr []) {
    // Write your code here

        Long sum=0l;
    for (int i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    
    return sum;

    }




    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int a =sc.nextInt();
        
        int arr []=new int [a];
        
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        
        A_Very_Big_Sum res =new A_Very_Big_Sum ();
        
        System.out.print(res.aVeryBigSum(arr));
        
    }
}
