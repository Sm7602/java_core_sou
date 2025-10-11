package _10_Function;

import java.util.Scanner;

//factorial

public class problem03 {
	public static void fac(int n)
	{
		int m=1;
		
		for(int i=1;i<=n;i++)
		{
			m *=i;
		}
		System.out.print(m);
	}
	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
				
		System.out.print("Enter a num :");
		int n=sc.nextInt();
		
		fac(n);
	}

}
