package _07_loop;

import java.util.Scanner;

public class Problem19 {
	public static void main(String[] erg)
	{
		// febonic series
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int n= sc.nextInt();
		
		int a=0,b=1,c;
		int i=1;
		
		System.out.println(a);
		System.out.println(b);
		 
		while(i <= n)
		{
			c= a+b;
			a= b;
			b=c;
			System.out.println(c);
			
			i++;
		}
	}

}
