package Implementation;

import java.io.IOException;
import java.util.Scanner;

public class Grading_Students {
	 /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
     
    static int roundUp(int num) {
    return ((num / 5) + (num % 5 > 0 ? 1 : 0)) * 5;
}

    public static void gradingStudents(int n) {
    // Write your code here
       if(n<38){
           System.out.println(n);
       }
       else if(n>=38){
           int round=roundUp(n);
           
           if((round-n)<3){
               System.out.println(round);
       }
       else{
           System.out.println(n);
       }
               
           }
           
           
    }




    public static void main(String[] args) throws IOException {
       Scanner sc=new Scanner(System.in);
       
       int n=sc.nextInt();
       
       for(int i=0;i<n;i++){
           
           int m=sc.nextInt();
           gradingStudents(m);
       }
    }
}
