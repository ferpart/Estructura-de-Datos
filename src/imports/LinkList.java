package imports;

public interface LinkList<E> {
	
	public boolean isEmpty();                                                                                           //Devuelve true si la lista esta vacia, false de lo contrario.
	public int size();                                                                                                  //Devuelve la cantidad de elementos de la lista.
	public boolean contains(E item);                                                                                    //Devuelve true si el item se encuentra en la lista, falso en caso contrario.
	public E get (int index);                                                                                           //Devuelve el elemento en la posicion index de la lista si el indice es valido.
	public int indexOf(E item);                                                                                         //Devuelve el entero que representa la posicion de item en la lista. Si no existe en la lista devuelve -1.
	public void add(int index, E item);                                                                                 //Agrega el item a la lista en la posicion index si este es valido.
	public E remove(int index);                                                                                         //Remueve el elemento que esta en la posicion index de la lista, si el indice es valido.
	public String toString();                                                                                           //Devuelve el contenido de la lista en un String. Utiliza StringBuilder para construir el String
	
}

