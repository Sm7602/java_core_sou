package _11_Oops;

public class Student2_Object {
	public static void main(String[] arg)
	{
		System.out.println("------------------------------------");
		
		Student2_Class s1=new Student2_Class();
		s1.Setter("Souvik Maity",21, 253,"BCA" , "Genral", "Lakshman Maity", "Sandhya Maity", "West Bengal", "SM2496444@GAMIL.COM", 7602564154l);
		s1.print();
		
		Student2_Class s2=new Student2_Class();
		s2.Setter("Vikash Bind", 23, 266,"BCA", "Genral", "Amerdev Bind", "Priya Bind", "Utter prades", "VIKASH1234@GAMIL.COM", 8561253462l);
		s2.print();
		
		Student2_Class s3=new Student2_Class();
		s3.Setter("Om Kumer", 22, 216, "BCA","Genral", "Sahadev Yadev", "Monti Yadev", "Jharkhand", "OMKUMER234@GMAIL.COM", 2654832791l);
		s3.print();
		
		Student2_Class s4=new Student2_Class();
		s4.Setter(null, 0, 0, null, null, null, null, null, null, 0);
		s4.print();
		
		
		}

}
