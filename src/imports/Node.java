package imports;

public class Node<E> {
	private E data;
	//private Node<E> prev;
	private Node<E> next;
	
	public Node (){                                                                                                    //Default Constructor
		this (null,null/*,null*/);
	}
	
	public Node (E data, Node<E> next/*, Node<E> prev*/){
		this.data=data;
		this.next=next;
		//this.prev=prev;
	}
	
	public E getData(){                                                                                                 //Gets the data from the node
		return data;
	}
	
	public void setData(E data){                                                                                        //Asigns the value to the variable data
		this.data = data;
	}
	
	public Node<E> getNext(){                                                                                          //Gets next node value
		return next;
	}
	
	public void setNext(Node<E> node){                                                                                 //Sets next node value
		this.next = node;
	}
	
	/*public Node<E> getPrev(){                                                                                          //Gets previous node value
		return prev;
	}
	
	public void setPrev(Node<E> node){                                                                                 //Sets previous node value
		this.prev = node;
	}*/
	
}
