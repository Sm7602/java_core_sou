package _16_Threading;

class domain
{
	 int files=100;
    synchronized   void  access(int req)
    {
    	if(req<= files)
    	{
    		System.out.println(req+" files access..");
    		files -=req;
    	}
    	else
    	{
    		System.out.println(files+" files only left..");
    	} 
    }
}
public class _07_Synchronization_method extends Thread{
	
	static domain d ;
	int req;
	 
	public void run()
	{
		d.access(req); 
	}
	
	public static void main(String[] arg)
	{   
		 d=new  domain();
	
		 _07_Synchronization_method t1=new _07_Synchronization_method();
		 _07_Synchronization_method t2=new _07_Synchronization_method();
		 _07_Synchronization_method t3=new _07_Synchronization_method();
		
        t1.req=20;
		t1.start();
		
		 t2.req=50;
		 t2.start();
			
	     t3.req=80;
		 t3.start();
				
		 
		
	}

}
