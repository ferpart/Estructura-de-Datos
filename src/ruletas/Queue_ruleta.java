package ruletas;

import javax.swing.JOptionPane;
import imports.Queue;

public class Queue_ruleta {

	public static void main(String[] args) {
		Queue<String> queue_test= new Queue<String>() ;
		int tiempo = 0;
		anadir(queue_test, tiempo);
	}
	
	public static void anadir(Queue<String> fila, int y){
		
		String numero = JOptionPane.showInputDialog("Escribe el numero de objetos");
		int numero_int = Integer.parseInt(numero);
		
		for (int x=0; x<numero_int; x++){
			int num = x+1;
			String num_queue = JOptionPane.showInputDialog("Esctribe la letra # " + num);
			fila.enqueue(num_queue);
		}
		String resfinal="[";
		while(!fila.isEmpty()){
			/*System.out.println(fila.dequeue());;
			System.out.println();*/
			resfinal+= fila.dequeue();
			if (numero_int-1!=0){ 
				resfinal+=", ";
			}
			numero_int--;
		}
		resfinal+="]";
		JOptionPane.showMessageDialog(null, resfinal, "El resultado de la Queue es:", JOptionPane.INFORMATION_MESSAGE);
	}

}
