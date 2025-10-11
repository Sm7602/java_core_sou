package _11_Oops;

public class Employe_Object {
	public static void main(String[] arg)
	{
		System.out.println("--------------------------");
		
		Employe_Class e1=new Employe_Class("souvik","Male",21,"Developer",20000,2);
		e1.print();
		
		Employe_Class e2=new Employe_Class("Vikash","Male",24,"GameDev",30000,3);
		e2.print();
		
		Employe_Class e3=new Employe_Class("Om","Male",23,"Developer",25000,2);
		e3.print();
		
		Employe_Class e4=new Employe_Class("Sibsanker","Male",21,"Team leader",100000,3);
		e4.print();
		
		Employe_Class e5=new Employe_Class("Shibam","Male",22,"Mecanic",150000,3);
		e5.print();
		
		Employe_Class e6=new Employe_Class("Krishanu","Male",21,"Influenser",120000,2);
		e6.print();
		
	    Employe_Class e7=new Employe_Class("Saibal","Male",21,"Seller",150000,3);
	    e7.print();
	    
	    Employe_Class e8=new Employe_Class("Sayon","Male",22,"Designer",120000,1);
	    e8.print();
	    
	    Employe_Class e9=new Employe_Class("Amares","Male",21,"Self Employe",120000,3);
	    e9.print();
	    
	    Employe_Class e10=new Employe_Class("Mona","Trangender",25,"Manager",500000,5);
	    e10.print();

	}

}
