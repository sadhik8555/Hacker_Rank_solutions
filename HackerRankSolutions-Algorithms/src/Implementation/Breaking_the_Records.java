package Implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Breaking_the_Records {
    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(int arr []) {
    // Write your code here
        List<Integer> ll=new ArrayList<Integer>();
         
         int min=arr[0];
         
         int max=arr[0];
         
         int minCount=0;
         
         int maxCount=0;
         
         for(int i=1;i<arr.length;i++){
            
             
             if(arr[i]<=min){
                 minCount++;
                 min=arr[i];
             }
             else if(arr[i]>=max){
                 maxCount++;
                 max=arr[i];
             }
             
         }
        
        
        ll.add(maxCount);
        ll.add(minCount);
        
        
        for(int l:ll){
            System.out.print(l+" ");
        }
        
        
        return ll;
    }



    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int arr []=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
      
        breakingRecords(arr);
    }
}
