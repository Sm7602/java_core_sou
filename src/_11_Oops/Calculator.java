package _11_Oops;

public class Calculator {
	private int n1;
	private int n2;
	private char op;
	
	public Calculator(int n1, int n2,char op)
	{
		this.n1=n1;
		this.n2=n2;
		this.op=op;
	}
	public void setN1(int n1)
	{
		this.n1=n1;
	}
	public void setN2(int n2)
	{
		this.n2=n2;
	}
	public void setOp(char op)
	{
		this.op=op;
	}
	public int getSum()
	{
		return n1+n2;
	}
	public int getSub()
	{
		return n1-n2;
	}
	public int getMul()
	{
		return n1*n2;
	}
	public double getDiv()
	{
		return n1/n2;
	}
	public double getMod()
	{
		return n1%n2;
	}
	public void Solution()
	{
		switch(op)
		{
		case '+' :
		{
			System.out.println(" "+getSum());
			break;
		}
		case '-' :
		{
			System.out.println(" "+getSub());
			break;
		}
		case '*' :
		{
			System.out.println(" "+getMul());
			break;
		}
		case '/' :
		{
			System.out.println(" "+getDiv());
			break;
		}
		case '%' :
		{
			System.out.println(" "+getMod());
			break;
		}
		
		}
	}

}
