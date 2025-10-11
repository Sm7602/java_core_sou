package _11_Oops;

public class Person3_Class {
	private String name;
	private int age;
	private double hight;
	private double weidth;
	private String gender;
	private String bgroup;
	
	public Person3_Class(String name,int age,double hight,double weidth,String gender,String bgroup)
	{
		this.name=name;
		this.age=age;
		this.hight=hight;
		this.weidth=weidth;
		this.gender=gender;
		this.bgroup=bgroup;
	}
	
	public void print()
	{
		System.out.println("NAME        : "+name);
		System.out.println("AGE         : "+age);
		System.out.println("HIGHT       : "+hight+"'");
		System.out.println("WEIGHT      : "+weidth+".Kg");
		System.out.println("GENDER      : "+gender);
		System.out.println("BLOOD GROUP : "+bgroup);
		System.out.println("*********************************************");
	}
	

}
