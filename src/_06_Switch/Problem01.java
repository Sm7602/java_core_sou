package _06_Switch;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] arg)
	{
		//WAP to create a grocery calculator
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("<<<<<<WLECOME>>>>>>>");
		System.out.println("MENU");
		System.out.println("press 1 for SUGER");
		System.out.println("press 2 for SALT");
		System.out.println("press 3 for TEA");
		System.out.println("press 4 for COFFEE");
		System.out.println("press 5 for NAMKEEN");
		System.out.println("press 6 for KURKURE");
		System.out.println("press 7 for CHIPS");
		System.out.println("press 8 for BISCUIT");
		System.out.println("press 9 for COLGATE");
		System.out.println("press 10 for PEN");
		
		System.out.print("press :");
		int num=sc.nextInt();
		
		int unit=0,total=0;
		
		
		switch(num)
		{
		case 1:
			System.out.println("Enter how many unit you buy.per unit Rs.50");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 50;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 2:
			System.out.println("Enter how many unit you buy.per unit Rs.60");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 60;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 3:
			System.out.println("Enter how many unit you buy.per unit Rs.70");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 70;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 4:
			System.out.println("Enter how many unit you buy.per unit Rs.80");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 80;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 5:
			System.out.println("Enter how many unit you buy.per unit Rs.100");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 100;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 6:
			System.out.println("Enter how many unit you buy.per unit Rs.20");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 20;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 7:
			System.out.println("Enter how many unit you buy.per unit Rs.20");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 20;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 8:
			System.out.println("Enter how many unit you buy.per unit Rs.30");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 30;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 9:
			System.out.println("Enter how many unit you buy.per unit Rs.150");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 150;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		case 10:
			System.out.println("Enter how many unit you buy.per unit Rs.10");
			System.out.print("Unit :");
			unit = sc.nextInt();
			total =unit * 10;
			System.out.println("THANK YOU Sir/Ma'am You have to pay :RS." +total);
			break;
			
		default :
			System.out.println("INVALID INPUT");
		}
		
		
	}

}
