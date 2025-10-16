package _16_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class ThreadPool implements Runnable
{
	String name;
	public ThreadPool(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
			Thread.sleep(2000);
			}
			catch( InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(name+i);
		}
	}
}

public class _05_ThreadPool {

	public static void main(String[] arg)
	{
		Runnable r1=new ThreadPool("task 1   ");
		Runnable r2=new ThreadPool("task 2   ");
		Runnable r3=new ThreadPool("task 3   ");
		Runnable r4=new ThreadPool("task 4   ");
		Runnable r5=new ThreadPool("task 5   ");
		Runnable r6=new ThreadPool("task 6   ");
		Runnable r7=new ThreadPool("task 7   ");
		Runnable r8=new ThreadPool("task 8   ");
		Runnable r9=new ThreadPool("task 9   ");
		Runnable r10=new ThreadPool("task 10   ");
		Runnable r11=new ThreadPool("task 11   ");
		Runnable r12=new ThreadPool("task 12   ");
		Runnable r13=new ThreadPool("task 13   ");
		Runnable r14=new ThreadPool("task 14   ");
		Runnable r15=new ThreadPool("task 15   ");
		Runnable r16=new ThreadPool("task 16   ");
		Runnable r17=new ThreadPool("task 17   ");
		Runnable r18=new ThreadPool("task 18   ");
		Runnable r19=new ThreadPool("task 19   ");
		Runnable r20=new ThreadPool("task 20   ");
		
		
		ExecutorService Pool = Executors.newFixedThreadPool(4);

		
		Pool.execute(r1);
		Pool.execute(r2);
		Pool.execute(r3);
		Pool.execute(r4);
		Pool.execute(r5);
		Pool.execute(r6);
		Pool.execute(r7);
		Pool.execute(r8);
		Pool.execute(r9);
		Pool.execute(r10);
		Pool.execute(r11);
		Pool.execute(r12);
		Pool.execute(r13);
		Pool.execute(r14);
		Pool.execute(r15);
		Pool.execute(r16);
		Pool.execute(r17);
		Pool.execute(r18);
		Pool.execute(r19);
		Pool.execute(r20);
		
		
		Pool.shutdown();
		
	}
}
