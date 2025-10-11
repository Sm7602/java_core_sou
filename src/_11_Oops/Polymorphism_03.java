package _11_Oops;
class Shape2
{
	public void area(double a)
	{
		System.out.println("area");
	}
}
class Circle3 extends Shape2
{
	@Override
	public void area(double redious)
	{
	   System.out.println("Area of circle : "+(Math.PI*redious*redious));
	}
}

class Triangle extends Shape2
{
	public void area(double h,double b)
	{
	   System.out.println("Area of Triangle : "+(h*b)/2);
	}
}

class Ractangle3 extends Shape2
{
	public void area(double h,double w)
	{
	   System.out.println("Area of Ractangle : "+h*w);
	}
}

public class Polymorphism_03 {
	public static void main (String [] arg)
	{
		Circle3 c=new Circle3();
		c.area(5.5);
		
		Triangle t=new Triangle();
		t.area(5.2,2.0);
		
		Ractangle3 r=new  Ractangle3();
		r.area(5,2);
		
	}

}
