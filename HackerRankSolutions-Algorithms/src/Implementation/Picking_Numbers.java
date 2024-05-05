package Implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Picking_Numbers {
	/*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(int arr []) {
    	int max=0;
    	for(int i=0; i<arr.length;i++) {
    		
    		List<Integer> arr1=new ArrayList<Integer>();
    		arr1.add(arr[i]);
    		for(int j=0;j<arr.length;j++) {
    			if(j!=i) {
    			
//    			System.out.print(arr1.get(arr1.size()-1)-arr[j]	);
    			if(Math.abs(arr1.get(arr1.size()-1)-arr[j])==1||Math.abs(arr1.get(arr1.size()-1)-arr[j])==0) {
    				arr1.add(arr[j]);
    				
    				
    			}
    			
    			if(max<arr1.size()) {
    				max=arr1.size();
    			}
    			}
    		}
    		for(int ar1:arr1) {
    			System.out.print(ar1+"   ");
    		}
    		System.out.println();
    	}
    	
		return max;
    // Write your code here

    }




    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        int [] arr =new int [n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int result =pickingNumbers(arr);
        System.out.print(result);
       
    }
}
