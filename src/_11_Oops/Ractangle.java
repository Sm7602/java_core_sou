package _11_Oops;

public class Ractangle {
	private double h;
	private double w;
	
	public Ractangle(double h,double w)
	{
		this.h=h;
		this.w=w;
	}
	
	public double getH()
	{
		return h;
	}
	
	public double getW()
	{
		return w;
	}
	public void setH(double h)
	{
		this.h=h;
	}
	public void setW(double w)
	{
		this.w=w;
	}
	public double getA()
	{
		return h*w;
	}
	public double getP()
	{
		return (h+w)*2;
	}


}
