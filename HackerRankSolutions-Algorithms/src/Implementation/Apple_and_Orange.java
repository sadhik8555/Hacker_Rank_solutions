package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class Apple_and_Orange {
	 /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, int arr1 [], int arr2 []) {
    // Write your code here
    for(int i=0;i<arr1.length;i++){
        arr1[i]+=a;
    }
    
     // Write your code here
    for(int i=0;i<arr2.length;i++){
        arr2[i]+=b;
    }
    int countA=0;
    
    for(int i=0;i<arr1.length;i++){
        if(arr1[i]>=s && arr1[i]<=t){
            countA++;
        }
    }
    
    int countB=0;
    
    for(int i=0;i<arr2.length;i++){
        if(arr2[i]>=s && arr2[i]<=t){
            countB++;
        }
    }
    System.out.println(countA);
    
    System.out.println(countB);
    

    }




    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner (System.in);
       
       int s=sc.nextInt();
       
       int t=sc.nextInt();
       
       int a=sc.nextInt();
       
       int b=sc.nextInt();
       
       int m=sc.nextInt();
       
       int n=sc.nextInt();
       
       int arr1 []=new int [m];
       
       int arr2 []=new int [n];
       
       
       for(int i=0;i<m;i++){
           arr1[i]=sc.nextInt();
       }
       
       for(int j=0;j<n;j++){
           arr2[j]=sc.nextInt();
       }
       
       
       
       countApplesAndOranges(s,t,a,b, arr1,arr2);
    }
}
