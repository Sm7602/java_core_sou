package _16_Threading;

class Automoble 
{
	int model;
	boolean b=false;
	synchronized public void assemble(int model)throws InterruptedException
	{
		if(b)
		{
			System.out.println("sorry sory pahele sale karo...");
		}
		this.model=model;
		System.out.println("car assembled :"+this.model);
		b=true;
		notify();
	}
	
	synchronized public void sale()throws InterruptedException
	{
		if(!b)
		{
			System.out.println("sorry sory pahele assemble karo...");
			wait();
		}
		System.out.println("sale :"+this.model);
		b=false;
		
	}
}
class AssembledepertThread extends Thread
{
	 Automoble	automoble;
	 int model=2000;
	 AssembledepertThread( Automoble	automoble)
	    {
	    	this.automoble=automoble;
	    }
	    @Override
	    public void run()
	    {
	    	while(true)
	    	{
	    		try
	    		{
	    		automoble.assemble(model);
	    		Thread.sleep(1000);
	    		}
	    		catch( InterruptedException e)
	    		{
	    			e.printStackTrace();
	    		}
	    		model++;
	    	}
	    }
}
class saledepertThread extends Thread
{
    Automoble	automoble;
    
    saledepertThread( Automoble	automoble)
    {
    	this.automoble=automoble;
    }
    @Override
    public void run()
    {
    	while(true)
    	{
    		try
    		{
    		automoble.sale();
    		Thread.sleep(1000);
    		}
    		catch( InterruptedException e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
}

public class _08_co_operation {
	public static void main(String[] arg)
	{
		Automoble automoble=new Automoble();
		
		AssembledepertThread t1=new AssembledepertThread(automoble);
		saledepertThread t2=new saledepertThread(automoble);
		
		t1.start();
		t2.start();
	}

}
