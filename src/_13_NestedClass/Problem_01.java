package _13_NestedClass;

class Computer //outer class
{
	 final String CAMPANAY_NAME="ASAR";
	
	
	static class Processor //inner class
	{
		static String brand;
		static int speed;
		
		public Processor(String brand,int speed)
		{
			this.brand=brand;
			this.speed=speed;
		}
		
		public String getBrand()
		{
			return brand;
		}
		public int getSpeed()
		{
			return speed;
		}
		public void setBrand(String brand)
		{
			this.brand=brand;
		}
		public void setSpeed(int speed)
		{
			this.speed=speed;
		}
		
		public static void details()
		{
			System.out.println("Brand : "+brand);
			System.out.println("Speed : "+speed);
		}
	}
	
	public void displayProcessor()
	{
		Processor p=new Processor("Intel core i3",120);
		p.details();
	}
}

public class Problem_01 {
	
	public static void main(String[] arg)
	{
		Computer computer=new Computer();
		System.out.println(computer.CAMPANAY_NAME);
		computer.displayProcessor();
	}

}
