package graphtest;

public class Arista {
	private Vertice destino;
	private double costo;
	
	public Vertice destino(){
		return this.destino;
	}
	
	public double costo(){
		return this.costo;
	}
	
	public Arista(Vertice destino,double costo){
		this.destino=destino;
		this.costo=costo;
	}
}
