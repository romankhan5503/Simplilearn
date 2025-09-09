package collection;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();

		queue.add("Amrica");
		queue.add("Germany");
		queue.add("India");
		
		System.out.println("Original Queue: " + queue);
		
		queue.remove();
		System.out.println("queue after removing the head element: " + queue);
		
		String head = queue.peek();
		System.out.println("Head of the queue: " + head);
		
		head = queue.poll();
		System.out.println("removee head: " + head);
		
		System.out.println("queue now looks like this: " + queue);
	}

}
