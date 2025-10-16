package _16_Threading;

class Mythread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.err.print("* ");
				try {
				Thread.sleep(300);
				}catch( InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}
}
 
 
public class Problem01 {
	public static void main(String[] arg)
	{
		Mythread t1=new Mythread();
		t1.start();
		   
		 
	}

}
