package imports;

public class DNode<E> {
	private E data;
	private DNode<E> prev;
	private DNode<E> next;
		
	public DNode (){                                                                                                    //Default Constructor
		this (null,null,null);
	}
		
	public DNode (E data, DNode<E> next, DNode<E> prev){
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
		
	public E getData(){                                                                                                 //Gets the data from the node
		return data;
	}
		
	public void setData(E data){                                                                                        //Asigns the value to the variable data
		this.data = data;
	}
		
	public DNode<E> getNext(){                                                                                          //Gets next node value
		return next;
	}
		
	public void setNext(DNode<E> node){                                                                                 //Sets next node value
		this.next = node;
	}
		
	public DNode<E> getPrev(){                                                                                          //Gets previous node value
		return prev;
	}
		
	public void setPrev(DNode<E> node){                                                                                 //Sets previous node value
		this.prev = node;
	}
}
