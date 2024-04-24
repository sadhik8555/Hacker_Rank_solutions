package Algorithms;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Plus_Minus {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(int arr []) {
    // Write your code here
    
    Float positive=0f;
    Float negative=0f;
    Float zero=0f;
    Integer sizeOfarray=arr.length;
    for (Integer i : arr) {
    if(i>0) positive++;
    else if(i<0)negative++;
    else zero++;
}
    DecimalFormat df = new DecimalFormat("#0.000000");
    System.out.println(df.format(positive/sizeOfarray));
    System.out.println(df.format(negative/sizeOfarray));
     System.out.println(df.format(zero/sizeOfarray));



    }




    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        
        int n=sc.nextInt();
        
        int arr [] =new int [n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        
        plusMinus(arr);
    }
}
