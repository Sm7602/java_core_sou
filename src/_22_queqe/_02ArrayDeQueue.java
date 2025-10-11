package _22_queqe;

import java.util.ArrayDeque;
import java.util.Deque;

public class _02ArrayDeQueue {
	public static void main(String[] arg)
	{
		Deque<Integer> dq=new ArrayDeque<Integer>();
		
		//for add value
		dq.add(256);
		System.out.println(dq);
		dq.offer(55);
		System.out.println(dq);
		dq.offerFirst(2555);
		System.out.println(dq);
		dq.offerLast(20);
		System.out.println(dq);
		dq.push(52648315);
		System.out.println(dq);
		
		//for remove
		dq.remove(256);
		System.out.println(dq);
		dq.pop();
		System.out.println(dq);
		
		//for remove first 
		dq.poll();
		System.out.println(dq);
		
		//for get value
		System.out.println(dq.peek());
		
		//for fist value
		System.out.println(dq.peekFirst());
		
		//for last value
		System.out.println(dq.peekLast());
		
	}

}
