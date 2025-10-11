package _11_Oops;

public class Student_Object {
	public static void main(String[] arg)
	{
		Student_Class s1=new Student_Class();
		
		s1.name="Souvik Maity";
		s1.age=21;
		s1.roll=253;
		s1.add="West Bengle";
		s1.course="BCA";
		s1.mark=85.00;
		s1.fName="Lakhsman Maity";
		s1.mName="Sandhya Maity";
		
		s1.print();
		System.out.println("-------------------------");
		s1.study();
		s1.dance();
		s1.sing();
		s1.coder();
		
		System.out.println("<<<<<<<<<<<<.>>>>>>>>>>>>");
	}

}
