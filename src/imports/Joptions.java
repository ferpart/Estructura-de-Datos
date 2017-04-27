package imports;

import javax.swing.JOptionPane;

public class Joptions<E> implements Jopt<E> {
	
	/*private String read="";
	private int disp=0;*/
	
	public String inputStr_JO(String data){
		return JOptionPane.showInputDialog(null, data);
	}
	
	public int inputInt_JO(String data){
		return Integer.parseInt(JOptionPane.showInputDialog(null, data));
	}
	
	public void msg_JO(String message){
		JOptionPane.showMessageDialog(null, message);
	}
	
}
