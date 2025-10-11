package _11_Oops;

abstract class Car5
{
	public String name;
	
	public Car5(String name)
	{
		this.name=name;
	}
	
	public abstract void startCar();
	
	public abstract void stopCar();
	
}

class SDO extends Car5
{
	public SDO(String name)
	{
		super(name);
	}
	@Override
	public void startCar()
	{
		System.out.println(name+" is Start");
	}
	@Override
	public void stopCar()
	{
		System.out.println(name+" is stop");
	}
	public void playMusic()
	{
		System.out.println(name+"'s music is play ");
	}
}

class Creta extends SDO
{
	public Creta(String name)
	{
		super(name);
	}
	public void light()
	{
		System.out.println(name+" is on light");
	}
}

class SUDO extends Car5
{
	public SUDO(String name)
	{
		super(name);
	}
	@Override
	public void startCar()
	{
		System.out.println(name+" is Start");
	}
	@Override
	public void stopCar()
	{
		System.out.println(name+" is stop");
	}
	public void playMusic()
	{
		System.out.println(name+"'s music is play ");
	}
}

class Warna extends SDO
{
	public Warna(String name)
	{
		super(name);
	}
	public void light()
	{
		System.out.println(name+" is on light");
	}
}




public class Abstraction_01 {
	public static void main(String[] arg)
	{
		SDO s=new SDO("SDO");
		s.startCar();
		s.stopCar();
		s.playMusic();
		
		System.out.println("----------------------------------------");
		
		Creta c=new Creta("Creta");
		c.startCar();
		c.stopCar();
		c.playMusic();
		c.light();
		
		System.out.println("----------------------------------------");
		
		SUDO su=new SUDO("SUDO");
		su.startCar();
		su.stopCar();
		su.playMusic();
		
		System.out.println("----------------------------------------");
		
		Warna w=new Warna("Warna");
		w.startCar();
		w.stopCar();
		w.playMusic();
		w.light();
		
	}

}
