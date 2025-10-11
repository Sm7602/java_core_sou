package _05_if_else;

import java.util.Scanner;

public class Problem04 {
	       public static void main(String[] arg)
	       {
	    	   /*WAP to take input age of person and 
	    	   check person is eligible for marriage or not*/
	    	   
	    	  Scanner person= new Scanner(System.in);
	    	  
	    	  System.out.print("Enter Your Age :");
	    	  int Age=person.nextInt();
	    	  System.out.println("Your Age is :" +Age);
	    	  
	    	  if(Age>=18)
	    	  {
	    		  System.out.println("You Are Eligable For Marriage");
	    	  }
	    	  else
	    	  {
	    		  System.out.println("No Need To Think It! ");
	    		  System.out.println("Becouse You Are Not Eligable For Marriage");
	    		  System.out.println("Focus On Your Career Not This");
	    	  }
	       }

}
