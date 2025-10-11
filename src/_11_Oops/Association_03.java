package _11_Oops;

class University
{
	private String name;
	private String collageName;
	private  Deperment deperment;
	
	public University(String name,String collageName)
	{
		this.name=name;
		this.collageName=collageName;
		deperment=new Deperment("CSE","B.tech");
	}
	
	@Override
	public String toString()
	{
		return "University[UNIVERSITY NAME : "+name+",COLLAGE NAME : "+collageName+",DEPERMENT : "+deperment+"]";
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getCollageName()
	{
		return collageName;
	}
	public void setCollageName(String collageName)
	{
		this.collageName=collageName;
	}
	public Deperment getDeperment()
	{
		return deperment;
	}
	public void setDeperment(Deperment deperment)
	{
		this.deperment=deperment;
	}
}

class Deperment
{
	private String name;
	private String course;
	
	public Deperment(String name,String course)
	{
		super();
	 this.name=name;
	 this.course=course;
	}
	
	@Override
	public String toString()
	{
		return "Deperment[DEPERMENT NAME : "+name+",COURSE  : "+course+"]";
	}
}

public class Association_03 {
	public  static void main(String[] arg)
	{
		University u1=new University("CCSU","AIMT");
		System.out.println(u1);
		
		University u2=new University("AKTU","NIIT");
		Deperment deperment=new Deperment("Management","MBA");
		u2.setDeperment(deperment);
		System.out.println(u2);
	}

}
