package _10_Function;

import java.util.Scanner;

public class Problem02 {
		public static void reverse(int n)
		{
			//reverse
			
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
		
	   public static void main(String[] arg)
	   {
		   Scanner sc= new Scanner(System.in);
			
			System.out.print("Enter a num :");
			int n =sc.nextInt();
			
			reverse(n);
	   }


}
