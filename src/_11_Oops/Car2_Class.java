package _11_Oops;

public class Car2_Class {
	private String n;
	private String model;
	private String color;
	private double milage;
	private int cc;
	private String wheel;
	private int g;
	private boolean airbag;
	private boolean abs;
	private boolean fogl;
	private int price;
	
	public void setter(String model,String n,String color,double milage,int cc,
			          String wheel,int g,boolean airbag,boolean abs,boolean fogl,int price)
	
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
		System.out.println("MILAGE    : "+milage);
		System.out.println("CC        : "+cc);
		System.out.println("WHEEL     : "+wheel);
		System.out.println("GIER      : "+g);
		System.out.println("AIRBAG    : "+airbag);
		System.out.println("ABS       : "+abs);
		System.out.println("FOGLIGHT  : "+fogl);
		System.out.println("Price     :RS."+price);
		System.out.println("---------------------------------------");
		
	}

}
