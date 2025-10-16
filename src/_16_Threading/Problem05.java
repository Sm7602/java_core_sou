package _16_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class IneficentBalanceException extends RuntimeException
{
	public IneficentBalanceException(String msg)
	{
		super(msg);
	}
}
class WithdrawalThread implements Runnable
{
	private static double balance=40000;
	public double amount;
	public WithdrawalThread(double amount)
	{
		this.amount=amount;
	}
	public void run()
	{
		if(amount > balance)
		{
			try {
			throw new IneficentBalanceException("Ineficent amount");
			}
			catch(IneficentBalanceException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("Try to withdrawal $"+amount +" Successfull.....");
			balance -=amount;
			System.err.println("Current balance $"+balance+"\n");
			try
			{
			Thread.sleep(2000);
			}
			catch( InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Problem05 {
	
	public static void main(String [] arg)
	{
		WithdrawalThread w1=new WithdrawalThread(300);
		WithdrawalThread w2=new WithdrawalThread(400);
		WithdrawalThread w3=new WithdrawalThread(2000);
		WithdrawalThread w4=new WithdrawalThread(100);
		WithdrawalThread w5=new WithdrawalThread(200);
		WithdrawalThread w6=new WithdrawalThread(40);
		WithdrawalThread w7=new WithdrawalThread(3000);
		WithdrawalThread w8=new WithdrawalThread(4000000);
		WithdrawalThread w9=new WithdrawalThread(400);
		WithdrawalThread w10=new WithdrawalThread(500);
		
		
		ExecutorService pool=Executors.newFixedThreadPool(1);


		pool.execute(w1);
		pool.execute(w2);
		pool.execute(w3);
		pool.execute(w4);
		pool.execute(w5);
		pool.execute(w6);
		pool.execute(w7);
		pool.execute(w8);
		pool.execute(w9);
		pool.execute(w10);
		
		pool.shutdown();
		
	}

}
