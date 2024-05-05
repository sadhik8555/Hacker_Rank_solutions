package Implementation;


import java.io.IOException;
import java.util.Scanner;

public class Counting_Valleys {
	  /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
//     Write your code here
    
    int present=0;
    
    int count=0;
    
    for(int i=0; i<path.length();i++){
         char s1= path.charAt(i);
         char s2='U';
     	System.out.println(s1);
     	
    	System.out.println(s2);


        if(s1==s2){
        	System.out.println("111");
            present+=1;
        }
        else{
        	System.out.println("222");

            present-=1;
        }
        
        if(present>0){
        	System.out.println("333"+" "+present);

            count+=1;
        }
        
    }
    
    return count;

    }


    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int steps = sc.nextInt();

        String path = sc.next();

        int result = countingValleys(steps, path);
        	System.out.println(result);
    }
}
