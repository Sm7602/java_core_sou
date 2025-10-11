package _05_if_else;

import java.util.Scanner;

public class Problem01 {
	           public static void main(String[] arg)
	           {
	        	   //WAP to check the enter number is odd or even
	        	   
	        	   Scanner sc=new Scanner(System.in);
	        	   
	        	   System.out.print("Enter the Number :");
	        	   int n=sc.nextInt();
	        	   System.out.println("The Number is :"+n);
	        	   
	        	   if(n%2==0)
	        	   {
	        		   System.out.println("That is Even Number");
	        	   }
	        	   else
	        	   {
	        		   System.out.println("That is Odd Number");
	        	   }
	        	   
	        	   
	        	   
	           }

}
