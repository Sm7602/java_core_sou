package _11_Oops;

class Animals //perent class / base class /super class
{
    public String name;
    public String sound;
    public boolean eat;
    public boolean pet;
    
    public Animals(String name,String sound,boolean eat,boolean pet)
    {
      this.name=name;
      this.sound=sound;
      this.eat=eat;
      this.pet=pet;
    }
    
    public void eat()
    {
    	  System.out.println(name+" can eat : "+eat);
    }
    
    public void sound()
    {
    	 System.out.println(name +" sounds like : "+sound);
    	 System.out.println("-----------------------------------");
    }  
}


class Dog extends Animals //dog is a derived class/sub class/child class of Animal class
                          //aur //perent class / base class /super class of puppy
{
	private String color;
	public Dog(String name,String sound,boolean eat,boolean pet,String color)
	{
		super(name,sound,eat,pet);
		this.color=color;
	}
	public void dogProp()
	{
		System.out.println(name+" is a Dog");
	    System.out.println(name+" color is : "+color);
	    System.out.println(name +" is a pet : "+pet);
	}
}

class Puppy extends Dog //puppy is a derived class/sub class/child class of dog class
{
	private int leg;
	
	public Puppy(String name,String sound,boolean eat,boolean pet,String color,int leg)
	{
		super(name,sound,eat,pet,color);
		this.leg=leg;
	}
	public void puppyProp()
	{
		System.out.println(name+" leg's num : "+leg);
	}
	
}

class Cat extends Animals // cat is a derived class/sub class/child class of Animal class
                         // aur perent class / base class /super class of kitten class
{
	private String color;
	public Cat(String name,String sound,boolean eat,boolean pet,String color)
	{
		super(name,sound,eat,pet);
		this.color=color;
	}
	public void catProp()
	{
		System.out.println(name+" is a Cat");
		System.out.println(name+" color is : "+color);
		System.out.println(name+" is a pet : "+pet);
	}	
}

class Kitten extends Cat //kitten is a derived class/sub class/child class of cat class
{
	private int eye;
	
	public Kitten(String name,String sound,boolean eat,boolean pet,String color,int eye)
	{
		super(name,sound,eat,pet,color);
		this.eye=eye;
	}
	public void kittenProp()
	{
		System.out.println(name+" have : "+eye+" eyes");
	}
}



public class Inheritance_02 {
	public static void main(String[] arg)
	{
		Animals a=new Animals("name","sound",true,true);
		a.eat();
		a.sound();
		//Dog
		Dog d1=new Dog("Motilal","Buw!",true,true,"black");
		d1.dogProp();
		d1.eat();
		d1.sound();
		//Puppy
		Puppy p1=new Puppy("Moti","Cute Buw!",false,true,"White",4);
		p1.dogProp();
		p1.puppyProp();
		p1.eat();
		p1.sound();
		//Cat
		Cat c1=new Cat("Kiti","Mew!",true,false,"kali");
		c1.catProp();
		c1.eat();
		c1.sound();
		//Kitten
		Kitten k1=new Kitten("pupu","cute Mew!",false,false,"White and Black",2);
		k1.catProp();
		k1.kittenProp();
		k1.eat();
		k1.sound();
		
		
		
		
	}

}
