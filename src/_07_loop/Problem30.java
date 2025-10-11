package _07_loop;

import java.util.Scanner;

public class Problem30 {
	public static void main(String[] arg)
	{
		//reverse
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter num :");
		int n=sc.nextInt();
		
		int rem;
		int r=0;
		
		do {
			rem= n % 10;
			r= (r * 10) + rem;
			n=n/10;
		}
		while(n > 0);
		System.out.print(r);
		
	}

}
