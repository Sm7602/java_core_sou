package _10_Function;

import java.util.Scanner;

//palindrome
public class Problem06 {
	public static void pali(int n)
	{
		int rev=0;
		int rem;
		int org=n;
		
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
		
		if(org==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num :  ");
		int n=sc.nextInt();
		
		pali(n);
	}

}
