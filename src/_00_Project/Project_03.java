package _00_Project;

class HoursThread implements Runnable
{
	public void run()
	{
		for(int i=00;i<24;i++)
		{

			for(int j=00;j<60;j++)
			{
				for(int k=00;k<60;k++)
				{
					System.err.print(i+" : ");
					System.err.print(j+" : ");
					System.err.print(k+" \n");
					try
					{
						Thread.sleep(1000);
					}
					catch( InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				 
			}
		}
		System.err.println();
	}
}

 
 

public class Project_03 {
	
	public static void main(String[] arg)
	{
		HoursThread h1=new HoursThread();
		 
		Thread t1=new Thread(h1);
		 
		


		 
		t1.start();
		

	}

}
