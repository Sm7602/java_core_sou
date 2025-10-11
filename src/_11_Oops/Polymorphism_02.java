package _11_Oops;
class Calculator2
{
	public void solve(int n1,int n2,char op) //for n1 n2 is a int value
	{
		switch(op)
		{
		case '+' :
		{
			System.out.println("Sum is : "+(n1+n2));
			break;
		}
		case '-' :
		{
			System.out.println("Sub : "+(n1-n2));
			break;
		}
		case '*' :
		{
			System.out.println("Mul is : "+(n1*n2));
			break;
		}
		case '/' :
		{
			System.out.println("Divi : "+(n1/n2));
			break;
		}
		default :
		{
			System.out.println("ERROR.....");
			break;
		}
		}
		System.out.println("n1 n2 is intizer");
	}
	
	public void solve(int n1,double n2,char op) // for n1 is int n2 is double value
	{
		switch(op)
		{
		case '+' :
		{
			System.out.println("Sum is : "+(n1+n2));
			break;
		}
		case '-' :
		{
			System.out.println("Sub : "+(n1-n2));
			break;
		}
		case '*' :
		{
			System.out.println("Mul is : "+(n1*n2));
			break;
		}
		case '/' :
		{
			System.out.println("Divi : "+(n1/n2));
			break;
		}
		default :
		{
			System.out.println("ERROR.....");
			break;
		}
		}
		System.out.println("n1 intizer & n2 double");
	}
	
	public void solve(double n1, int n2,char op) //for n1 is double n2 is int value
	{
		switch(op)
		{
		case '+' :
		{
			System.out.println("Sum is : "+(n1+n2));
			break;
		}
		case '-' :
		{
			System.out.println("Sub : "+(n1-n2));
			break;
		}
		case '*' :
		{
			System.out.println("Mul is : "+(n1*n2));
			break;
		}
		case '/' :
		{
			System.out.println("Divi : "+(n1/n2));
			break;
		}
		default :
		{
			System.out.println("ERROR.....");
			break;
		}
		}
		System.out.println("n1 double & n2 intizer");
	}
	
	public void solve(double n1,double n2,char op)
	{
		switch(op)
		{
		case '+' :
		{
			System.out.println("Sum is : "+(n1+n2));
			break;
		}
		case '-' :
		{
			System.out.println("Sub : "+(n1-n2));
			break;
		}
		case '*' :
		{
			System.out.println("Mul is : "+(n1*n2));
			break;
		}
		case '/' :
		{
			System.out.println("Divi : "+(n1/n2));
			break;
		}
		default :
		{
			System.out.println("ERROR.....");
			break;
		}
		}
		System.out.println("n1 n2 is double");
	}
	
	
	
	
}

public class Polymorphism_02 {
	public static void main (String[] arg)
	{
		Calculator2 c=new Calculator2();
		c.solve(2,2,'+');
		c.solve(2,2,'*');
		c.solve(2,2,'-');
		c.solve(2,2,'/');
		c.solve(2,2.2,'+');
		c.solve(2,2.2,'-');
		c.solve(2,2.2,'*');
		c.solve(2,2.2,'/');
		c.solve(2.2,2,'+');
		c.solve(2.2,2,'-');
		c.solve(2.2,2,'*');
		c.solve(2.2,2,'/');
		c.solve(2.2,2.2,'/');
		c.solve(2.2,2.2,'+');
		c.solve(2.2,2.2,'-');
		c.solve(2.2,2.2,'*');
		
	}

}
