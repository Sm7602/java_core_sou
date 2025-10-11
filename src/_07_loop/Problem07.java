package _07_loop;

import java.util.Scanner;

public class Problem07 {
	 public static void main(String[] arg)
	 {
		 // prime number
		 
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.print("Enster a num :");
		 int n= sc.nextInt();
		 
		 
		 int c=0;
		 
		 for(int i=2;i<n; i++)
		 {
			if(n % i == 0)
			{
				c++;
			}
		 }
		 if(c<1)
		 {
			 System.out.println("prime");
		 }
		 else
		 {
			 System.out.println("not prime");
		 }
		 
	 }

}
