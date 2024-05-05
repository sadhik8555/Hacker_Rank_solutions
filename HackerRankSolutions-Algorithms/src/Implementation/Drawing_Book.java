package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class Drawing_Book {
	 /*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {
    // Write your code here
    	if(p%2!=0){
            p=p-1;
        }
    int first=(0+p)/2;
    int last=(n-p)/2;
    return Math.min(first, last);

    }




    public static void main(String[] args) throws IOException {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = sc.nextInt();

        int result = pageCount(n, p);

       System.out.println(result);
    }
}
