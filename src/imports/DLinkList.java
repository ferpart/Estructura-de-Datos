package imports;
import java.util.NoSuchElementException;


public class DLinkList<E> implements LinkList<E> {
	private DNode<E> headNode;
	private DNode<E> tailNode;
	private int size;
	
	public DLinkList (){
		headNode=null;
		tailNode=null;
		size=0;
	}

	public boolean isEmpty() {
		return size==0;
	}

	public int size() {
		return size;
	}
	
	public E getFirst(){
		if(headNode != null){
			return headNode.getData();
		}
		else{
			throw new NoSuchElementException("La lista esta vacia");
		}
	}
	
	public E getLast(){
		if (tailNode!= null){
			return tailNode.getData();
		}
		else{
			throw new NoSuchElementException("La lista esta vacia");
		}
	}

	@Override
	public boolean contains(E item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(E item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(int index, E item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}
}

