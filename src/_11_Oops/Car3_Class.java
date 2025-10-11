package _11_Oops;

public class Car3_Class {
	private String model;
	private String n;
	private String color;
	private double milage;
	private int cc;
	private String wheel;
	private int g;
	private boolean airbag;
	private boolean abs;
	private boolean fogl;
	private int price;
	
	public Car3_Class(String model,String n,String color,
			double milage,int cc,String wheel,
			int g,boolean airbag,boolean abs,
			boolean fogl,int price)
	{
		this.model=model;
		this.n=n;
		this.color=color;
		this.milage=milage;
		this.cc=cc;
		this.wheel=wheel;
		this.g=g;
		this.airbag=airbag;
		this.abs=abs;
		this.fogl=fogl;
		this.price=price;
	}
	
	public void print()
	{
		System.out.println("MODEL     : "+model);
		System.out.println("NUMBER    : "+n);
		System.out.println("COLOR     : "+color);
		System.out.println("MILAGE    : "+milage+" KM/H");
		System.out.println("CC        : "+cc+" CC");
		System.out.println("WHEEL     : "+wheel);
		System.out.println("GEAR      : "+g);
		System.out.println("AIRBAG    : "+airbag);
		System.out.println("ABS       : "+abs);
		System.out.println("FOG LIGHT : "+fogl);
		System.out.println("PRICE     : $"+price);
		System.out.println("--------------------------------------");
	}

}
