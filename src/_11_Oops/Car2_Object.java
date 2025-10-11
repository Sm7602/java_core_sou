package _11_Oops;

public class Car2_Object {
	public static void main(String[] arg)
	{
		System.out.println("---------------------------------------");
		Car2_Class c1=new Car2_Class();
		c1.setter("Mahendra Thar", "WB 16J 6666", "Black", 40.00, 350, "4x4", 6, true, true, true,2000000);
		c1.print();
		
       Car2_Class c2=new Car2_Class();
       c2.setter("BMW Z12", "DL 22K 2564", "White",30.00 , 550, "4x4", 7, true, true, true,5000000);
       c2.print();
       
       Car2_Class c3 = new Car2_Class();
       c3.setter("Hyundai Creta","DL 16B 6868", "Red", 35.00, 650, "4x4", 7, true, true, true,3000000);
       c3.print();
       
       Car2_Class c4=new Car2_Class();
       c4.setter("Maruti 800", "MI 21T 1111", "Lavender blue", 45.00, 300, "2x4", 5, false, true, false, 500000);
       c4.print();
       
       Car2_Class c5=new Car2_Class();
       c5.setter("TATA Nexson", "UP 17N 2586 ", "Blue", 40.00, 250, "2x4", 5, true, true, false, 800000);
       c5.print();
	}

}
