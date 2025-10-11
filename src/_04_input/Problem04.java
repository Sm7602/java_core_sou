package _04_input;

import java.util.Scanner;

public class Problem04 {
	 public static void main(String[] arg)
	     {
//WAP in java input two variable  form user and print relation/compare between two variable
		 
		 Scanner sc= new Scanner(System.in);
		  
		 System.out.println("Enter frist variable value :");
		 int a=sc.nextInt();
		 
		 System.out.println("Enter sencond variable value :");
		 int b= sc.nextInt();
		 
		 
		 System.out.println("Two variable value is equal :"+(a==b));
		 System.out.println("Two variable value is not equal :"+(a!=b));
		 System.out.println("Frist variable value is greater than second variable value :"+(a>b));
		 System.out.println("Frist variable value is less than second variable value :"+(a<b));
		 System.out.println("Frist variable value is greater than & equal to second variable value :"+(a>=b));
		 System.out.println("Frist variable value is less than & equal to second variable value :"+(a<=b));
		 
		 
		 
	     }

}
