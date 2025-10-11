package _11_Oops;
class Car7
{
	private String name;
	private String color;
	private int cc;
	private final engine engine;
	private driver driver;
	
	public Car7(String name,String color,int cc)
	{
		this.name=name;
		this.color=color;
		this.cc=cc;
		engine=new engine(1500,"5 ton");
	}
	
	@Override
	public String toString()
	{
		return "Car7[NAME : "+name+",COLOR : "+color+",CC : "+cc+"cc,Engine : "+engine+",Driver"+driver+"]";
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public int getCc()
	{
		return cc;
	}
	public void setCc(int cc)
	{
		this.cc=cc;
	}
	public engine getEngine()
	{
		return engine;
	}
	public driver getDriver()
	{
		return driver;
	}
	public void setDriver(driver driver)
	{
		this.driver=driver;
	}
	
}
class engine //compositon
{
	private int hp;
	private String weight;
	
	public engine(int hp,String weight)
	{
		super();
		this.hp=hp;
		this.weight=weight;
	}
	
	@Override
	public String toString()
	{
		return "engine[HP : "+hp+",weight : "+weight+"]";
	}	
}

class driver //aggregation
{
	private String name;
	private int age;
	private String gender;
	
	public driver(String name,int age,String gender)
	{
		super();
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	@Override
	public String toString()
	{
		return "driver[NAME : "+name+",AGE : "+age+",GENDER : "+gender+"]";
	}

}

public class Association_01 {
	public static void main(String[] arg)
	{
		Car7 c=new Car7("CAR","Black",222);
		driver lala =new driver("lala",25,"Male");
		c.setDriver(lala);
		System.out.println(c);
	}

	
}
