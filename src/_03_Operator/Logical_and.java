package _03_Operator;

import java.util.Scanner;
public class Logical_and {
	public static void main(String[] arg)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter frist value :");
		int a=sc.nextInt();
		System.out.print("Enter second value :");
		int b=sc.nextInt();
		System.out.print("Enter third value :");
		int c=sc.nextInt();
		
		
		if(a>b && a>c)
		{
			System.out.println("a is max");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is max");
		}
		
		else if(c>a && c>b)
		{
			System.out.println("c is max");
		}

		System.out.println("----------------------");
		
		if(a != c && b != c && a==b )
		{
			System.out.println("a And b is equal");
		}
		else if(b != a && c != a && b==c )
		{
			System.out.println("b And c is equal");
		}
		else if(a != b && c != b && c==a)
		{
			System.out.println("a And c is equal");
		}
		
		else if(a == b && b == c && c == a)
		{
			System.out.println("a b c is equal");
		}
		
	}

}
