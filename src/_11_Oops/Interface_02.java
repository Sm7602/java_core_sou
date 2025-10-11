package _11_Oops;

interface Shape4
{
	void area();
	void perimeter();
}

class Circle5 implements Shape4
{
	private double r;
	
	public Circle5(double r)
	{
		this.r=r;
	}
	
	@Override
	public void area()
	{
		System.out.println("Area of the circle : "+(Math.PI*r*r));
	}
	
	@Override
	public void perimeter()
	{
		System.out.println("perimeter of the circle : "+(Math.PI*2*r));
	}
}

class Ractangle5 implements Shape4
{
	private double h;
	private double w;
	
	public Ractangle5(double h,double w)
	{
		this.h=h;
		this.w=w;
	}

	@Override
	public void area()
	{
		System.out.println("Area of the Ractangle : "+(h*w));
	}
	
	@Override
	public void perimeter()
	{
		System.out.println("perimeter of the Ractangle : "+(h+w)*2);
	}
}


public class Interface_02 {
	
	public static void main(String[] arg)
	{
		Shape4 c=new Circle5(2.0);
		c.area();
		c.perimeter();
		
		Shape4 r=new Ractangle5(2.0,3);
		r.area();
		r.perimeter();
	}
	
}
