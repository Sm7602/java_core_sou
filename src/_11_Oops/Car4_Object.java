package _11_Oops;

public class Car4_Object {
	public static void main(String[] arg)
	{
		System.out.println("-----------------------------------");
		
		Car4_Class c1=new Car4_Class("Thar","DL 16K 2561","4x2",6,"black",40.00,550);
		System.out.println("MODEL   : "+c1.getModel());
		System.out.println("NUMBER  : "+c1.getN());
		System.out.println("WHEEL   : "+c1.getWheel());
		System.out.println("GEAR    : "+c1.getG());
		System.out.println("COLOR   : "+c1.getColor());
		System.out.println("MILAGE  : "+c1.getMilage()+"km/h");
		System.out.println("CC      : "+c1.getCc()+"cc");
		
		//updation
		
		System.out.println("----------After updatation----------");
		
		c1.setModel("Mahendra Thar");
		c1.setN("WB32 16B 6868");
		c1.setWheel("4x4");
		c1.setG(8);
		c1.setColor("White");
		c1.setMilage(35.00);
		c1.setCc(850);
		
		System.out.println("MODEL   : "+c1.getModel());
		System.out.println("NUMBER  : "+c1.getN());
		System.out.println("WHEEL   : "+c1.getWheel());
		System.out.println("GEAR    : "+c1.getG());
		System.out.println("COLOR   : "+c1.getColor());
		System.out.println("MILAGE  : "+c1.getMilage()+"km/h");
		System.out.println("CC      : "+c1.getCc()+"cc");
		
		System.out.println("-----------------------------------");
		
		Car4_Class c2=new Car4_Class("Lamborgini","DL 25F 7777","4x2",8,"Blue",30.00,1000);
		System.out.println("MODEL   : "+c2.getModel());
		System.out.println("NUMBER  : "+c2.getN());
		System.out.println("WHEEL   : "+c2.getWheel());
		System.out.println("GEAR    : "+c2.getG());
		System.out.println("COLOR   : "+c2.getColor());
		System.out.println("MILAGE  : "+c2.getMilage()+"km/h");
		System.out.println("CC      : "+c2.getCc()+"cc");
		
		//updation
		
		System.out.println("----------After updatation----------");
		
		c2.setModel("Lambo ZXR");
		c2.setN("WB32 16B 6666");
		c2.setWheel("4x4");
		c2.setG(10);
		c2.setColor("Red");
		c2.setMilage(30.00);
		c2.setCc(1550);	
		
		System.out.println("MODEL   : "+c2.getModel());
		System.out.println("NUMBER  : "+c2.getN());
		System.out.println("WHEEL   : "+c2.getWheel());
		System.out.println("GEAR    : "+c2.getG());
		System.out.println("COLOR   : "+c2.getColor());
		System.out.println("MILAGE  : "+c2.getMilage()+"km/h");
		System.out.println("CC      : "+c2.getCc()+"cc");
		
		
		System.out.println("-----------------------------------");
	}

}
