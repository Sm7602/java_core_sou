package _05_if_else;

import java.util.Scanner;

public class Problem05 {
	    public static void main(String[] arg)
	    {
	    	/*WAP to input a cost of a pen and calculate 70 pens cost
	    	with some discount.if total cost greater than 1000 then 
	    	we calculate 20% discount otherwise 10%*/
	    	
	    	Scanner pen= new Scanner(System.in);
	    	
	    	System.out.print("Enter The Cost of Pen :");
	    	int cost=pen.nextInt();
	    	
	    	System.out.print("Please Enter How Much Pen You Buy :");
	    	int n=pen.nextInt();
	    	
	    	int Total=(cost*n);
	    
	    	System.out.println("Total :$" +(Total));
	    	
	    	double dis1=Total*0.20;
	    	double dis2=Total*0.10;
	    	
	    	
	    	if(Total>1000)
	    	{
	    		System.out.println("Discount 20% :$" +(dis1));
	    		System.out.println("You Have To Pay:$"+(Total-dis1));
	    	}
	    	else
	    	{
	    		System.out.println("Discount 10% :$" +(dis2));
	    		System.out.println("You Have To Pay:$"+(Total-dis2));
	    	}
	    	
	    	
	    }
	

}
