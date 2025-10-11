package _21_Comparatar;

import java.util.ArrayList;
import java.util.Collections;
class Student  
{
	private String name;
	private int age;
	private double grade;
	
	Student(String name,int age,double grade)
	{
		 
		this.name=name;
		this.age=age;
		this.grade=grade;
	}
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getgrade()
	{
		return grade;
	}
	
	@Override
	public String toString()
	{
		return "[Name: "+name+", Age "+age+",Grade "+grade+"]";
	}
}


public class Problem01 {
	public static void main(String[] arg)
	{

		ArrayList<Student> Students=new ArrayList<>();
		
		Students.add(new Student("Sourav",21,90.20));
		Students.add(new Student("Vikash",23,92.50));
		Students.add(new Student("Sonu",21,95.70));
		Students.add(new Student("Anish",20,60.20));
		Students.add(new Student("Sovan",21,70.60));
		Students.add(new Student("Arpan",21,95.20));
		
		 
		 for (Student student : Students) {
	            System.out.println(student.toString());
	        }

		 System.out.println("\n");
		 
		 Collections.sort(Students,new StudentNamecamparator());
		 
		 for (Student student : Students) {
	            System.out.println(student.toString());
	        }
	}


}
