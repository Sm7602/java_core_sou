package _15_Exception_Handling;

public class _01_Try_Catch {
	public static void main(String [] arg)
	{
	
	String str="Hello";
	
	try
	{
	System.out.println("Hello.........1");
	System.out.println("Hello.........2");
	System.out.println("Hello.........3");
	System.out.println("Hello.........4");
	System.out.println(str.length());
	System.out.println(str.charAt(2));
	System.out.println(100/0);
	
	}
	catch(NullPointerException e) // this is for null value put
	{
		System.out.println("NullPointerException ayya...............");
		e.printStackTrace();
	}
	catch(StringIndexOutOfBoundsException e) // this is for out of size
	{
		System.out.println("StringIndexOutOfBoundsException ayya.....");
		e.printStackTrace();
	}
	catch(ArithmeticException e) // this is for arithmetic 
	{
		System.out.println("ArithmeticException ayya.....");
		e.printStackTrace();
	}
	catch(Exception e) // this is all the exception
	{
		System.out.println(" ayya.....");
		e.printStackTrace();
	}
	
	System.out.println("Hello.........5");
	System.out.println("Hello.........6");
	System.out.println("Hello.........7");
	System.out.println("Hello.........8");
	
	
	}

}
