package _19_Comparable;

import java.util.Collections;
import java.util.LinkedList;

class Student implements Comparable<Student>
{
	private String name;
	private int age;
	private String gen;
	
	public Student(String name,int age,String gen)
	{
		this.name=name;
		this.age=age;
		this.gen=gen;
	}
	
	@Override
	public String toString()
	{
		return "[Name : "+name+", Age : "+age+", Gender : "+gen+"]";
	}
	@Override
	public int compareTo(Student obj)
	{
		return this.name.compareTo(obj.name);
	}
}

public class For_String_Value {
	public static void main(String[] arg)
	{
		LinkedList<Student> list=new LinkedList<>();
		
		list.add(new Student("Sourav",21,"Male"));
		list.add(new Student("Sonam",21,"FeMale"));
		list.add(new Student("Akash",21,"Male"));
		list.add(new Student("Akankha",21,"FeMale"));
		list.add(new Student("Vikash",21,"Male"));
		list.add(new Student("Sandeep",21,"Male"));
		list.add(new Student("Bula",21,"Male"));
		list.add(new Student("CulCul",21,"Male"));
		
		for(Student students : list)
		{
			System.out.println(students.toString());
		}
		System.out.println("\n");
		
		Collections.sort(list);
		
		for(Student students : list)
		{
			System.out.println(students.toString());
		}
	}

}
