package Algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compare_the_Triplets {
	  /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(int arr [], int arr1 []) {
        List<Integer> res = new ArrayList<Integer>();
        
        int count_of_arr=0;
        
        int count_of_arr1=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr1[i]){
        count_of_arr++;
                
            }
            else if(arr[i]<arr1[i]){
                count_of_arr1++;
            }
        }
        
        res.add(count_of_arr);
        
        res.add(count_of_arr1);
        
        
        
        return res;
    }




    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int arr [] = new int [3];
        
        for(int i=0;i<3;i++){
            arr[i]=in.nextInt();
        }
        
         int arr1 [] = new int [3];
        
        for(int i=0;i<3;i++){
            arr1[i]=in.nextInt();
        }
        
        Compare_the_Triplets result =new Compare_the_Triplets();
        
        List<Integer> response = new ArrayList<Integer>();
        
       response= result.compareTriplets(arr,arr1);
        
        for(int output : response){
            System.out.print(output+" ");
        }
        
    }
}