package _11_Oops;

public class Employe2_Object {
	public static void main(String[] arg)
	{
		System.out.println("------------------------------------");
		
		Employe2_Class e1=new Employe2_Class("souvik","Male",21,200000,1);
		System.out.println("NAME      : "+e1.getName());
		System.out.println("GENDER    : "+e1.getGender());
		System.out.println("AGE       : "+e1.getAge());
		System.out.println("SALARY    : $"+e1.getSalary());
		System.out.println("EXPRIENCE : "+e1.getY()+"Year");
		
		//update
		
		System.out.println("-----------After updation-----------");
		
		e1.setName("Mr.Souvik");
	    //e1.setAge(24);
		e1.setSalary(300000);
		e1.setY(3);
		
		System.out.println("NAME      : "+e1.getName());
		System.out.println("GENDER    : "+e1.getGender());
		System.out.println("AGE       : "+(e1.getAge()+3));
		System.out.println("SALARY    : $"+e1.getSalary());
		System.out.println("EXPRIENCE : "+e1.getY()+"Year");
		
		System.out.println("-----------------------------------");
		
		Employe2_Class e2=new Employe2_Class("Vikash","Male",24,300000,1);
		System.out.println("NAME      : "+e2.getName());
		System.out.println("GENDER    : "+e2.getGender());
		System.out.println("AGE       : "+e2.getAge());
		System.out.println("SALARY    : $"+e2.getSalary());
		System.out.println("EXPRIENCE : "+e2.getY()+"Year");
		
		//update
		
        System.out.println("-----------After updation-----------");
		
		e2.setName("Mr.Vikash");
	//	e2.setAge(29);
		e2.setSalary(500000);
		e2.setY(5);
		
		System.out.println("NAME      : "+e2.getName());
		System.out.println("GENDER    : "+e2.getGender());
		System.out.println("AGE       : "+(e2.getAge()+5));
		System.out.println("SALARY    : $"+e2.getSalary());
		System.out.println("EXPRIENCE : "+e2.getY()+"Year");
		
		System.out.println("-----------------------------------");
		

		
		
	}

}
