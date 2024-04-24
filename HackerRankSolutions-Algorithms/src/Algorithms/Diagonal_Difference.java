package Algorithms;

import java.io.IOException;
import java.util.Scanner;

public class Diagonal_Difference {
	 /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(int arr [][]) {
    // Write your code here
    int left=0;
    for(int i=0;i<arr.length;i++){
        left+=arr[i][i];
    }
    int right =0;
    for(int j=0;j<arr.length;j++){
        right+=arr[arr.length-1-j][0+j];
    }
    int sum =left-right;
    sum=Math.abs(sum);
        return sum;
    }




    public static void main(String[] args) throws IOException {
       Scanner  sc =new Scanner (System.in);
       
       int n=sc.nextInt();
       
       int arr [][]=new int [n][n];
       for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr.length;j++){
               arr[i][j]=sc.nextInt();
           }
       } 
      
       
      System.out.print(diagonalDifference(arr));
    }
}
