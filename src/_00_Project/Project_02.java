package _00_Project;

import java.util.Scanner;


public class Project_02 {
	
	public static int menu()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press 1 for Chips & Namkeen..........");
		System.out.println("Press 2 for Stationary Needs.........");
		System.out.println("Press 3 for Drinks & Juices..........");
		System.out.println("Press 4 for cakes & Biscuits.........");
		System.out.println("Press 5 for Milk,Curd & Panner.......");
		
		System.out.println();
		
		System.out.print("Press : ");
		int press=sc.nextInt();
		
		System.out.println();
		
		switch(press)
		{
		case 1 :
		{
			System.out.println("Tap 1 for Kurkure................... $20");
			System.out.println("Tap 2 for lays...................... $20");
			System.out.println("Tap 3 for Haldiram's Namkeen........ $100");
			System.out.println("Tap 4 for Salted Peanuts............ $80");
			System.out.println("Tap 5 for Bikano Aloo Bhujiya....... $55");
			
			System.out.println();
			break;
		}
		case 2 :
		{
			System.out.println("Tap 1 for NoteBook........ $50");
			System.out.println("Tap 2 for Pen............. $20");
			System.out.println("Tap 3 for Feviquik........ $10");
			System.out.println("Tap 4 for Calculator...... $580");
			System.out.println("Tap 5 for Book....... $100");
			
			System.out.println();
			break;
		}
		case 3 :
		{
			System.out.println("Tap 1 for Lahori Zeera........ $20");
			System.out.println("Tap 2 for Coke................ $40");
			System.out.println("Tap 3 for String.............. $20");
			System.out.println("Tap 4 for Nesecafe............ $120");
			System.out.println("Tap 5 for Bislari............. $30");
			
			System.out.println();
			break;
		}
		case 4 :
		{
			System.out.println("Tap 1 for Sunfeast........ $98");
			System.out.println("Tap 2 for Hide & Seek..... $48");
			System.out.println("Tap 3 for Perle G......... $40");
			System.out.println("Tap 4 for Slice Cake...... $80");
			System.out.println("Tap 5 for Goobels........ $100");
			
			System.out.println();
			break;
		}
		case 5 :
		{
			System.out.println("Tap 1 for Milk.............. $50");
			System.out.println("Tap 2 for Curd.............. $20");
			System.out.println("Tap 3 for Paneer............ $150");
			System.out.println("Tap 4 for Cuntridilite...... $580");
			System.out.println("Tap 5 for Misti curd........ $100");
			
			System.out.println();
			break;
		}
		default :
		{
			System.err.println("Somting wrong......");
		}
		}  
		return press;
	}
	
	public static double Calculate( )
	{
		Scanner sc=new Scanner(System.in);
		int tap=0;
		int press=menu();
		double total=0;
	   
	    switch(press)
	    {
	        case 1:
	        {
	        	System.out.print("Tap : ");
	    	    tap=sc.nextInt();
	        	if(tap==1)
	    		{
	    			total +=20;
	    		}
	    		else if(tap==2)
	    		{
	    			total +=20;
	    		}
	    		else if(tap==3)
	    		{
	    			total +=100;
	    		}
	    		else if(tap==4)
	    		{
	    			total +=80;
	    		}
	    		else if(tap==5)
	    		{
	    			total +=55;
	    		}
	        	break;
	        }
	        case 2:
	        {
	        	System.out.print("Tap : ");
	    	    tap=sc.nextInt();
	        	if(tap==1)
	    		{
	    			total +=50;
	    		}
	    		else if(tap==2)
	    		{
	    			total +=20;
	    		}
	    		else if(tap==3)
	    		{
	    			total +=10;
	    		}
	    		else if(tap==4)
	    		{
	    			total +=580;
	    		}
	    		else if(tap==5)
	    		{
	    			total +=100;
	    		}
	        	break;
	        }
	        case 3:
	        {
	        	System.out.print("Tap : ");
	    	    tap=sc.nextInt();
	        	if(tap==1)
	    		{
	    			total +=20;
	    		}
	    		else if(tap==2)
	    		{
	    			total +=40;
	    		}
	    		else if(tap==3)
	    		{
	    			total +=20;
	    		}
	    		else if(tap==4)
	    		{
	    			total +=120;
	    		}
	    		else if(tap==5)
	    		{
	    			total +=30;
	    		}
	        	break;
	        }
	        case 4:
	        {
	        	System.out.print("Tap : ");
	    	    tap=sc.nextInt();
	        	if(tap==1)
	    		{
	    			total +=98;
	    		}
	    		else if(tap==2)
	    		{
	    			total +=48;
	    		}
	    		else if(tap==3)
	    		{
	    			total +=40;
	    		}
	    		else if(tap==4)
	    		{
	    			total +=80;
	    		}
	    		else if(tap==5)
	    		{
	    			total +=100;
	    		}
	        	break;
	        }
	        case 5:
	        {
	        	System.out.print("Tap : ");
	    	    tap=sc.nextInt();
	        	if(tap==1)
	    		{
	    			total +=50;
	    		}
	    		else if(tap==2)
	    		{
	    			total +=20;
	    		}
	    		else if(tap==3)
	    		{
	    			total +=150;
	    		}
	    		else if(tap==4)
	    		{
	    			total +=580;
	    		}
	    		else if(tap==5)
	    		{
	    			total +=100;
	    		}
	        	break;
	        }
	    }
		
	    
	    System.out.println();
	    
	    return total;
	    
	}
	
	public static void main(String[] arg)
	{
		double total=Calculate();
	
		
		Scanner sc=new Scanner(System.in);
		 for(int i=1;i>0;i++)
		 {
			 System.out.println("IF You Buy AnyThik press Yes..1/No..2..........");
				int press=sc.nextInt();
				
				if(press==1)
				{
					total= Calculate();
				}
				else if(press==2)
				{
					System.out.println("Bill : "+total);
					 System.out.println("THANK YOU FOR VISIT.......");
					 break;
				}
				else
				{
					System.err.println("Somting wrong......");
				}
		 }
		 
		
		
	}

}
