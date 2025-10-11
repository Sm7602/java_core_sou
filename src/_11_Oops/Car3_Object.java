package _11_Oops;

public class Car3_Object {
	public static void main(String[] arg)
	{
		System.out.println("--------------------------------------");
		
		Car3_Class c1=new Car3_Class("Mahendra Thar","WB32 16B 6868","Black",40.00,550,"4x4",6,true,true,true,20000000);
		c1.print();
		
		Car3_Class c2=new Car3_Class("Audi Z23","DL16 11A 2222","White",35.00,850,"4x4",8,true,true,true,50000000);
		c2.print();
		
		Car3_Class c3=new Car3_Class("Furtruner","MI25 12L 2564","Black",40.00,350,"2x4",5,true,true,false,10000000);
		c3.print();
		
		
		
		
	}

}
