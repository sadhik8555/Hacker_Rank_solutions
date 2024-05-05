package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class Cavity_Map {
	/*
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */
     public static int max(int[][]arr){
         int max=arr[0][0];
         for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length;j++){
                 if(arr[i][j]>max){
                     max=arr[i][j];
                 }
             }
         }
         
         return max;
     }
     
     public static boolean check(int arr [][],int i,int j,int max){
         
         if(arr[i-1][j]<max&&arr[i+1][j]<max&&arr[i][j-1]<max&&arr[i][j+1]<max){
             return true;
         }
         
         return false;
     }

    public static void cavityMap(int [] [] arr) {
    // Write your code here
        int max=max(arr);
        
        String [][] arr1=new String [arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr.length;j++){
                 arr1[i][j]=Integer.toString(arr[i][j]);
                 if(arr[i][j]==max&&i<=arr.length&&j<=arr.length&&i>=0&&j>=0){
                     if(check(arr,i,j,max)==true){
                        arr1[i][j]="X";
                     }
                 }
             }
         }
         
         for(String ar1 []: arr1){
             for(String ar2:ar1){
                 System.out.print(ar2);
             }
             System.out.println();
         }
        
    }


    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr [][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        cavityMap(arr);
    }
}
