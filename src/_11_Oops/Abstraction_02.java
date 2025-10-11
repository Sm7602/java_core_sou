package _11_Oops;
abstract class BankAccount2
{
	public double balance=0;
	
	public abstract void Deposit(double amount);
	public abstract void Withdrawl(double amount);
	
	public  double getbalance()
	{
		return balance;
	}
}

class ChekingAccount2 extends BankAccount2
{
	public final String AcName="ChekingAccount2";
	public void AC()
	{
		System.out.println("______"+AcName+"______");
	}
	
	@Override
	public void Deposit(double amount)
	{
		System.out.println("DEPOSIT AMOUNT :$"+amount);
		balance +=amount;
		
	}
	
	@Override
	public void Withdrawl(double amount)
	{
		System.out.println("WITHDRAWL AMOUNT :$"+amount);
		balance -=amount;
	}
	public double getbalance()
	{
		return balance;
	}
}

class SevingsAccount2 extends  ChekingAccount2
{
	public final String AcName="SevingsAccount2";
	
	public void AC()
	{
		System.out.println("______"+AcName+"______");
	}
}

class CreditCardAccount2 extends  ChekingAccount2
{
	public final String AcName="CreditCardAccount2";
	
	public void AC()
	{
		System.out.println("______"+AcName+"______");
	}
}

public class Abstraction_02 {
	public static void main(String[] arg)
	{
		ChekingAccount2 ca=new ChekingAccount2();
		ca.AC();
		System.out.println("BALANCE :$"+ca.getbalance());
		ca.Deposit(2000);
		System.out.println("BALANCE :$"+ca.getbalance());
		ca.Withdrawl(1000);
		System.out.println("BALANCE :$"+ca.getbalance());
		
		System.out.println();
		
		SevingsAccount2 sa=new SevingsAccount2();
		sa.AC();
		System.out.println("BALANCE :$"+sa.getbalance());
		sa.Deposit(5000);
		System.out.println("BALANCE :$"+sa.getbalance());
		sa.Withdrawl(1000);
		System.out.println("BALANCE :$"+sa.getbalance());
		
		System.out.println();
		
		CreditCardAccount2 cca=new CreditCardAccount2();
		cca.AC();
		System.out.println("BALANCE :$"+cca.getbalance());
		cca.Deposit(10000);
		System.out.println("BALANCE :$"+cca.getbalance());
		cca.Withdrawl(6000);
		System.out.println("BALANCE :$"+cca.getbalance());
		
		
	}

}
