package ruletas;

import imports.HTable;
import imports.Joptions;

public class QuadraticHashProbing_ruleta {

	public static void main(String[] args) {
		int tablesize=gui();
		HTable hasht=new HTable();
		for (int i=1; i<=tablesize; i++){
			String a = guistr(i);
			int b = guiint(i);
			hasht.Write(a,b);
		}
		guialum(1,hasht);
		guialum(2,hasht);
		
	}	
	
	
	public static int gui(){
		Joptions<String> display = new Joptions<String>();
		return display.inputInt_JO("Dime el numero de alumnos que guardaras: ");
	}
	
	public static String guistr(int x){
		Joptions<String> display = new Joptions<String>();
		 return display.inputStr_JO("Dame el nombre del alumno #" + x);	
	}
	
	public static int guiint(int x){
		Joptions<String> display = new Joptions<String>();
		return display.inputInt_JO("Dame la matricula (sin A0) de el alumno #" + x);
	}
	
	public static void guialum(int x, HTable hasht){
		Joptions<String> display = new Joptions<String>();
		if (x==1){
			display.msg_JO("Los alumnos en el salon son:");
		}
		else if(x==2){
			display.msg_JO("Los alumnos en tu clase son\n"+ hasht.listafinal());
		}
	}
		
}
