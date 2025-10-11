package _11_Oops;

public class Person2_Object {
	public static void main(String[] arg)
	{
		System.out.println("----------------------------");
		
		Person2_Class p1=new Person2_Class();
		p1.setter("souvik", 21, 253, 5.6, "male","B+");
		p1.print();
		
		Person2_Class p2=new Person2_Class();
		p2.setter("Prateek", 22, 222, 6.2, "male", "O-");
		p2.print();
		
		Person2_Class p3=new Person2_Class();
		p3.setter("Vikash", 24, 267, 6.1, "male", "O+");
		p3.print();
		
		Person2_Class p4=new Person2_Class();
		p4.setter("om", 25, 2564, 5.8, "male", "A+");
		p4.print(); 
		
		Person2_Class p5=new Person2_Class();
		p5.setter("sonu", 27, 25645, 5.5, "male","O");
		p5.print();
		
		Person2_Class p6=new Person2_Class();
		p6.setter("slo", 21, 256, 6.1, "male", "AB-");
		p6.print();
		
	}

}
