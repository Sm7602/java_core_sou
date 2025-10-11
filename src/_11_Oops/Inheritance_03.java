package _11_Oops;

class Shape //perent class / base class / super class
{
	public double area;
	
	public double getArea()
	{
		return area;
	}
}

class Ractangle2 extends Shape //derived class/sub class/child class of Animal class
{
	
	
	public Ractangle2(double H,double W)
	{
		area=H*W;
	}
}

class Circle2 extends Shape  //derived class/sub class/child class of Animal class
{
	
	
	public Circle2(double R)
	{
		area=Math.PI*R*R;
	}
}

public class Inheritance_03 {
	public static void main(String[] arg)
	{
		Ractangle2 r=new Ractangle2(5,2);
		System.out.println("Area of Ractangle : "+r.getArea());
		
		Circle2 c=new Circle2(5);
		System.out.println("Area of Circle : "+c.getArea());
		
		
	}

}
