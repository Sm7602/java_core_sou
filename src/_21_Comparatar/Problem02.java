package _21_Comparatar;
import java.util.LinkedList;
import java.util.Collections;

class Employee
{
	private String name;
	private String dep;
	private int age;
	private double salary;
	
	public Employee(String name,String dep,int age )
	{
		this.name=name;
		this.dep=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public String getDept()
	{
		return dep;
	}
	public int getAge()
	{
		return age;
	}
	public double getSalary() {
	    if (age >= 20 && age <= 25) 
	    {
	        this.salary = 20000;
	    } 
	    else if (age >= 26 && age <= 30) 
	    {
	        this.salary = 25000;
	    }
	    else if (age >= 31 && age <= 35) {
	        this.salary = 30000;
	    }
	    else if (age >= 36 && age <= 40)
	    {
	        this.salary = 50000;
	    }
	    return salary;
	}
	@Override
	public String toString()
	{
		
		return "[Name : "+name+", Depertment : "
	      +dep+", Age : "+age+", Salary : "+ getSalary()+"]";
	}
}

public class Problem02 {
	public static void main(String[] arg)
	{
		LinkedList<Employee> ll=new LinkedList<Employee>();
		
		ll.offer(new Employee("Vikash","Developer",23 ));
		ll.offer(new Employee("Sonu","Developer",21 ));
		ll.offer(new Employee("Sohil","Developer",20 ));
		ll.offer(new Employee("lalu","Developer",36 ));
		ll.offer(new Employee("kalu","Developer",29 ));
		ll.offer(new Employee("Vikrash","Developer",21));
		ll.offer(new Employee("Anisha","Developer",20 ));
		ll.offer(new Employee("Akankha","Developer",22 ));
		ll.offer(new Employee("Monu","Developer",33 ));
		
		for(Employee employees:ll)
		{
			System.out.println(employees);
		}
		
		System.out.println("\n ");
		
		Collections.sort(ll,new EmployeeAgeComparator());
		
		for(Employee employees:ll)
		{
			System.out.println(employees);
		}
	}

}
