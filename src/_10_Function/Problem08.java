package _10_Function;

import java.util.Scanner;

//reverse-non void

public class Problem08 {
	public static int rev(int n)
	{
		int rev=0;
		int rem;
		
		while(n>0)
		{
			rem=n % 10;
			rev=(rev * 10) + rem;
			n=n / 10;
		}
		return rev;
		
	}
	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num : ");
		int n=sc.nextInt();
		
		System.out.println(rev(n));
		
	}

}
