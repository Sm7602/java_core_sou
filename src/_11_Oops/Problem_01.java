package _11_Oops;

public class Problem_01 {
	public static void main(String[] arg)
	{
		//area and primeter of ractangle
		
		Ractangle r=new  Ractangle(5,2);
		System.out.println("Area of Ractangle     : "+r.getA());
		System.out.println("Primeter of Ractangle : "+r.getP());
		
		System.out.println("------------------------------");
		
		//area and  Circumference of circle
		
		Circle c1=new Circle(6.0);
		System.out.println("Area of Circle          : "+c1.getA());
		System.out.println("Circumference of circle : "+c1.getC() );
		
		System.out.println("------------------------------");
		
		//add and remove  book
		
		Book b1=new Book("Ignited minds","APJ ABDUL KALAM","978-0-143-02962-3");
		System.out.println("Book Title : "+b1.getTitle());
		System.out.println("Auther     : "+b1.getAuther());
		System.out.println("ISBN       : "+b1.getISBN());
	}

}
