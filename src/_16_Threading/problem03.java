package _16_Threading;

//Write a Java program that creates two 
//threads to find and print even and odd numbers from 1 to 20.

class EvenThread implements Runnable
{
	public void run()
	{
		for(int i=2;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is even......");
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
}
class oddThread implements Runnable
{
	public void run()
	{
		for(int i=2;i<=20;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i+" is odd....");
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
}

public class problem03 {
	public static void main(String [] arg)
	{
		EvenThread e=new EvenThread();
		Thread t1=new Thread(e);
		t1.start();
		
		oddThread o=new oddThread();
		Thread t2=new Thread(o);
		t2.start();
	}

}
