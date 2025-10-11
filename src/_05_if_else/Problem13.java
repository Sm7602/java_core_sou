package _05_if_else;

import java.util.Scanner;

public class Problem13 {
	public static void main(String[] arg)
	{
		//electric bill calculator
		
		Scanner cal=new Scanner(System.in);
		
		System.out.print("Enter the unit :");
		int u=cal.nextInt();
		
		 if( u >= 0 && u <= 100 )
		 {
			 System.out.println("Bill :" + u * 2);
		 }
		 else if( u >= 101 && u <= 200 )
		 {
			 System.out.println("Bill :" + (100 * 2 + (u-100) * 5));
		 }
		 else if( u >= 201 && u <= 300)
		 {
			 System.out.println("Bill :" + (100 * 2 + 100 * 5 +(u -200)*7));
		 }
		 else if( u >= 301 && u <= 400 )
		 {
			 System.out.println("Bill :" + (100 * 2 + 100 * 5 + 100 * 7 +(u-300)*10));
		 }
		 else if( u >= 401 && u <= 500)
		 {
			 System.out.println("Bill :" + (100 * 2 + 100 * 5 + 100 * 7 + 100 * 10 +(u -400)*12));
		 }
		 else if( u > 500)
		 {
			 System.out.println("Bill :" + (100 * 2 + 100 * 5 + 100 * 7 + 100 * 10 + 100 * 12 +(u -500)*15));
		 }
		 else
		 {
			 System.out.println("INVALID");
		 }
		 
		 
		 
	}

}
