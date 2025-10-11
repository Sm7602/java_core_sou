package _07_loop;

import java.util.Scanner;

public class Problem10 {
	public static void main(String[] arg)
	{
		//febenic 
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter num :");
		int n =sc.nextInt();
		
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		
		for(int i =0;i < n ;i++)
		{
		
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
			
	    }
		
		
		
	}

}
