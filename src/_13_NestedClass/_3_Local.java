package _13_NestedClass;

abstract class Outer3//outer class
{
	public abstract void eat();
	public abstract void run();
}

class Inner3 extends Outer3//inner class
{
	 int n=125;
	 String name="aaa";
	
	public void eat()
	{
		System.out.println(name+" is eating........");
	}
	public void run()
	{
		System.out.println(n+" no. pleyer is running........");
	}
	public  void m()
	{
		 class oii //inner class
		  {
			    int n1=135;
		 		 String name1="bbb";
				
				public   void eat()
				{
					System.out.println(name1+" is eating........");
				}
				public  void run()
				{
					System.out.println(n1+" no. pleyer is running........");
				}
		  }
		 oii oi=new oii();
		 oi.eat();
		 oi.run();
	}
	
	
	  
}

public class _3_Local {
	public static void main(String[] arg)
	{
		
		Inner3 in = new Inner3();
		in.eat();
		in.m();
		
	}

}
