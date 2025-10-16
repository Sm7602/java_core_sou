package _15_Exception_Handling;

import java.util.Scanner;

public class _02_Finally {
	
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter : ");
		String str=sc.nextLine();
		
		try
		{
		System.out.println("heeeeee...........");
		System.out.println(str.length());
		System.out.println(str.charAt(32));
		}
		catch(Exception e)
		{
			if( e instanceof ArithmeticException)
			{
				System.err.println("ArithmeticException ayyaaa.........");
				e.printStackTrace();
			}
			else if( e instanceof NullPointerException)
			{
				System.err.println("NullPointerException ayyaaa.........");
				e.printStackTrace();
			}
			else if( e instanceof StringIndexOutOfBoundsException)
			{
				System.err.println("StringIndexOutOfBoundsException ayyaaa.........");
				e.printStackTrace();
			}
			else
			{
				e.printStackTrace();
			}
		}
		finally
		{
			sc.close();
		}
		
		
		System.out.println("done...........");
		
		
	}

}
