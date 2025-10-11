package _11_Oops;

public class Student2_Class {
	
	private String name;
	private int age;
	private int id;
	private String course;
	private String cast;
	private String fname;
	private String mname;
	private String add;
	private String email;
	private long ph;
	
	
	public void Setter(String name,int age,int id,String course ,String cast,String fname,String mname,String add,String email,long ph)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.course=course;
		this.cast=cast;
		this.fname=fname;
		this.mname=mname;
		this.add=add;
		this.email=email;
		this.ph=ph;
	}
	
	public void print()
	{
		System.out.println("NAME         : "+name);
		System.out.println("AGE          : "+age);
		System.out.println("ID           : "+id);
		System.out.println("COURSE       : "+course);
		System.out.println("CAST         : "+cast);
		System.out.println("FATHER NAME  : "+fname);
		System.out.println("MOTHER NAME  : "+mname);
		System.out.println("ADDRESS      : "+add);
		System.out.println("E-MAIL       : "+email);
		System.out.println("PHONE NUMBER : "+ph);
		System.out.println("------------------------------------");
		
	}
}
