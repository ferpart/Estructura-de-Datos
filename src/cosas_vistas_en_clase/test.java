package cosas_vistas_en_clase;

public class test {

	public static void main(String[] args) {
		
		int lista[]={7,5,8,1,9,4,3,6,2,0};
		listar(lista);
		}
		public static void listar (int[] lista){

			for (int j=1; j<lista.length; j++ ){
				int key= lista[j];
				int i = j-1;
				//System.out.println(lista[i]);
				while(i>=0 && lista[i] > key ){
					lista[i+1] = lista [i];
					i-=1;
				}
				lista[i+1]= key;
				
			
			}
			for (int x=0; x<lista.length; x++ ){
				System.out.println(lista[x]);
			}
	}
}
