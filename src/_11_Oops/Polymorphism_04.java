package _11_Oops;
class BankAccount
{
	public double balance=0;
	
	
	public void Account()
	{
		
	}
	
	public void Deposit(double amount)
	{
		
	}
	public void Withdrawl(double amount)
	{
		
	}
}

class ChekingAccount extends BankAccount
{
	@Override
	public void Account()
	{
		System.out.println("_______ChekingAccount_______");
	}
	
	@Override
	public void Deposit(double amount)
	{
		System.out.println("DOPOSIT AMOUNT :$"+amount);
		balance += amount;
	}
	
	@Override
	public void Withdrawl(double amount)
	{
		System.out.println("WITHDRAWL AMOUNT :$"+amount);
		balance -=amount;
	}
	public void balance()
	{
		System.out.println(balance);
	}
	public void Balance()
	{
		System.out.println("BALANCE :$"+balance);
	}
}

class SevingAccunt extends BankAccount
{
	@Override
	public void Account()
	{
		System.out.println("_______SevingAccunt_______");
	}
	
	@Override
	public void Deposit(double amount)
	{
		System.out.println("DOPOSIT AMOUNT :$"+amount);
		balance += amount;
	}
	
	@Override
	public void Withdrawl(double amount)
	{
		System.out.println("WITHDRAWL AMOUNT :$"+amount);
		balance -=amount;
	}
	public void balance()
	{
		System.out.println(balance);
	}
	
	public void Balance()
	{
		System.out.println("BALANCE :$"+balance);
	}
}

class CraditCardAccount extends BankAccount
{
	public void Account()
	{
		System.out.println("_______CraditCardAccount_______");
	}
	
	public void Deposit(double amount)
	{
		System.out.println("DOPOSIT AMOUNT :$"+amount);
		balance += amount;
	}
	public void Withdrawl(double amount)
	{
		System.out.println("WITHDRAWL AMOUNT :$"+amount);
		balance -=amount;
	}
	public void balance()
	{
		System.out.println(balance);
	}
	public void Balance()
	{
		System.out.println("BALANCE :$"+balance);
	}
}

public class Polymorphism_04 {
	public static void main(String[] arg)
	{
		ChekingAccount ca=new ChekingAccount();
		ca.Account();
		ca.Balance();
		ca.Deposit(5000);
		ca.Balance();
		ca.Withdrawl(2000);
		ca.Balance();
		
		System.out.println("");
		
		SevingAccunt sa=new SevingAccunt();
		sa.Account();
		sa.Balance();
		sa.Deposit(2000);
		sa.Balance();
		sa.Withdrawl(500);
		sa.Balance();
		
		System.out.println("");
		
		CraditCardAccount cca=new CraditCardAccount();
		cca.Account();
		cca.Balance();
		cca.Deposit(50000);
		cca.Balance();
		cca.Withdrawl(30000);
		cca.Balance();

   }
  }
