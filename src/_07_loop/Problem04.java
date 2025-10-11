package _07_loop;

import java.util.Scanner;

public class Problem04 {
       public static void main(String[]  arg)
       {
    	   //factorial
    	   
    	   Scanner sc = new Scanner(System.in);
    	   
    	   System.out.print("Enter a number :");
    	   int n =sc.nextInt();
    	   
    	   int i,mul=1;
    	   
    	   for(i=1; i<=n;i++)
    	   {
    		    mul *= i;
    		    System.out.println(mul);
    	   }
       }
}
