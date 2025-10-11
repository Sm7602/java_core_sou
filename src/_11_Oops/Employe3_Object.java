package _11_Oops;

public class Employe3_Object {
	public static void main(String [] arg)
	{
		System.out.println("--------------------------");
		
		Employe3_Class e1=new Employe3_Class("Souvik",21,"Male",2,20000);
	    e1.getSalary();
	    e1.print();
	    
	    //update
	    
	    System.out.println("-----UPDATE----");
	    e1.setY(5);
	    e1.getSalary();
	    e1.getAge();
	    e1.print();
	    
	    Employe3_Class e2=new Employe3_Class("Sonu",20,"Male",1,15000);
	    e2.getSalary();
	    e2.print();
	    
	    
       //update
	    
	    System.out.println("-----UPDATE----");
	    e2.setY(5);
	    e2.getSalary();
	    e2.getAge();
	    e2.print();
	    
	    
	}
	

}
