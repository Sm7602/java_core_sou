package _17_Threading;

class CunterThread implements Runnable
{
	public void run()
	{
		
		for(int i=1;i<24;i++)
		{
			System.err.println(i+" : ");
			
		}
	}
}

public class Problem02 {

	public static void main(String[] arg)
	{
		CunterThread n1=new CunterThread();
		Thread t1=new Thread(n1);
		
		t1.start();
	}
}
