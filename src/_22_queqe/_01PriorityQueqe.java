package _22_queqe;

import java.util.PriorityQueue;
public class _01PriorityQueqe {
	public static void main(String[] arg)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		//for add
		pq.add(1);
		pq.offer(2);
		pq.add(5);
		pq.offer(6);
		pq.add(4);
		pq.offer(3);
		
		System.out.println(pq);
		
		//for remove by value
		pq.remove(5);
		System.out.println(pq);
		//for remove by head
		//pq.poll();
		System.out.println(pq.poll());
		
		 
				

	}
}
