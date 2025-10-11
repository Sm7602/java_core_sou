package _10_Function;

import java.util.Scanner;

//palindrome-non void

public class Problem09 {
	public static boolean pali(int n)
	{
		int rem;
		int rev=0;
		int org=n;
		
		while(n>0)
		{
			rem=n % 10;
			rev=(rev * 10) + rem;
			n=n / 10;
		}
		return (org==rev);
	}
	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num : ");
		int n=sc.nextInt();
		
		if(pali(n))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}


}
