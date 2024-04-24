package Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Staircase {
	

	    /*
	     * Complete the 'staircase' function below.
	     *
	     * The function accepts INTEGER n as parameter.
	     */

	    public static void staircase(int n) {
	    // Write your code here
	    
	    for(int i=0;i<n;i++){
	        for(int j=i;j<n-1;j++){
	            System.out.print(" ");
	        }
	        for(int k=0;k<=i;k++){
	            System.out.print("#");
	        }
	        System.out.println();
	    }

	    }

	
	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        staircase(n);

	        bufferedReader.close();
	    }
	}
