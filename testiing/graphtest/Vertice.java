package graphtest;

import java.util.LinkedList;
import java.util.List;

public class Vertice {
	String nombre;
	List<Arista> adyacentes;
	short marcado;	// 0 (no visitado),1 (ya est� en el Queue) � 2 (ya est� en mi recorrido)
	double distancia;
	Vertice anterior;
	
	public Vertice(){
		
	}
	
	public Vertice(String nombre){
		this.adyacentes=new LinkedList();
		this.nombre=nombre;
	}
	
	public void reinicia(){
		this.marcado=0;
		this.anterior=null;
		this.distancia=Double.MAX_VALUE;
	}
}
