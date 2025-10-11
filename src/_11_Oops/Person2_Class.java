package _11_Oops;

public class Person2_Class {
	private int age;
	private int id;
	private double h;
	private String name;
	private String gender;
	private String bGroup;
	
	public void print()
	{
		System.out.println("NAME        : "+name);
		System.out.println("AGE         : "+age);
		System.out.println("ID          : "+id);
		System.out.println("HEIGHT      : "+h);
		System.out.println("GENDER      : "+gender);
		System.out.println("BLOOD GROUP : "+bGroup);
		System.out.println("----------------------------");
	}
	public void setter(String name,int age,int id,double h,String gender,String bGroup)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.h=h;
		this.gender=gender;
		this.bGroup=bGroup;
	}
	
	

}
