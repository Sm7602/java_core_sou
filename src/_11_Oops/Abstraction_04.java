package _11_Oops;

abstract class  PaymentGateway
{
	public abstract void makePayment();
	public abstract void refundPayment();
	
}

class Paypal extends PaymentGateway
{
	@Override
	public void makePayment()
	{
		System.out.println("make payment");
	}
	
	@Override
	public void refundPayment()
	{
		System.out.println("refund payment");
	}
}


public class Abstraction_04 {
	public static void main(String [] arg)
	{
		Paypal p=new Paypal();
		p.makePayment();
		p.refundPayment();
	}

}
