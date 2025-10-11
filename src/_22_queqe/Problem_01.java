package _22_queqe;
import java.util.PriorityQueue;
class Patient
{
	private String name;
	private int age;
	private String gen;
	private String condition;
	
	public Patient(String name,int age,String gen,String condition)
	{
		this.name=name;
		this.age=age;
		this.gen=gen;
		this.condition=condition;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGender()
	{
		return gen;
	}
	public String getCondition()
	{
		return condition;
	}
	@Override
	public String toString()
	{
		return "[Name : "+name+", Age : "+age+
				", Gender : "+gen+", Condition : "+condition+"]";
	}
}

public class Problem_01 {
	public static void main(String[] arg)
	{
		PriorityQueue<Patient> pq=new PriorityQueue<Patient>(new ConditionCamparator());
		
		pq.offer(new Patient("Lala",35,"Male","Minor"));
		pq.offer(new Patient("Kala",25,"Male","Minor"));
		pq.offer(new Patient("Lali",45,"FeMale","Major"));
		pq.offer(new Patient("Mala",35,"FeMale","Critical"));
		pq.offer(new Patient("Rala",15,"Male","Major"));
		pq.offer(new Patient("Nala",55,"Male","Critical"));
		pq.offer(new Patient("Lalu",65,"Male","Minor"));
		 
		 while (!pq.isEmpty()) {
	           Patient patient = pq.poll();
	            System.out.println(patient);
	        }
		
	}

}
