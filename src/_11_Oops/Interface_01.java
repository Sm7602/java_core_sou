package _11_Oops;

interface printtable
{
	void print();
}

class Document implements printtable
{
	@Override
	public void print()
	{
		System.out.println("Document..............");
	}
}

class Image implements printtable
{
	@Override
	
	public void print()
	{
		System.out.println("Image..............");
	}
}

class Video implements printtable
{
	@Override
	public void print()
	{
		System.out.println("Video...............");
	}
}

public class Interface_01 {
	public static void main(String [] arg)
	{
		printtable d=new Document();
		d.print();
		
		printtable i=new Image();
		i.print();
		
		printtable v=new Video();
		v.print();
	}

}
