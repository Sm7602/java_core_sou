package _09_Star_pattern;

import java.util.Scanner;

public class Pattern11 {
	public static void main(String[] arg)
	{
		//print
				/*
				 
				  *   *
				   * *
				    *
				   * *
				  *   * 
				     
				 */
				
				Scanner sc= new Scanner(System.in);
				
				System.out.print("Enter row : ");
				int r=sc.nextInt();
				
				for(int i=0;i<=r;i++)
				{
					
					for(int j=0;j<=r;j++)
					{
						if(j==i || j==r-i )
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
						
					 }	
					
				System.out.println();
				}
	}

}
