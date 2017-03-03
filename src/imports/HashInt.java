package imports;

public interface HashInt<E> {
	
	public int search(E table, int key);
	public void search(E table, int key, int value);
	public void remove (E table, int key);
	public boolean isEmpty();
	
}
