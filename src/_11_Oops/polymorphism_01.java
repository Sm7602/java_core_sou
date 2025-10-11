package _11_Oops;

class Animal
{
	public String name;
	public String gen;
	public String color;
	
	public Animal(String name,String gen,String color)
	{
		this.name=name;
		this.gen=gen;
		this.color=color;
	}
	public void animalProp()
	{
		System.out.println(name+" is a animal");
		System.out.println(name+" Gender is "+gen);
		System.out.println(name+" color is "+color);
	}
	public void eat(String eat)
	{
		System.out.println(name+" can eat veg & nonveg "+eat);
	}
	public void sound(String sound)
	{
		System.out.println(name+" sound like "+sound);
		System.out.println("---------------------------------");
	}
}

class Dog2 extends Animal
{
	public Dog2(String name,String gen,String color)
	{
		super(name,gen,color);
	}
	
	@Override
	public void animalProp()
	{
		System.out.println(name+" is a dog");
		System.out.println(name+" Gender is "+gen);
		System.out.println(name+" color is "+color);
	}
	
	@Override
	public void eat(String eat)
	{
		System.out.println(name+" can eat veg & nonveg "+eat);
	}
	
	@Override
	public void sound(String sound)
	{
		System.out.println(name+" sound like "+sound);
		System.out.println("---------------------------------");
	}
}

class Cat2 extends Animal
{
	public Cat2(String name,String gen,String color)
	{
		super(name,gen,color);
	}
	
	@Override
	public void animalProp()
	{
		System.out.println(name+" is a cat");
		System.out.println(name+" Gender is "+gen);
		System.out.println(name+" color is "+color);
	}
	
	@Override
	public void eat(String eat)
	{
		System.out.println(name+" can eat veg & nonveg "+eat);
	}
	
	@Override
	public void sound(String sound)
	{
		System.out.println(name+" sound like "+sound);
		System.out.println("---------------------------------");
	}
}

public class polymorphism_01 {
	public static void main(String[] arg)
	{
		Dog2 d=new Dog2("muku","male","black");
		d.animalProp();
		d.eat("both");
		d.sound("buw !");
		
		Cat2 c=new Cat2("kiti","female","white");
		c.animalProp();
		c.eat("nonveg");
		c.sound("mew !");
		
		
	}

}
