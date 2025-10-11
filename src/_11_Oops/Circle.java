package _11_Oops;

public class Circle {
	private double r;
	
	public Circle(double r)
	{
		this.r=r;
	}
	public double getR()
	{
		return r;
	}
	public void setR(double r)
	{
		this.r=r;
	}
	public double getA()
	{
		return Math.PI*r*r;
	}
	public double getC()
	{
		return Math.PI*2*r;
	}

}
