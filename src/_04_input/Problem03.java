package _04_input;

import java.util.Scanner;

public class Problem03 {
          public static void main(String[] arg)
          {
//WAP in java to input form user and find the minimum value
        	  
        	  Scanner sc= new Scanner(System.in);
        	  
        	  System.out.print("Enter the frist number :");
        	  int a= sc.nextInt();
        	  
        	  System.out.print("Enter the second number :");
        	  int b=sc.nextInt();
        	  
        	  int min=(a<b)? a:b;;
        	  
        	  System.out.println("The minimum value :"+min);
          }
}
