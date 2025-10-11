package _11_Oops;

public class Employe3_Class {
	public static final String CAMPANY_NAME="Google";
	private String name;
	private int age;
	private String gen;
	private int y;
	private double salary;
	
	public Employe3_Class(String name,int age,String gen,int y,double salary)
	{
		this.name=name;
		this.age=age;
		this.gen=gen;
		this.y=y;
		this.salary=salary;
	}
	
	public double getSalary()
	{
		int n=y;
		if(n==1||n==2||n==3)
		{
			return salary;
		}
		else
		{
			salary=salary+salary*.2;
			return salary;
		}
		
	}
	
	public int getAge()
	{
		age=age+y;
		return age;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	public void eat()
	{
		
	}
	public void sihgcffj()
	{
		
	}
	
	public void print()
	{
		System.out.println("CAMPANY_NAME : "+CAMPANY_NAME);
		System.out.println("NAME         : "+name);
		System.out.println("AGE          : "+age);
		System.out.println("GENDER       : "+gen);
		System.out.println("EXPRIENCE    : "+y+"year");
		System.out.println("SALARY       :$"+salary);
		System.out.println("--------------------------");
	}
	

}
