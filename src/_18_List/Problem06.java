package _18_List;
// Create an ArrayList to store product information,
// including name,price, and quantity. Add several products
// to the ArrayList and calculate the total 
// cost of all products.

import java.util.*;
class Product
{
	   String name;
	   double price;
	   int quntity;
	 
	Product(String name,double price,int quntity)
	{
		this.name=name;
		this.price=price;
		this.quntity=quntity;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public int getQuntity()
	{
		return quntity;
	}
	public double getTotal()
	{
		return  price*quntity;
	}
	@Override
	public String toString()
	{
		return "[Name : "+name+", Price :$ "+price+", Quntity : "+quntity;
	}
}
public class Problem06 {
	public static void main(String[] arg)
	{
		ArrayList<Product> Products=new ArrayList<>();
		Products.add(new Product("ACER laptop",40000.00,8));
		Products.add(new Product("Iphone 17 pro",140000.00,5));
		Products.add(new Product("Camera",30000.00,3));
		Products.add(new Product("Shanti",10000000.00,2));
		Products.add(new Product("Ac",20000.00,4));
		
		double totalcost=0;
		for(Product products: Products)
		{
			totalcost +=products.getTotal();
			System.out.println(products+", Total cost :$ "+ totalcost+"]");
		}
	}

}
