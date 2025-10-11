package _11_Oops;

class Devoloper
{
	private String name;
	private int age;
	private String gen;
	private double salary;
	private final Laptop laptop;
	private Car car;
	
	public Devoloper(String name,int age,String gen,double salary)
	{
		this.name=name;
		this.age=age;
		this.gen=gen;
		this.salary=salary;
		laptop=new Laptop("ACER",38000,"ASS");
	}
	
	@Override
	public String toString()
	{
		return "Devoloper[NAME  : "+name+",AGE : "+age+",GENDER : "+gen+",SALARY : "+salary+",LAPTOP  : "+laptop+",Car : "+car+"]";
	}
	
	public String getName()
	{
		return name;
	}
	public void setNAme(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(String name)
	{
		this.name=name;
	}
	public String getGEn()
	{
		return gen;
	}
	public void setGen(String name)
	{
		this.name=name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public Laptop getLAptop()
	{
		return laptop;
	}
	public Car getCar()
	{
		return car;
	}
	public void setCar(Car car)
	{
		this.car=car;
	}
	
}

class Laptop
{
	private String name;
	private double price;
	private String color;
	
	public Laptop(String name,double price,String color)
	{
		super();
		this.name=name;
		this.price=price;
		this.color=color;
	}
	
	@Override
	public String toString()
	{
		return "Laptop[NAME : "+name+",PRICE :$"+price+",COLOR : "+color+"]";
	}
}
class Car
{
	private String name;
	private String color;
	private int cc;
	
	public Car(String name,String color,int cc)
	{
		super();
		this.name=name;
		this.color=color;
		this.cc=cc;
	}
	
	@Override
	public String toString()
	{
		return "Car[NAME : "+name+",COLOR : "+color+",CC  : "+cc+"]";
	}
}


public class Association_02 {
	public static void main(String[] arg)
	{
		Devoloper d=new Devoloper("Souvik",21,"Male",5000000);
		Car Thar=new Car("THAR","Black",500);
		d.setCar(Thar);
		System.out.println(d);
		
		Devoloper d2=new Devoloper("Vikash",24,"Male",7000000);
		Car f1=new Car("F!","Black",1500);
		d2.setCar(f1);
		System.out.println(d2);
		
		Devoloper d3=new Devoloper("Om",23,"Male",3000000);
		Car bike=new Car("R15","Blue",200);
		d3.setCar(bike);
		System.out.println(d3);
	}
}
