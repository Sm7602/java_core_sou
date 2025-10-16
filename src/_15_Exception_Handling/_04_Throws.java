package _15_Exception_Handling;

import java.util.Scanner;

class withdrawTxoutOfBoundsException extends Exception
{
	public withdrawTxoutOfBoundsException(String msg)
	{
		super(msg);
	}
}

public class _04_Throws {
	// caller method to show the exception is used to throws
	
static double balance=100000;
	
	public static void withdraw(double reqamm)
	throws withdrawTxoutOfBoundsException
	{
		if(reqamm > balance)
		{
			throw new withdrawTxoutOfBoundsException("inificence balance.....");
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
		
		try
		{
		withdraw(reqamm);
		}
		catch(withdrawTxoutOfBoundsException e)
		{
			System.err.println("Aqad dekhi.......");
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}
	}

}
