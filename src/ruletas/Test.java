package ruletas;

import imports.GQueue;
import imports.StackG;
//import imports.RadixSortQueue;
//import imports.SLinkedList;

public class Test {

	public static void main(String[] args) {
		GQueue<Integer> test = new GQueue<Integer>();
		
		test.enqueue(1);
		test.enqueue(2);
		test.enqueue(3);
		test.enqueue(4);
		test.enqueue(5);
		test.enqueue(6);
		test.enqueue(7);
		test.enqueue(8);
		
		//RadixSortQueue test1 = new RadixSortQueue(test);
		//tSest1.Listpass(test, 10, 1);
		System.out.println(reverseFirstK(4,test).toString());
		
		
	}
	
	public static GQueue<Integer> reverseFirstK(int k, GQueue<Integer> q){
		if (q.size()<k){
			throw new IllegalArgumentException();
		}
		StackG<Integer> temps = new StackG<Integer>();
		int queuesize= q.size()-k;
		while(k>0){
			k--;
			temps.push(q.dequeue());
			
		}
		
		
		while(temps.isEmpty()!=true){
			q.enqueue(temps.pop());
		}
		
		while(queuesize>0){
			queuesize--;
			q.enqueue(q.dequeue());
		}
		return q;
	}

}
