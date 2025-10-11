package _11_Oops;

public class Trafic {
	private String color;
	public static final double duration=50.0;
	
	public Trafic(String color)
	{
		this.color=color;
	}
	
	public void setColor(String Color)
	{
		this.color=Color;
	}
    public String getColor()
    {
    	  return color;
    }
    
    public boolean isRed()
    {
    	  return color=="Red";
    }
    public boolean isGreen()
    {
    	  return color=="Green";
    }
    public boolean isOrange()
    {
    	  return color=="Orange";
    }
    public void print()
    {
    	    if(color=="Red")
    	    {
      	System.out.println("----------"+color+"----------");
		System.out.println("Light is Red    : "+isRed());
		System.out.println("Light is Orange : "+isOrange());
		System.out.println("Light is Green  : "+isGreen());
		System.out.println("Duration        : "+duration+"'S");
    	    }
    	    else if(color=="Orange")
    	    {
		System.out.println("----------"+color+"----------");
		System.out.println("Light is Orange : "+isOrange());
		System.out.println("Light is Green  : "+isGreen());
		System.out.println("Light is Red    : "+isRed());
		System.out.println("Duration        : "+duration+"'S");
    	    }
    	    else if(color=="Green")
    	    {
		System.out.println("----------"+color+"----------");
		System.out.println("Light is Green  : "+isGreen());
		System.out.println("Light is Red    : "+isRed());
		System.out.println("Light is Orange : "+isOrange());
		System.out.println("Duration        : "+duration+"'S");
    	    }
    	    else
    	    {
    	    	System.out.println("ERROR");
    	    }
    	    System.out.println("------------------------");
    }
	

}
