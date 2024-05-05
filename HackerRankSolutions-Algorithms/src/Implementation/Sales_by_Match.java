package Implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Sales_by_Match {
	 /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    for(int arr : ar){
        if(hm.containsKey(arr)){
            hm.put(arr, hm.get(arr)+1);
//            System.out.println(hm.get(arr)+1);

        }
        else{
            hm.put(arr, 1);
        }
    }
    int count=0;
    for (HashMap.Entry<Integer, Integer> entry : hm.entrySet()) {
        System.out.println(entry.getKey()+" : "+entry.getValue());
        int temp=entry.getValue();
        count+=(temp/2);
    }
    
    return count;

    }




    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = sc.nextInt();
            ar.add(arItem);
        }

        int result = sockMerchant(n, ar);
        
        System.out.print(result);

      
    }
}
