package _17_Threading;

class ShurtDownhookThread implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
			Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		System.err.println("MIlta hai 10 sec ka badh......");
		}
	}
}
public class _06_ShurtDownhook {
	public static void main(String[] arg)
	{
		Runtime r=Runtime.getRuntime();
		ShurtDownhookThread s1=new ShurtDownhookThread();
		Thread t1=new Thread(s1);
		r.addShutdownHook(t1);
		System.out.println("Now main sleeping... press ctrl+c to exit");
		try
		{
		Thread.sleep(9000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
