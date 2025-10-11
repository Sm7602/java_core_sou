package _16_Exception_Handling;

import java.util.Scanner;

class withdrawTxoutOfBounds extends RuntimeException
{
	public withdrawTxoutOfBounds(String msg)
	{
		super(msg);
	}
}

public class _03_Throw {
	// only for customize exception throw is used
	
	static double balance=100000;
	
	public static void withdraw(double reqamm)
	{
		
		if(reqamm > balance)
		{
			try
			{
			throw new withdrawTxoutOfBounds("inificence balance.....");
			}
			catch(withdrawTxoutOfBounds e)
			{
				System.err.println("Aqad dekhi.......");
				e.printStackTrace();
			}
			 
		}
		else
		{
			System.out.println("withdrawal sucesssfull");
			System.out.println("current balance : "+(balance-reqamm));
		}
	}
	
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("withdrawl   : ");
		double reqamm=sc.nextDouble();
		
		withdraw(reqamm);
		sc.close();
		
	}

}
