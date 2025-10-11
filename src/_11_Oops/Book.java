package _11_Oops;

public class Book {
	
	private String title;
	private String auther;
	private String ISBN;
	
	public Book(String title,String auther,String ISBN)
	{
		this.title=title;
		this.auther=auther;
		this.ISBN=ISBN;
	}
	
	public String getTitle()
	{
		return title;
	}
	public String getAuther()
	{
		return auther;
	}
	public String getISBN()
	{
		return ISBN;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setAuther(String auther)
	{
		this.auther=auther;
	}
	public void setISBN(String ISBN)
	{
		this.ISBN=ISBN;
	}
	
	public void collection()
	{
		
	}

}
