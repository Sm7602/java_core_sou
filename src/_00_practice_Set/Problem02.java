package _00_practice_Set;
//Given an array of integers nums and an integer target
//return indices of the two numbers such that they add up to target.

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		 int arr[]=new int[]{4,2,5,6,7};
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		 }
		 
		 System.out.print("traget : ");
		 int target=sc.nextInt();
		 
		 int flag=0;
		 for(int j=0;j<arr.length-1;j++)
		 {
			 for(int k=1;k<arr.length;k++)
			 {
				 if((arr[j]+arr[k])==target)
				 {
					 System.out.print(j +","+k);
					 flag = 1;
					 break; 
				 }
				  
			 }
			 if(flag==1)
			 {
				 break;
			 }
		 }
	}

}
