package _20_Comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double sal;
	
	public Employee(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString()
	{
		return "[ID : "+id+", Name : "+name+", Salary : "+sal+"]";
	}
	
	@Override
	public int compareTo(Employee e)
	{
		return this.id-e.id;
	}
}

public class For_Int_value {
	public static void main(String[] arg)
	{
		ArrayList<Employee> list=new ArrayList< >();
		
		list.add(new Employee(250,"lala",200000.00));
		list.add(new Employee(150,"kala",200000.00));
		list.add(new Employee(2550,"mala",200000.00));
		list.add(new Employee(50,"sala",200000.00));
		list.add(new Employee(2500,"nala",200000.00));
		list.add(new Employee(2050,"pala",200000.00));
		
		for(Employee employees : list)
		{
			System.out.println(employees.toString());
		}
		
		Collections.sort(list);
		
		for(Employee employees : list)
		{
			System.out.println(employees.toString());
		}
	}

}
