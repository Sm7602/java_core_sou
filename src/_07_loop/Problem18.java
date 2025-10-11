package _07_loop;

import java.util.Scanner;

public class Problem18 {
	public static void main(String[] arg)
	{
		// power
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter base :");
		int b=sc.nextInt();
		
		System.out.print("Enter power :");
		int p=sc.nextInt();
		
		int i=1,m=b;
		
		while(i < p)
		{
			m *=b;
			i++;
		}
		
		System.out.println("power is : "+m);
		
	}

}
