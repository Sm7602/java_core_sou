package _11_Oops;

interface Vichel
{
	void start();
	void stop();
}

abstract class Car6 implements Vichel
{
	private String name;
	private  String n;
	private String color;
	private int cc;
	private double milage;
	
	public Car6(String name, String n,String color,int cc,double milage)
	{
		this.name=name;
		this.n=n;
		this.color=color;
		this.cc=cc;
		this.milage=milage;
	}
	
	public void carProp()
	{
		System.out.println("I am "+name);
		System.out.println(name+" Number : "+n);
		System.out.println(name+" Color : "+color);
		System.out.println(name+" CC : "+cc+"cc");
		System.out.println(name+" Milage : "+milage);
	}
	
	@Override
	public void start()
	{
		System.out.println(name+" is start........");
	}
	
	@Override
	public void stop()
	{
		System.out.println(name+" is stop........");
	}
	
	public void music()
	{
		System.out.println("play music........");
	}
}

class  Thar3 extends Car6
{
	public Thar3(String name, String n,String color,int cc,double milage)
	{
		super(name,n,color,cc,milage);
	}
}

class scorpriyo extends Car6
{
	public scorpriyo(String name, String n,String color,int cc,double milage)
	{
		super(name,n,color,cc,milage);
	}
}


public class Interface_03 {
	public static void main(String[] arg)
	{
		Car6 t=new Thar3("Thar","WB32 16F 6868","Black",550,25);
		t.start();
		t.carProp();
		t.music();
		t.stop();
		
		Car6 s=new scorpriyo("scorpriyo","DL12 4K 5555","White",350,40);
		s.start();
		s.carProp();
		s.music();
		s.stop();
	}

}
