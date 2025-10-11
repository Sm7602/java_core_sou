package _06_Switch;

import java.util.Scanner;

public class Problemo3 {
	public static void main(String[] arg)
	{
		//WAP to input form user a num and print weekdays
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter a num b/w (1-7) :");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1 :
			System.out.println("SUNDAY");
			break;
			
		case 2 :
			System.out.println("MANDAY");
			break;
			
		case 3 :
			System.out.println("TUESDAY");
			break;
			
		case 4 :
			System.out.println("WEDNESDAY");
			break;
			
		case 5 :
			System.out.println("TURSDAY");
			break;
			
		case 6 :
			System.out.println("FRIDAY");
			break;
			
		case 7 :
			System.out.println("SATERDAY");
			break;
			
		default:
			System.out.println("INVALID INPUT");
			
			
		}
	}

}
