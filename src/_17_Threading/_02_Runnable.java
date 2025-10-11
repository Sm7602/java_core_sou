package _17_Threading;

class NewThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.err.println(Thread.currentThread().getName()+i);
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
public class _02_Runnable {
	
	public static void main(String[] arg)
	{
		NewThread n1=new NewThread();
		Thread t1=new Thread(n1,"Mythread-1 ");
		NewThread n2=new NewThread();
		Thread t2=new Thread(n2,"Mythread-2 ");
		
		t1.start();
		t2.start();
				 
	}

}
