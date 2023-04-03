package map.Example;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Deque {

	public static void main(String[] args) {
		
		ArrayDeque qu=new ArrayDeque<>();
		
		
		qu.addLast(1);
		qu.add(2);
		qu.add(3);
		qu.addFirst(4);
		qu.offer(10);
		qu.peek();
		qu.peekFirst();
		
		System.out.println(qu);
		Iterator itr=qu.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
