package _17_Threading;
class Datashare
{
	int data;
	boolean b=false;
	synchronized public void Producer(int data) throws InterruptedException
	{
		if(b)
		{
			System.out.println("sorry sorry pahale customer ko khus karo.....");
		}
		this.data=data;
		System.out.println("ctrated data "+this.data);
		b=true;
		notify();
	}
	synchronized public void customer() throws InterruptedException
	{
		if(!b)
		{
			System.out.println("sorry sorry pahale producer ko bolo.....");
			wait();
		}
		System.out.println("recevie data "+this.data);
		b=false;
		
	}
}

class ProducerThread extends Thread
{
	Datashare ds;
	int data=100;
	
	ProducerThread(Datashare ds)
	{
		this.ds=ds;
	}
	 @Override
	 public void run()
	 {
		 while(true)
		 {
		 try {
		 ds.Producer(data);
		 Thread.sleep(1000);
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 data++;
		 }
	 } 
}
class customerThread extends Thread
{
	Datashare ds;
	customerThread(Datashare ds)
	{
		this.ds=ds;
	}
	 @Override
	 public void run()
	 {
		 while(true)
		 {
		 try {
		 ds.customer();
		 Thread.sleep(1000);
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 }
	 }
}
public class Problem09 {
	public static void main(String[] arg)
	{
		Datashare ds=new Datashare();
		ProducerThread producer=new ProducerThread(ds);
		customerThread customer=new customerThread(ds);
		
		producer.start();
		customer.start();
	}
	

}
