package _17_List;
//Create an ArrayList to store student
//information, including name, age, and grade. 
//Add several students to the ArrayList and print their
//information.

import java.util.*;


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

public class Problem05 {
	public static void main(String[] arg)
	{
		
		
		ArrayList<Student> Students=new ArrayList<>();
		
		Students.add(new Student("Souvik",21,90.20));
		Students.add(new Student("Vikash",23,92.50));
		Students.add(new Student("Sonu",21,95.70));
		Students.add(new Student("Anisha",20,60.20));
		Students.add(new Student("Sovana",21,70.60));
		Students.add(new Student("Aparajita",21,95.20));
		
		 
		 for (Student student : Students) {
	            System.out.println(student.toString());
	        }

	}

}
