package _18_List;
//Create an ArrayList to store employee information,
//including name, department, and salary.
//Add several employees to the ArrayList 
//and find the employee with the highest salary.

import java.util.*;

class Employee
{
	String name;
	String department;
	double salary;
	
	Employee(String name,String department,double salary)
	{
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getDepartment()
	{
		return department;
	}
	
    public String toString()
    {
    	   return "[Name : "+name+", Depaerment : "+department+", Salary : "+salary+"]";
    }
 
}

public class Problem07 {
	
	public static void main(String [] arg)
	{
		ArrayList<Employee> list=new ArrayList<>();
		
		list.add(new Employee("Aklu","Developer",500000));
		list.add(new Employee("Maklu","Manager",700000));
		list.add(new Employee("Taklu","Developer",300000));
		list.add(new Employee("Coklu","Boss",5000000));
		
		Employee highestsal=list.get(0);
		
		for(Employee employees : list)
		{
			System.out.println(employees);
			
			if(employees.getSalary() > highestsal.getSalary())
			{
			highestsal=employees;
			}
		}
		
		System.out.println("HighestSalay : "+highestsal);
	}

}
