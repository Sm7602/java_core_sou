package _05_if_else;

import java.util.Scanner;

public class Problem08 {
	     public static void main(String[] arg)
	     {
	    	 //WAP to input from user and print weekdays name
	    	 
	    	 Scanner sc= new Scanner(System.in);
	    	 
	    	 System.out.print("Enter the number weekdays b/w(1-7) : ");
	    	 int n=sc.nextInt();
	    	 
	    	 if(n == 1)
	    	 {
	    		 System.out.println("DAY IS MANDAY");
	    	 }
	    	 else if(n == 2)
	    	 {
	    		 System.out.println("DAY IS TUESDAY");
	    	 }
	    	 else if(n == 3)
	    	 {
	    		 System.out.println("DAY IS WEDNESDAY");
	    	 }
	    	 else if(n == 4)
	    	 {
	    		 System.out.println("DAY IS THURSDAY");
	    	 }
	    	 else if(n == 5)
	    	 {
	    		 System.out.println("DAY IS FRIDAY");
	    	 }
	    	 else if(n == 6)
	    	 {
	    		 System.out.println("DAY IS SATURDAY");
	    	 }
	    	 else if(n == 7)
	    	 {
	    		 System.out.println("DAY IS SUNDAY");
	    	 }
	    	 else
	    	 {
	    		 System.out.println("INVALID");
	    	 }
	    	 
	    	 
	    	 
	    	 
	     }

}
