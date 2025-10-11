package _08_Nested_loop;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] arg)
	{
		//print
		/*
		   12345
		   2345
		   345
		   45
		   5		
		    */
		
		Scanner sc=new Scanner(System.in);
		
		 System.out.print("Enter a number");
		 int n= sc.nextInt();
		 
		 for(int i =1; i<=n; i++)
		 {
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
	}

}
