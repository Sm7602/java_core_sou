package _15_Exception_Handling;

import java.util.Scanner;

//bank information.......................................

abstract class PNBBANK
{
	public static final String BANK_NAME="PUNJAB NATIONAL BANK";
	public String IFCE_CODE;
	public String AC_Holder_name;
	
	public PNBBANK(String AC_Holder_name,String IFCE_CODE)
	{
		this.AC_Holder_name=AC_Holder_name;
		this.IFCE_CODE=IFCE_CODE;
	}
	public String getIFCE_CODE()
	{
		return IFCE_CODE;
	}
	public void setIFCE_CODE(String IFCE_CODE)
	{
		this.IFCE_CODE=IFCE_CODE;
	}
}

//atm information.................................

class Atm extends PNBBANK 
{
	Scanner sc=new Scanner(System.in);
	
	String num;
	String exDate;

	public Atm(String AC_Holder_name,String IFCE_CODE,String num,String exDate)
	{
		super(AC_Holder_name,IFCE_CODE);
		this.num=num;
		this.exDate=exDate;
	}
	public String getnum()
	{
		return num;
	}
	public String getExDate()
	{
		return exDate; 
	}
	
	public void atmDetails()
	{
		
		System.out.println("------------------------------");
		System.out.println(" "+BANK_NAME);
		System.out.println(" "+IFCE_CODE+"\n");
		System.out.println("   "+num+"\n");
		System.out.println("     "+exDate);
		System.out.println("               "+AC_Holder_name);
		System.out.println("------------------------------\n");
		
		System.out.println("ATM CREATED  \n\n");

	}
}

//for payment...................................

interface payment
{
	public void deposit();
	public void withdrawal();
	public void balance();
}

class makePayment extends Atm implements payment
{
	Scanner sc=new Scanner(System.in);
	short pin;
	public  makePayment( String AC_Holder_name,String IFCE_CODE,String num,String exDate)
	{
		super(AC_Holder_name,IFCE_CODE,num, exDate);
		System.out.print("CREATE 4 DEGITS PIN : ");
	    pin=sc.nextShort();
	    
	    System.out.println("");
	}
	
	double balance=10;
	public final static double deplim=1000000;
	public final static double withplim=40000;
	
	@Override
	public void deposit()
	{
		System.out.print("ENTER DEPOSIT AMMOUNT :  ");
		double ammount=sc.nextInt();
		
		System.out.print("ENTER PIN :  ");
		short password=sc.nextShort();
		
	if(pin != password)
	 {
		try
		{
		throw new MissMatchpinException("INVALID PIN.....");
		}
		catch(MissMatchpinException e)
		{
			e.printStackTrace();
		}
	 }
	else
	{
		if(ammount > deplim)
		{
			try
			{
			throw new  LImitOutofBoundException("your limit is $1000000");
			}
			catch( LImitOutofBoundException e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println(ammount+" DEPOSIT SUCCESSFULLY........  ");
			balance +=ammount;
		}
	}
   }
	
	@Override
	public void withdrawal( )
	{
		System.out.print("ENTER WITHDRAWAL AMMOUNT :  ");
		double ammount=sc.nextInt();
		
		System.out.print("ENTER PIN :  ");
		short password=sc.nextShort();
		
	if(pin != password)
	 {
		   try
		     {
		       throw new MissMatchpinException("INVALID PIN.....");
		     }
		   catch(MissMatchpinException e)
		     {
			   e.printStackTrace();
		     }
	 }
	else
	{
	      if(balance >0)
	          {
		       if(ammount > withplim)
		          {
			       try
			         {
			           throw new  LImitOutofBoundException("your limit is $40000");
			         }
			       catch( LImitOutofBoundException e)
			         {
				      e.printStackTrace();
			         }
		          }
		        else
		         {
		        	 if(balance < ammount)
				       {
				    	   try
							{
							throw new withdrawTxoutOfBounds("inificence balance.....");
							}
							catch(withdrawTxoutOfBounds e)
							{
								System.err.println("Aqad dekhi.......");
								e.printStackTrace();
							}
				       }
		        	 else
		        	 {
			        System.out.println(ammount+" WITHDRAWAL SUCCESSFULLY........  ");
			        balance -=ammount;
		         }
		         }
	          }
	      else
	        {
	    	  try 
	    	  {
		       throw new accountNotActiveException("Not Active....");
	    	  }
	    	  catch( accountNotActiveException e)
	    	  {
	    		  e.printStackTrace();
	    	  }
	        }
	}
	}
	@Override
	public void balance()
	{
		System.out.println("BALANCE : "+balance);
	}
	
}

//exception.................................................

class NotFoundTapException extends RuntimeException
{
	public NotFoundTapException(String msg)
	{
		super(msg);
	}
}

class MissMatchpinException extends RuntimeException
{
	public MissMatchpinException(String msg)
	{
		super(msg);
	}
}

class LImitOutofBoundException extends RuntimeException
{
	public LImitOutofBoundException(String msg)
	{
		super(msg);
	}
}

class accountNotActiveException extends RuntimeException
{
	public  accountNotActiveException(String msg)
	{
		super(msg);
	}
}

class withdrawTxoutOfBounds extends RuntimeException
{
	public withdrawTxoutOfBounds(String msg)
	{
		super(msg);
	}
}


public class Problem02 {
	//wap  to make a bank managment
	
	public static void Access()
	{
		 makePayment m=new  makePayment("ABHISHEK","BAJKUL2546584F","4562 2145 2564 2016l","26/32");
		 Scanner sc=new Scanner(System.in);
		 
		 m.atmDetails();
		 
		 System.out.print("DEPOSIT TAP 1 / WITHDRAWAL TAP 2 : ");
		 int tap=sc.nextInt();
		 
		 if(tap==1)
		 {
			 m.deposit();
			 m.balance();
		 }
		 else if(tap==2)
		 {
			 m.withdrawal();
			 m.balance();
		 }
		 else
		 {
			 throw new NotFoundTapException("expected 1 / 2");
		 } 
	}
	
	public static void main(String[] arg)
	{
		Access();
		System.out.println("\n THANK YOU.......");
	}

}
