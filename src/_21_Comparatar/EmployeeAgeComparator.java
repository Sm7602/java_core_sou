package _21_Comparatar;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee>
{
	
	@Override
	public int compare(Employee ob1,Employee ob2)
	{
		return ob1.getAge()-(ob2.getAge());
	}

}
