package Implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Migratory_Birds {
	/*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(int [] arr) {
    // Write your code here
   
    int max =arr[0];
    for(int i=0;i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
        
    }
    
     int sol []=new int [max+1];
     
     System.out.println(max);
     
    for(int i=0;i<arr.length;i++){
    	 
        sol[arr[i]]+=1;
    	
    }
    int count=sol[0];
    int index=0;
    for(int i=0;i<sol.length;i++){
        if(sol[i]>count){
            count=sol[i];
            index=i;
        }
        
    }
    
    for(int i:sol) {
    	System.out.print(i+"    ");
    }
    System.out.println(index);
        return index;
    

}


    public static void main(String[] args)  {
       Scanner sc = new Scanner (System.in);
       
       int arrCount=sc.nextInt();

        int [] arr = new int [arrCount];

        for (int i = 0; i < arrCount; i++) {
            arr[i] = sc.nextInt();
        }

        int result = migratoryBirds(arr);

        System.out.println(result);
    }

}
