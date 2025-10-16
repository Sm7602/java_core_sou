package _16_Threading;

class MistakesThread implements Runnable
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.err.println(Thread.currentThread().getName()+"........"+i);
			
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

public class _03_join {
	
	public static void main(String [] arg)
	{
		MistakesThread m1=new MistakesThread();
		Thread t1=new Thread(m1,"Mistakes 1");
		
		t1.start();
		try
		{
		t1.join();
		}
		catch( InterruptedException e)
		{
			e.printStackTrace();
		}
		
		MistakesThread m2=new MistakesThread();
		Thread t2=new Thread(m2,"Mistakes 2");
		
		t2.start();
		try
		{
		t2.join();
		}
		catch( InterruptedException e)
		{
			e.printStackTrace();
		}
		
		MistakesThread m3=new MistakesThread();
		Thread t3=new Thread(m3,"Mistakes 3");
		
		t3.start();
		try
		{
		t3.join();
		}
		catch( InterruptedException e)
		{
			e.printStackTrace();
		}
		
		MistakesThread m4=new MistakesThread();
		Thread t4=new Thread(m4,"Mistakes 4");
		
		t4.start();
	}

}
