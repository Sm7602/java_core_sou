package _12_Wrapper_Class;

public class Base {
	public static void main(String [] arg)
	{
		/* before virson 5.0
		 
		  Integer i=new Integer(2);
		  Byte b= new Byte(12);
		  Short s=new Short(1);
		  Long l=new Long(55555555l);
		  Character c=new Character('a');
		  Boolean bl=new Boolean(true);
		  Float f=new Float(1.2f);
		  Double d=new Double(2.00005);
		  
		  //unboxing primitive to non primitive/ wrapper class
		in=integer.valueof(i);
		
		//boxing wrapper class to primitive;
		i=int.value(in);
		
		  
		 */
		
		//after 5.0
		
		Integer i=500;
		Byte b=12;
		Short s=1;
		Long l=55555555l;
		Character c='a';
		Boolean bl=true;
		Float f=1.2f;
		Double d=2.00005;
		
		int in=200;
		byte by=13;
		short sh=2;
		long lo=6666666l;
		char ch='b';
		boolean ble=false;
		float fl=1.3f;
		double db=2.0006;
		
		System.out.println(in+" int   "+i+" Integer\n"+by+" byte   "+b+" Byte\n"+sh+" short   "+s+" Short\n"+lo+" long   "+l+" Long\n"+
		ch+" char   "+c+" Character\n"+ble+" boolean   "+bl+" Boolean\n"+fl+" float   "+f+" Float\n"+db+" double   "+d+" Double");
		
		System.out.println("---------------------------------------");
		//unboxing primitive to non primitive/ wrapper class
		
		in= i;
		by=b;
		sh=s;
		lo=l;
		ch=c;
		ble=bl;
		fl=f;
		db=d;
		
		System.out.println(in+" int   "+i+" Integer\n"+by+" byte   "+b+" Byte\n"+sh+" short   "+s+" Short\n"+lo+" long   "+l+" Long\n"+
				ch+" char   "+c+" Character\n"+ble+" boolean   "+bl+" Boolean\n"+fl+" float   "+f+" Float\n"+db+" double   "+d+" Double");
		
		
		System.out.println("---------------------------------------");
		//boxing wrapper class to primitive;
		
		i=in;
		b=by;
		s=sh;
		l=lo;
		c=ch;
		bl=ble;
		f=fl;
		d=db;
		
		System.out.println(in+" int   "+i+" Integer\n"+by+" byte   "+b+" Byte\n"+sh+" short   "+s+" Short\n"+lo+" long   "+l+" Long\n"+
				ch+" char   "+c+" Character\n"+ble+" boolean   "+bl+" Boolean\n"+fl+" float   "+f+" Float\n"+db+" double   "+d+" Double");
		
		
		
	}

}
