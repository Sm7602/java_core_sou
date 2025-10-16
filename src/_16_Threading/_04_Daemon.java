package _16_Threading;

class DeamonThread implements Runnable
{
	public void run()
	{
		System.out.println("Running in background");
	}
}

public class _04_Daemon {
	public static void main(String [] arg)
	{
		DeamonThread d1 = new DeamonThread();
		Thread t1=new Thread(d1);
		t1.setDaemon(true);
		t1.start();
		
	System.out.println("main......");

	}

}
