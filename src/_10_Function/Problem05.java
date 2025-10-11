package _10_Function;

import java.util.Scanner;

//power

public class Problem05 {
	public static void power(int b,int p)
	{
		int m=b;
		
		for(int i=1;i<p;i++)
		{
			m *=b;
		}
		System.out.println(m);
	}
	
	 public static void main(String[] arg)
	   {
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.print("Enter base : ");
		   int b=sc.nextInt();
		   
		   System.out.print("Enter power : ");
		   int p=sc.nextInt();
		   
		   power(b,p);
	   }


}
