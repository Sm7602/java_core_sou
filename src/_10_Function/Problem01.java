package _10_Function;

import java.util.Scanner;

//factor

public class Problem01 {
	
	public static void factor(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n % i == 0)
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] arg)
	{
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		factor(n);
		
	}

}
