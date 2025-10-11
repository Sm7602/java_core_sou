package _10_Function;

import java.util.Scanner;

//fibonic

public class Problem04 {
	public static void fibo(int n)
	{
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}

	}
	
   public static void main(String[] arg)
   {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.print("Enter a num : ");
	   int n=sc.nextInt();
	   
	   fibo(n);
   }

}
