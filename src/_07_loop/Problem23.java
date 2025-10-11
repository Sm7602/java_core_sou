package _07_loop;

import  java.util.Scanner;

public class Problem23 {
	public static void main(String[] arg)
	{
		//print series
		/*
		   1
		   0
		   1
		   0
		   1
		   0
		   1
		   0
		   1
		   0
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a  num :");
		int n=sc.nextInt();
		
		int i =1;
		
		do {
			System.out.println("1\n0");
			i++;
		}
		while(i <= n);
				
	}

}
