package _11_Oops;

public class Car_Object {
	public static void main(String[] arg)
	{
		Car_Class c1=new Car_Class();
		
		c1.speed=210;
		c1.wheel=4;
		c1.milage=40.00;
		c1.color="black";
		c1.model="Mahendra Thar";
		
		c1.print();
		System.out.println("----------------------------");
		c1.start();
		c1.move();
		c1.sp(); 
		c1.ig();
		c1.feul();
		c1.music();
		
		
		System.out.println("***************************");
		
		Car_Class c2=new Car_Class();
		
		c2.speed=560;
		c2.wheel=4;
		c2.milage=50.00;
		c2.color="red";
		c2.model="BMW x100";
		
		c2.print();
	   System.out.println("----------------------------");
		c2.start();
		c2.move();
		c2.sp();
		c2.ig();
		c2.feul();
		c2.music();
		
		System.out.println("***************************");
		
		Car_Class c3=new Car_Class();
		
		c3.speed=860;
		c3.wheel=4;
		c3.milage=30.00;
		c3.color="white";
		c3.model="warna p232";
		
		c3.print();
	   System.out.println("----------------------------");
		c3.start();
		c3.move();
		c3.sp();
		c3.ig();
		c3.feul();
		c3.music();
		
	System.out.println("***************************");
	
	Car_Class c4=new Car_Class();
	
	  c4.speed=1000;
	  c4.wheel=4;
	  c4.milage=35.00;
	  c4.color="blue";
	  c4.model="G-wargan";
	  
	  c4.print();
	  System.out.println("----------------------------");
	  c4.start();
	  c4.move();
	  c4.sp();
	  c4.ig();
	  c4.feul();
	  c4.music();
	  
	  
	
	}

}
