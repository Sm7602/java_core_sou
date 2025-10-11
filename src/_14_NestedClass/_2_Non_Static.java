package _14_NestedClass;

class Outer2 // outer class
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
	
	
	  static class Inner2 //inner class
	  {
		   int n1=135;
			 String name1="bbb";
			
			public   void eat1()
			{
				System.out.println(name1+" is eating........");
			}
			public  void run1()
			{
				System.out.println(n1+" no. pleyer is running........");
			}
	  }
}
public class _2_Non_Static {
	
	public static void main(String[] arg)
	{
		Outer2 ou=new Outer2();
		Outer2.Inner2 in = new Outer2.Inner2();
		ou.eat();
		in.eat1();
	}

}
