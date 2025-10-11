package _05_if_else;

import java.util.Scanner;

public class Problem17 {
	public static void main(String[] arg)
	{
		//electric bill calculator using nested if
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter unit :");
		int u=sc.nextInt();
		
		if(u >= 0)
		{
			if(u <= 100)
			{
			  System.out.println("Bill " + u*2);
			}
			else
			{
				if(u <= 200)
				{
					System.out.println("Bill " + (100*2 +(200-u)*5));
				}
				else
				{
				    if(u <= 300)
					{
						System.out.println("Bill " + (100*2+100*5+(300-u)*7));
					}
				    else
				    {
				    	 if(u <= 400)
							{
								System.out.println("Bill " + (100*2+100*5+100*7+(400-u)*10));
							}
				    	 else
				    	 {
				    		 if(u <= 500)
								{
									System.out.println("Bill " + (100*2+100*5+100*7+100*10+(500-u)*12));
								}
				    		 else
				    		 {
				    			 System.out.println("Bill " + (100*2+100*5+100*7+100*10+100*12+(u-500)*15));
				    		 }
				    	 }
				    }
				}
			}
		}
     else
		{
			System.out.println("Invalid");
		}
		
		if(u >= 0)
		{
			if(u <= 100)
			{
			  System.out.println("Bill " + u*2);
			}
			else if(u <= 200)
			{
			 System.out.println("Bill " + (100*2 +(200-u)*5));
			}
			else  if(u <= 300)
			{
			 System.out.println("Bill " + (100*2+100*5+(300-u)*7));
			}
			else if(u <= 400)
			{
			 System.out.println("Bill " + (100*2+100*5+100*7+(400-u)*10));
			}
		    else if(u <= 500)
			{
			 System.out.println("Bill " + (100*2+100*5+100*7+100*10+(500-u)*12));
			}
		    else if(u > 500)
		    {
			 System.out.println("Bill " + (100*2+100*5+100*7+100*10+100*12+(u-500)*15));
		    }
				    	 
				    }
     else
		{
			System.out.println("Invalid");
		}
	}

}
