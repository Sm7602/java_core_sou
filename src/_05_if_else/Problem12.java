package _05_if_else;

import java.util.Scanner;

public class Problem12 {
	 public static void main(String[] arg)
	 {
		 //WAP to print grade
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Enter your mark :");
		 int mark=sc.nextInt();
		 
		 System.out.println("__________Your grade__________");
		 
		 if( mark >= 95 || mark <= 100 )
		 {
			 System.out.println(mark +"A+");
		 }
		 else if(mark >= 90 || mark <= 94)
		 {
			 System.out.println(mark +"A");
		 }
		 else if(mark >= 85 || mark <= 89 )
		 {
			 System.out.println(mark +" A-");
		 }
		 else if(mark >= 80  || mark <= 84  )
		 {
			 System.out.println(mark +" B+");
		 }
		 else if(mark >= 75  ||mark <= 79  )
		 {
			 System.out.println(mark +" B");
		 }
		 else if(mark >= 70 || mark <= 74 )
		 {
			 System.out.println(mark +" B-");
		 }
		 else if(mark >= 65 || mark <= 69  )
		 {
			 System.out.println(mark +" C+");
		 }
		 else if(mark >= 60 ||mark <= 64  )
		 {
			 System.out.println(mark +" C");
		 }
		 else if(mark >= 55 |mark <= 59 )
		 {
			 System.out.println(mark +" C-");
		 }
		 else if(mark >= 50 || mark <= 54  )
		 {
			 System.out.println(mark +" D+");
		 }
		 else if(mark >= 45  ||mark <= 49  )
		 {
			 System.out.println(mark +" D");
		 }
		 else if(mark >= 40 ||mark <= 44 )
		 {
			 System.out.println(mark +" D-");
		 }
		 else if(mark >= 0 ||mark <= 39)
		 {
			 System.out.println(mark +" FAIL");
		 }
		 
		 else
		 {
			 System.out.println(mark +" INVALID !");
		 }
	 }

}
