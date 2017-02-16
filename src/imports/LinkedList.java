package imports;

import java.util.NoSuchElementException;

public class LinkedList<E> implements LinkList<E> {
	
	private Node<E> firstNode;
	private int size;
	
	public LinkedList (){
		firstNode=null;
		size=0;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int size(){
		return size;
	}
	
	public E getFirst(){
		if(firstNode != null){
			return firstNode.getData();
		}
		else{
			throw new NoSuchElementException ("La lista se encuentra vacia");
		}
	}
	
	public void addFirst(E data){
		this.firstNode=new Node<E>(data,this.firstNode);
		this.size++;
	}
	
	public boolean add(int index, E data){
		if(index<0||index>this.size){
			throw new IndexOutOfBoundsException("Indice no valido");
			//return false;
		}
		if(index==0){
			addFirst(data);
			return true;
		}
		else{
			Node<E> ant;
			int aux=0;
			ant=this.firstNode;
			while(aux<index-1){
				ant=ant.getNext();
				aux++;
			}
			Node<E> nuevo=new Node<E>();
			ant.setNext(nuevo);
			size++;
			return true;
		}
	}
	
	public E remove(int index) {
		if(index<0||index>this.size|| index==0){
			throw new IndexOutOfBoundsException("Indice no valido");
		}
		else{
		
		return null;
		}
	}
	
	public boolean contains(E item){
			int a=this.indexOf(item);
			return a !=-1;
	}
	
	public int indexOf(E item){
		if(size!=0){
			Node<E> n;
			int aux=0;
			n=this.firstNode;
			while(aux<=size){
				if(item.equals(n.getData())){
					return aux;
				}
				n=n.getNext();
				aux++;
			}
		}
		return -1;
	}
	
	public E get (int index){
		if(index<0||index>=this.size){
			throw new IndexOutOfBoundsException("Indice no valido");
		}
		Node<E> n;
		int aux=0;
		n=this.firstNode;
		while(aux<index){
			n=n.getNext();
			aux++;
		}
		return n.getData();
	}
	
	public String toString(){
		if(size==0){
			return "";
		}
		else{
			StringBuilder sb = new StringBuilder();
			Node<E> actual = this.firstNode;
			for(int i=0; i<this.size; i++){
				sb.append("["+actual.getData()+"] ");
				actual=actual.getNext();
			}
			return sb.toString();
		}
	}
	
}

