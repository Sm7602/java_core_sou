package _05_if_else;

import java.util.Scanner;

public class Problem07 {
	      public static void main(String[] arg)
	      {
	    	  /*WAP a company decided to give bonus of 5% to employee 
	    	  if his/her year of service is more than 5 year.  ask user for 
	    	  their salary and year of service and print the net bonus amount*/
	    	  
	    	  Scanner emp=new Scanner(System.in);
	    	  
	    	  System.out.print("Enter Your Sallary :");
	    	  int sal=emp.nextInt();
	    	  
	    	  System.out.print("Enter Your Sarvice Year :");
	    	  int yr=emp.nextInt();
	    	  
	    	  double bonus=(sal*0.05);
	    	  
	    	  if(yr>5)
	    	  {
	    		  System.out.println("Bonus :" +bonus);
	    		  System.out.println("Now Your Sallary :" +(sal+bonus));
	    	  }
	    	  else
	    	  {
	    		  System.out.println("Sorry !  We Have not To Take Any Bonus. ");
	    	  }
	      }

}
