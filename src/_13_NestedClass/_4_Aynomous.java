package _13_NestedClass;

class Outer4//outer class
{
	 int n=125;
	 String name="aaa";
	public  void eat()
	{
		
	}
	public  void run()
	{
		
	}
}

public class _4_Aynomous {
	public static void main(String[] arg)
	{
		Outer4 ou=new Outer4()
		{
			public void eat()
			{
				System.out.println(name+" is eating........");
			}
			public void run()
			{
				System.out.println(n+" no. pleyer is running........");
			}
		};
		ou.eat();
		
	}

}
