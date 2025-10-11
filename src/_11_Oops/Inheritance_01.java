package _11_Oops;
class Vehicle //perent class / base class / super class
{
	public String name;
	public String wheel;
	public double length;
	
	public Vehicle(String name,String wheel,double length)
	{
		this.name=name;
		this.wheel=wheel;
		this.length=length;
		
		System.out.println(name+" Wheel : "+wheel);
		System.out.println(name+" Length : "+length+"mm");
	}
	public void start()
	{
		System.out.println(name+" is Start......");
	}
	public void stop()
	{
		System.out.println(name+" is Stop......");
		System.out.println("-------------------------------------");
	}
}


class Cars extends Vehicle //chld class / derived class / subclass of vehicle
          //aur //perent class / base class / super class of all cars
{
	private String n;
	private String color;
	private double milage;
	private int cc;
	
	public Cars(String name,String wheel,double length,String n,String color,double milage,int cc)
	{
		super(name,wheel,length);
		this.n=n;
		this.color=color;
		this.milage=milage;
		this.cc=cc;
	}
	public void carsProp()
	{
		System.out.println(name+" Numder is : "+n);
		System.out.println(name+" Color is  : "+color);
		System.out.println(name+" Milage is : "+milage+"km/h");
		System.out.println(name+" CC  is    : "+cc+"cc");
	}
}


class Thar extends Cars//chld class / derived class / subclass of car
{
	public Thar(String name,String wheel,double length,String n,String color,double milage,int cc)
	{
		super(name,wheel,length,n,color,milage,cc);
	}
	public void tharProp()
	{
		System.out.println("I am a "+name);
	}
}
class Lamborgini extends Cars  //chld class / derived class / subclass of car
{
	public Lamborgini(String name,String wheel,double length,String n,String color,double milage,int cc)
	{
		super(name,wheel,length,n,color,milage,cc);
	}
	public void lamboProp()
	{
		System.out.println("I am a "+name);
	}
}



class Truck extends Vehicle//chld class / derived class / subclass of vehicle
           //aur //perent class / base class / super class of all trucks
{
	private double capacity;
	private int price;
	
	public Truck(String name,String wheel,double length,double capacity,int price)
	{
		super(name,wheel,length);
		this.capacity=capacity;
		this.price=price;
	}
	public void truckProp()
	{
		System.out.println(name+" Capacity :"+capacity+" Ton");
		System.out.println(name+" Price :$ "+price);
	}
}
class TataAce extends Truck //chld class / derived class / subclass of Truck
{
	public TataAce(String name,String wheel,double length,double capacity,int price)
	{
		super(name,wheel,length,capacity,price);
	}
	public void tataAceProp()
	{
		System.out.println("I am a "+name);
	}
}
class AshokLeyland extends Truck//chld class / derived class / subclass of Truck
{
	public AshokLeyland(String name,String wheel,double length,double capacity,int price)
	{
		super(name,wheel,length,capacity,price);
	}
	public void ashokLeylandProp()
	{
		System.out.println("I am a "+name);
	}
}



public class Inheritance_01 {
	public static void main(String[] arg)
	{
		
		Vehicle v=new Vehicle("Vehicle","wheel",0.0);
		v.start();
		v.stop();
		
		//car
		Cars c=new Cars("car","wheel",0.0,"num","color",2.00,0);
		c.carsProp();
		c.start();
		c.stop();
		
		//Thar
		Thar t=new Thar("Thar","4x4",3985.00,"WB32 16B 6868","Black",40.00,550);
		t.carsProp();
		t.start();
		t.tharProp();
		t.stop();
		
		//lamborgini
		Lamborgini l=new Lamborgini("lambo","4x4",4525.00,"DL08 21K 5555","Red",30.00,1000);
		l.carsProp();
		l.start();
		l.lamboProp();
		l.stop();
		
		//Truck
		Truck tr=new Truck("Truck","wheel",0.0,0.0,0);
		tr.truckProp();
		tr.start();
		tr.stop();
		
		//tataace
		TataAce ta=new TataAce("TataAce","4x2",3800.00,20.00,5000000);
		ta.truckProp();
		ta.start();
		ta.tataAceProp();
		ta.stop();
		
		//AshokLeyland
		AshokLeyland al=new AshokLeyland("AshokLeyland","6x4",4600.00,50,2000000);
		al.truckProp();
		al.start();
		al.ashokLeylandProp();
		al.stop();
		
		
	}

}
