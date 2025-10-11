package _11_Oops;

public class Employe_Class {
	private String name;
	private String gender;
	private int age;
	private String post;
	private int salary;
	private int y;
	
	public Employe_Class(String name,String gender, int age,String post,int salary,int y)
	{
		this.name= name;
		this.gender=gender;
		this.age=age;
		this.post=post;
		this.salary=salary;
		this.y=y;
	}
	
	public void print()
	{
		System.out.println("NAME    : "+name);
		System.out.println("GENDER  : "+gender);
		System.out.println("AGE     : "+age);
		System.out.println("POSt    : "+post);
		System.out.println("SALARY  : RS."+salary);
		System.out.println("YEAR    : "+y);
		System.out.println("--------------------------");
	}

}
