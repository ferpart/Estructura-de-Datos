package lab1;

public interface LinkedList<E> {

	public boolean isEmpty(); // Devuelve true si la lista est� vac�a, false de lo contrario.
	public int size(); //Devuelve la cantidad de elementos de la lista.
	public boolean contains(E �tem); //Devuelve true si el �tem se encuentra en la lista, falso en caso contrario.
	public E get (int index); //Devuelve el elemento en la posici�n �ndex de la lista si el �ndice es v�lido.
	public int indexOf(E item); //Devuelve el entero que representa la posici�n de �tem en la lista. Si no existe en la lista devuelve -1.
	public boolean add(int index, E item); //Agrega el �tem a la lista en la posici�n �ndex si �ste es v�lido.
	public E remove(int index); //Remueve el elemento que est� en la posici�n �ndex de la lista, si el �ndice es v�lido.
	public String toString(); //Devuelve el contenido de la lista en un String. Utiliza StringBuilder para construir el String.

	
}
