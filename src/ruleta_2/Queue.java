package ruleta_2;

public interface Queue<E> {
	
	public boolean isempty();
	public E Dequeue();
	public void Enqueue(E data);
	public int peek();

}
