package _10_Function;

import java.util.Scanner;

//factorial-non void

public class problem07 {
	public static int fac(int n)
	{ 
		int m=1;
		for(int i=1;i<=n;i++)
		{
			m *=i;
		}
		return m;
	}
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a num : ");
		int n=sc.nextInt();
		
		System.out.println(fac(n));
		
		
	}

}
