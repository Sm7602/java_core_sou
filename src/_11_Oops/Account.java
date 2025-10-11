package _11_Oops;


public class Account {
	public static final String BANK_NAME ="SBI";
	private String aName;
	private String aHoldername;
	private long aNum;
	private double balance;
	private double deposit;
	private double withdraw;
	
	public Account(String aName, String aHoldername,long aNum,double balance)
	{
		this.aName=aName;
		this.aHoldername=aHoldername;
		this.aNum=aNum;
		this.balance=balance;
	}
	
	
	public void setAName(String aName)
	{
		this.aName=aName;
	}
	public void setAHoldername(String aHoldername)
	{
		this.aHoldername=aHoldername;
	}
	public void setANum(long aNum)
	{
		this.aNum=aNum;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	public void setDeposit(double deposit)
	{
		this.deposit=deposit;
	}
	public void setWithdraw(double withdraw)
	{
		this.withdraw=withdraw;
	}
	
	public String getAName()
	{
		return aName;
	}
	public String getAHoldername()
	{
		return aHoldername;
	}
	public long getANum()
	{
		return aNum;
	}
	public double getBalance()
	{
		return balance;
	}
	public double getDeposit()
	{
		return balance+=deposit;
	}
	public double getWithdraw()
	{
		return balance-=withdraw;
	}
	public void print()
	{
		System.out.println("BANK_NAME           : "+BANK_NAME);
		System.out.println("ACCOUNT             : "+aName);
		System.out.println("ACCOUNT_HOLDER_NAME : "+aHoldername);
		System.out.println("ACCOUNT_NUMBER      : "+aNum);
		System.out.println("AVALIBLE_BALANCE    : "+balance);
		System.out.println("------------------------");
		
	}
	

}

