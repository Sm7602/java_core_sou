package _05_if_else;

import java.util.Scanner;

public class Problem15 {
	public static void main(String[] arg)
	  //WAP to find grade using nested if else
	{
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Enter your number");
		 int m=sc.nextInt();
		 
		 if(m <= 100)
		 {
			 if(m >= 90)
			 {
				 System.out.println(m + " A+ grade");
			 }
			 else if(m >= 70)
			 {
				 System.out.println(m + " B+ grade");
			 }
			 else if(m >= 60)
			 {
				 System.out.println(m + " C+ grade");
			 }
			 else
			 {
				 System.out.println(m + " FAil");
			 }
			 
		 }
		 else
			 {
				 System.out.println(m + " INVALID");
			 }
		 
    }
 
}
