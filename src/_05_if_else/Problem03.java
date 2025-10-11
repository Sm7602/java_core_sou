package _05_if_else;

import java.util.Scanner;

public class Problem03 {
	    public static void main(String[] arg)
	   
	    {
	    	//WAP to check the enter number is negative or positive
	    	
	    	Scanner sc= new Scanner(System.in);
	    	
	    	System.out.print("Enetr The Number :");
	    	int n=sc.nextInt();
	    	System.out.println("You Entered :" +n);
	    	
	    	if(n>0)
	    	{
	    		System.out.println("That is Positive Number");
	    	}
	    	else
	    	{
	    		System.out.println("That is Negative Number");
	    	}
	    }

}
