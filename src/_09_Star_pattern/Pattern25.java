package _09_Star_pattern;

import java.util.Scanner;

public class Pattern25 {
     public static void main(String[] arg)
     {
    	//print
 		/*
 		    *                *
 		    ***            ***
 		    *****        *****
 		    *******    *******
 		    ******************
 		    ******************
 		    *******    *******
 		    *****        *****
 		    ***            ***
 		    *                *
 		 */
 		
 		Scanner sc=new Scanner(System.in);
 		
 		System.out.print("Enter row : ");
 		int r=sc.nextInt();
 		
 		//upper
 		
 		for(int i=1;i<=r;i++)
 		{
 			for(int j=1;j<=r*4-2;j++)
 			{
 				if(j>i*2-1 && j<=(r*4-2)-i*2+1 )
 				{
 					System.out.print(" ");
 				}
 				else
 				{
 					System.out.print("*");
 				}
 			}
 			System.out.println();
 		}
 		
 		//lower
 		
 		for(int i=r;i>=1;i--)
 		{
 			for(int j=1;j<=r*4-2;j++)
 			{
 				if(j>i*2-1 && j<=(r*4-2)-i*2+1)
 				{
 					System.out.print(" ");
 				}
 				else
 				{
 					System.out.print("*");
 				}
 			}
 			System.out.println();
 		}
     }
}
