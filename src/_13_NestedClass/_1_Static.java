package _13_NestedClass;

class Outer // outer class
{
	static int n=125;
	static String name="aaa";
	
	public static void eat()
	{
		System.out.println(name+" is eating........");
	}
	public static void run()
	{
		System.out.println(n+" no. pleyer is running........");
	}
	  static class Inner //inner class
	  {
		  static int n1=135;
			static String name1="bbb";
			
			public static  void eat1()
			{
				System.out.println(name1+" is eating........");
			}
			public static void run1()
			{
				System.out.println(n1+" no. pleyer is running........");
			}
	  }
}

public class _1_Static {
	public static void main(String[] arg)
	{
		Outer ou=new Outer();
		Outer.Inner in = new Outer.Inner();
		ou.eat();
		in.eat1();
	}

}
