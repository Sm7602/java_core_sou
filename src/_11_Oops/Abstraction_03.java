package _11_Oops;

abstract class Shape3
{
	public abstract void area();
	public abstract void perimeter();
	
}

class Circle4 extends Shape3
{
	private  double r;
	
	public Circle4(double r)
	{
		this.r=r;
	}
	
	@Override
	public void area()
	{
		System.out.println("Area of circle : "+(Math.PI*r*r));
	}
	
	@Override
	public void perimeter()
	{
		System.out.println("Perimeter of circle : "+(Math.PI*2*r));
	}
}
class Ractangle4 extends Shape3
{
	private double h;
	private double w;
	
	public  Ractangle4(double h,double w)
	{
		this.h=h;
		this.w=w;
	}
	
	@Override
	public void area()
	{
		System.out.println("Area of Ractangle : "+(h*w));
	}
	
	@Override
	public void perimeter()
	{
		System.out.println("Perimeter of Ractangle : "+(h+w)*2);
	}
}

public class Abstraction_03 {
	public static void main(String[] arg)
	{
		Circle4 c=new Circle4(2.0);
		c.area();
		c.perimeter();
		
		Ractangle4 r=new Ractangle4(3.0,5.2);
		r.area();
		r.perimeter();
		
	}

}
