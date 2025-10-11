package _11_Oops;

class Employee4 //perent class / super class / base class
{
	public static final String CAMPANY_NAME="TCS";
	private String name;
	public double salary;
	private String gen;
	private String post;
	
	public Employee4(String name,String post,double salary,String gen)
	{
		this.name=name;
		this.salary=salary;
		this.gen=gen;
		this.post=post;
	}
	
	public void print()
	{
		System.out.println("Name            : "+name);
		System.out.println("POST            : "+post);
		System.out.println("SALARY          : $"+salary);
		System.out.println("GENDER          : "+gen);
	}
	
	public void status()
	{
		System.out.println("CURRENT STATUS  : "+post);
		System.out.println("------------------------------");
	}
}

class CEO extends Employee4 //subclass /child class / drived class
{
    private double sal=(salary+salary*0.40);
	
	public CEO(String name,String post,double salary,String gen)
	{
		super(name,post,salary,gen);
		this.salary=sal;
	}
	public void ceoProp()
	{
		System.out.println("------I Am CEO OF "+CAMPANY_NAME+"------");
	}
}

class aCeo extends CEO
{
	public aCeo(String name,String post,double salary,String gen)
	{
		super(name,post,salary,gen);
	}
	public void aCeoProp()
	{
		System.out.println("------I Am ASSISTENTCEO OF "+CAMPANY_NAME+"------");
	}
}

class Manager extends Employee4 //subclass /child class / drived class
{
	private double sal=(salary+salary*0.20);
	
	public Manager(String name,String post,double salary,String gen)
	{
		super(name,post,salary,gen);
		this.salary=sal;
	}
	public void managerProp()
	{
		System.out.println("------I Am MANAGER OF "+CAMPANY_NAME+"------");
	}
}



public class Inheritance_04 {
	public static void main(String[] arg)
	{
		System.out.println("------------------------------");
		
		CEO c=new CEO("Mr.BANARJEE","CEO",50000,"Male");
		c.ceoProp();
		c.print();
		c.status();
		
		aCeo ac=new aCeo("Mr.MUKUL","AssistentCEO",30000,"Male");
		ac.aCeoProp();
		ac.print();
		ac.status();
		
		Manager m=new Manager("LALA","Manager",20000,"Male");
		m.managerProp();
		m.print();
		m.status();
	}

}
