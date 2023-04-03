package map.Example;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue<>();
		
		
		pq.offer(11);
		pq.add(0);
		pq.add(5);
		pq.add(2);
//		pq.add();
//		pq.add();
		pq.add(-1);
		pq.poll();
		pq.poll();					
		System.out.println(pq);
		
	}

}
