package _11_Oops;
class Student
{
	private String name;
	private int age;
	private String gen;
	private double cgp;
	private final Skill skill;
	private Placement placement;
	private Girlfreind girlfreind;
	
	public Student(String name,int age,String gen,double cgp)
	{
		this.name=name;
		this.age=age;
		this.gen=gen;
		this.cgp=cgp;
		skill=new Skill("JAVA ", "Problem solving" , "Communication");
	}	
	
	@Override
	public String toString()
	{
		return "Student[NAME : "+name+", AGE  : "+age+", GENDER : "+gen+", CGP : "+cgp+", SKILL : "+skill+","
				+ " PLACEMENT : "+placement+", GIRLFREIND :"+girlfreind+"]";
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getGen()
	{
		return gen;
	}
	public void setGen(String gen)
	{
		this.gen=gen;
	}
	public double getCgp()
	{
		return cgp;
	}
	public void setCgp(double cgp)
	{
		this.cgp=cgp;
	}
	public Skill getSkill()
	{
		return skill;
	}
	public Placement getPlacement()
	{
		return placement;
	}
	public void setPlacement(Placement placement)
	{
		this.placement=placement;
	}
	public Girlfreind getGirlfreind()
	{
		return girlfreind;
	}
	public void setGirlfreind(Girlfreind girlfreind)
	{
		this.girlfreind=girlfreind;
	}
}

class Skill //composition
{
	private String s1;
	private String s2;
	private String s3;
	
	public Skill(String s1,String s2,String s3)
	{
		super();
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	
	@Override
	public String toString()
	{
		return "Skill[SKILL : "+s1+" & "+s2+" & "+ s3 +"]";
	}
}

class Placement //aggregation
{
	private String pakage;
	
	public Placement(String pakage)
	{
		super();
		this.pakage=pakage;
	}
	
	@Override
	public String toString()
	{
		return "Placement[PAKAGE : "+pakage+"]";
	}
}

class Girlfreind //aggregation
{
	private int numgf;
	private String feedback;
	
	public  Girlfreind(int numgf,String feedback)
	{
		super();
		this.numgf=numgf;
		this.feedback=feedback;
	}
	
	@Override
	public String toString()
	{
		return "Girlfreind[NUM OF GF : "+numgf+",FEEDBACK : "+feedback+"]";
	}
	
}

public class Association_04 {
	public static void main(String [] arg)
	{
		Student s1=new Student("Souvik",21,"Male",8.5);
		Placement p=new Placement("BHUL JAO!.....");
		Girlfreind g=new  Girlfreind(0,"Hota to thodi a sab karta !....");
		s1.setPlacement(p);
		s1.setGirlfreind(g);
		System.out.println(s1);
		
		Student s2=new Student("Vikash",24,"Male",8.5);
		Placement p2=new Placement("5 LPA");
		Girlfreind g2=new  Girlfreind(1,"Dill jhumm jhumm....");
		s2.setPlacement(p2);
		s2.setGirlfreind(g2);
		System.out.println(s2);
		
		Student s3=new Student("OM kumer",23,"Male",7.5);
		Placement p3=new Placement("3 LPA");
		Girlfreind g3=new  Girlfreind(0,"BTS lover hu....");
		s3.setPlacement(p3);
		s3.setGirlfreind(g3);
		System.out.println(s3);
	}

}
