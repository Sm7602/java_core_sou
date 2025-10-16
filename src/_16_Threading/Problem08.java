package _16_Threading;

class withdrawTxoutOfBounds extends RuntimeException
{
	public withdrawTxoutOfBounds(String msg)
	{
		super(msg);
	}
}
class Bank_Account 
{
	double balance=1000.00;
	double req;
	synchronized public void Deposit( double req) throws InterruptedException
	{
		 System.out.println(req+" is Deposit successfully.......");
		 balance +=req;
		 System.out.println("Current balance.......\n"+balance);
	}
	synchronized public void Withdraw(double req) throws InterruptedException
	{
		if(req > balance)
		{
			try
			{
			throw new withdrawTxoutOfBounds("inefficent balance......");
			}
			catch(withdrawTxoutOfBounds e)
			{
				e.printStackTrace();
				
			}
		}
		else
		{
			 System.out.println(req+" is withdraw successfully.......");
			 balance -=req;
 		}
		
		 System.out.println("Current balance.......\n"+balance);

	}
}
class DepositThread extends Thread
{
	Bank_Account ac;
	double req;
	DepositThread(	Bank_Account ac,double req)
	{
		this.ac=ac;
		this.req=req;
	}
	@Override
	public void run()
	{
		try
		{
		ac.Deposit(req);
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
class WithdrawalThread2 extends Thread
{
	Bank_Account ac;
	double req;
	WithdrawalThread2(Bank_Account ac,double req)
	{
		this.ac=ac;
		this.req=req;
	}
	@Override
	public void run()
	{
		try
		{
		ac. Withdraw(req);
		Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
public class Problem08 {
	public static void main(String[] arg)
	{
		Bank_Account ac=new Bank_Account();
		
		DepositThread deposit=new DepositThread(ac,1000);
		WithdrawalThread2 withdrawl=new WithdrawalThread2(ac,1000);
		
		deposit.start();
		withdrawl.start();
		
	}

}
