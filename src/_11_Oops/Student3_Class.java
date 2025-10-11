package _11_Oops;

public class Student3_Class {
	private String name;
	private String gen;
	private int age;
	private double height;
	private String course;
	private String sem;
	private int y;
	
	
	public Student3_Class(String name,String gen,int age,double height,String course,String sem,int y)
	{
		this.name=name;
		this.gen=gen;
		this.age=age;
		this.height=height;
		this.course=course;
		this.sem=sem;
		this.y=y;
	}
	
	public String getName()
	{
		return name;
	}
	public String getGen()
	{
		return gen;
	}
	public int getAge()
	{
		return age;
	}
	public double getHeight()
	{
		return height;
	}
	public String getCourse()
	{
		return course;
	}
	public String getSem()
	{
		return sem;
	}
	public int getY()
	{
		return y;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setGen(String gen)
	{
		this.gen=gen;  	
	}
	public void setAge(int age)
	{
		this.age=age;
	}
     public void setHeight(double height)
     {
    	    this.height=height;
     }
     public void setCourse(String course)
     {
    	    this.course=course;
     }
     public void setSem(String sem)
     {
    	    this.sem=sem;
     }
     public void setY(int y)
     {
    	   this.y=y;
     }
}
