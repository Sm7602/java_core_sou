package _14_NestedClass;

class Car
{
	int speed;
	String wheel;
	double milage;
	String color,model;
	
	public Car(String model,int speed,String wheel,double milage,String color)
	{
		this.model=model;
		this.speed=speed;
		this.wheel=wheel;
		this.milage=milage;
		this.color=color;
	}
	public String getModel()
	{
		return model;
	}
	public int getSpeed()
	{
		return speed;
	}
	public String getWheel()
	{
		return wheel;
	}
	public double getMilage()
	{
		return milage;
	}
	public String getColor()
	{
		return color;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public void setWheel(String wheel)
	{
		this.wheel=wheel;
	}
	public void setMilage(double milage)
	{
		this.milage=milage;
	}
	public void setColor(String color)
	{
		this.color=color;
	}

	public static void  carStart()
	{
		System.out.println("start.................");
		
	    class engine
		{
	    	public void  start()
			{
				System.out.println("vur.................");
			}
		}
	    engine e=new engine();
	    e.start();
	}
	
	public static void carStop()
	{
		System.out.println("stop.................");
		
		class engine
		{
			public void stop()
			{
				System.out.println(".................");
			}
		}
		engine e=new engine();
	    e.stop();
	}
	
}

public class Problem_02 {
	public static void main(String[] arg)
	{
		Car c=new Car("Thar zx",300,"4x4",40.00,"Black");
	
		System.out.println(c.getModel());
		System.out.println(c.getSpeed());
		System.out.println(c.getWheel());
		System.out.println(c.getMilage());
		System.out.println(c.getColor());
		
		c.carStart();
		c.carStop();
	}

}
