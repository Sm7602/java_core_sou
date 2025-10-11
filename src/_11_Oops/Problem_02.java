package _11_Oops;

public class Problem_02 {
	public static void main(String[] arg)
	{
		//calculator
		
		Calculator c1=new Calculator(5,2,'+');
		c1.Solution();
		c1.setOp('-');
		c1.Solution();
		System.out.println(" "+c1.getMul());
		
		System.out.println("------------------------");
		
		//account info
		
		Account a1=new  Account("Sevings","Souvik Maity",256148765315l,500.00);
	//	System.out.println(a1.BANK_NAME);
	//	System.out.println(a1.getAName());
	//	System.out.println(a1.getAHoldername());
	//	System.out.println(a1.getANum());
	//	System.out.println(a1.getBalance());
	//	System.out.println("------------------------");
		
		a1.print();
		
		a1.setDeposit(200);
		a1.getDeposit();
		a1.print();
		
		a1.setWithdraw(500);
		a1.getWithdraw();
		a1.print();
		
		//trafic light
		
		
		Trafic t1=new Trafic("Red");
	//  System.out.println("----------"+t1.getColor()+"----------");
	//	System.out.println("Light is Red    : "+t1.isRed());
	//	System.out.println("Light is Orange : "+t1.isOrange());
	//	System.out.println("Light is Green  : "+t1.isGreen());
	//	System.out.println("Duration        : "+t1.duration+"'S");
		t1.print();
		
		t1.setColor("Orange");
	//	System.out.println("----------"+t1.getColor()+"----------");
	//	System.out.println("Light is Orange : "+t1.isOrange());
	//	System.out.println("Light is Green  : "+t1.isGreen());
	//	System.out.println("Light is Red    : "+t1.isRed());
	//	System.out.println("Duration        : "+t1.duration+"'S");
		t1.print();
		
		t1.setColor("Green");
	//	System.out.println("----------"+t1.getColor()+"----------");
	//	System.out.println("Light is Green  : "+t1.isGreen());
	//	System.out.println("Light is Red    : "+t1.isRed());
	//	System.out.println("Light is Orange : "+t1.isOrange());
	//	System.out.println("Duration        : "+t1.duration+"'S");
		t1.print();
		
		
		
		
		
		
	}

}
