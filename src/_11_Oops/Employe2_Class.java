package _11_Oops;

public class Employe2_Class {
	private String name;
	private String gender;
	private int age;
	private int salary;
	private int y;
	
	
	public Employe2_Class(String name,String gender,int age,int salary,int y)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.salary=salary;
		this.y=y;
	}
	
	public String getName()
	{
		return name;
	}
	public String getGender()
	{
		return gender;
	}
	public int getAge()
	{
		return age;
	}
	public int getSalary()
	{
		return salary;
	}
	public int getY()
	
	{
		return y;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setSalary(int sallary)
	{
		this.salary=sallary;
	}
	public void setY(int y)
	{
		this.y=y;
	}

}
