package _17_Threading;

class newThread extends Thread
{
	public newThread(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		     System.err.println(Thread.currentThread().getName()+i);
		     
		     try
		     {
		     Thread.sleep(1000);
		     }
		     catch(InterruptedException e)
		     {
		    	 e.printStackTrace();
		     }

		}
	}
}

public class _01_basic {
	public static void main(String[] arg)
	{
		newThread t1=new newThread("MyThread-");
		t1.start();
		
	}

}
