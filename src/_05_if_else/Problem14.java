package _05_if_else;

import java.util.Scanner;

public class Problem14 {
	public static void main(String[] arg)
	{
		//WAP to check leap year 
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Year :");
		int y=sc.nextInt();
		
		if(y % 4 ==0 )
		{
			System.out.println( y + " Leap Year");
		}
		else {
			System.out.println( y + " Not Leap Year");
		}
	}

}
