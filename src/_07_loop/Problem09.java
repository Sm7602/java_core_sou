package _07_loop;

import java.util.Scanner;

public class Problem09 {
	public static void main(String[] arg)
	{
		//reverse
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num :");
		int n =sc.nextInt();
		
		int rem;
		int r=0;
		
		for(;n>0;)
		{
			rem=n%10;
			r=(r *10)+rem;
			n=n/10;
			
		}
		System.out.print(r);
	}

}
