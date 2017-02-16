package ruletas;

import imports.LinkedList;
import imports.JOtransform;
import javax.swing.JOptionPane;

public class LinkedList_ruleta {

	public static void main(String[] args) {
		LinkedList<Integer> linked_list=new LinkedList<Integer>();
		int num_elementos=0;
		int num_paso=0;
		anadir(linked_list, elementos(num_elementos, num_paso));
	}
	
	public static void anadir(LinkedList<Integer> linked_list, int numElementos){
		
		
		if (!linked_list.isEmpty()){
			linked_list.addFirst(elementos(1, 0));
		}
		for (int x=0; x<numElementos; x++){
			int paso=x+1;
			linked_list.add(x, elementos(2,paso));
		}
		
		//JOptionPane.showMessageDialog(null, "El elemento #"+ numElementos + " de la lista es:\n" + linked_list.get(elementos(3, numElementos)) );
		resp_final(linked_list, numElementos);
		
			
	}
	
	public static int elementos(int x, int y){
		JOtransform<String> read_input= new JOtransform<String>();
		if (x==0){
			return read_input.input_JO("Numero de elementos para lista ligada");
		}
		else if (x==1){
			return read_input.input_JO("Dame el elemento #1");
		}
		
		else if (x==2){
			return read_input.input_JO("Dame el elemento #"+ y);
		}
		else if (x==3){
			return read_input.input_JO("Dime el elemento a mostrar desde 1 a "+ y );
		}
		
		else {
			return 0;
		}
		
	}
	
	public static void resp_final(LinkedList<Integer> linked_list, int numElementos){
		JOptionPane.showMessageDialog(null, "El elemento #"+ numElementos + " de la lista es:\n" + linked_list.get((elementos(3, numElementos))-1) );
	}

}
