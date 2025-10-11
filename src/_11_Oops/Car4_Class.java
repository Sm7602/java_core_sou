package _11_Oops;

public class Car4_Class {
	private String model;
	private String n;
	private String wheel;
	private int g;
	private String color;
	private double milage;
	private int cc;
	
	
	public Car4_Class(String model,String n,String wheel,int g,String color,double milage,int cc)
	{
		this.model=model;
		this.n=n;
		this.wheel=wheel;
		this.g=g;
		this.color=color;
		this.milage=milage;
		this.cc=cc;
	}
	public String getModel()
	{
		return model;
	}
	public String getN()
	{
		return n;
	}
	public String getWheel()
	{
		return wheel;
	}
	public int getG()
	{
		return g;
	}
	public String getColor()
	{
		return color;
	}
	public double getMilage()
	{
		return milage;
	}
	public int getCc()
	{
		return cc;
	}
	public void setModel(String model)
	{
		this.model=model;
	}
	public void setN(String n)
	{
		this.n=n;
	}
	public void setWheel(String wheel)
	{
		this.wheel=wheel;
	}
	public void setG(int g)
	{
		this.g=g;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setMilage(double milage)
	{
		this.milage=milage;
	}
	public void setCc(int cc)
	{
		this.cc=cc;
	}
	
	

}
