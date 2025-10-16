package _16_Threading;

class domain1
{
	int Total_set=100;
	
	synchronized public void Set_Booking(int req)
	{
		if(req<=Total_set)
		{
			System.out.println(req+" sets Booked sucsecfully....");
			Total_set=Total_set-req;
		}
		else
		{
			System.out.println(Total_set+"  sets only left....");
		}
	}
}

public class Problem07 extends Thread{
	
	static domain1 d;
	
	int req;
	
	public void run()
	{
		d.Set_Booking(req);
	}
	
	public static void main(String[] arg)
	{
		d=new domain1();
		
		Problem07 t1=new Problem07();
		Problem07 t2=new Problem07();
		Problem07 t3=new Problem07();
		Problem07 t4=new Problem07();
		
		t1.req=50;
		t1.start();
		t2.req=20;
		t2.start();
		t3.req=30;
		t3.start();
		t4.req=40;
		t4.start();
	}

}
