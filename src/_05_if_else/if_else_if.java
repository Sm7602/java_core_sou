package _05_if_else;

import java.util.Scanner;

public class if_else_if {
	      public static void main(String[] arg)
	      {
	    	  Scanner sc=new Scanner(System.in);
			   
			   System.out.print("Enter The Frist Number :");
			   int a=sc.nextInt();
			   
			   System.out.print("Enter The Second Number :");
			   int b=sc.nextInt();
			   
			   
			   if(a>b)
			   {
				   System.out.println("Frist Number is max");
			   }
			   else if(b>a)
			   {
				   System.out.println("Second number is max");
			   }
			   else
			   {
				   System.out.println("number are equal");
			   }
		   }


}
