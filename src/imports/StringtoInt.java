package imports;

public class StringtoInt {
	
	public int toInt(String string){
		int stringintfin=0;
		try{
			stringintfin=Integer.parseInt(string);
		} catch (NumberFormatException npe){
			char[] stringint = string.toCharArray();
			for(char ch:stringint ){	
				if ((int)ch>64 && (int)ch<91){
					stringintfin+=((int)ch+32); 
				}
				else{
					stringintfin+=(int)ch;
				}
			}
		}
		return stringintfin;
	}
	
	public int toInt(String string, int len){                                                                           //Donde len es el numero de caracteres que se sumaran
		int stringintfin=0;
		try{
			stringintfin=Integer.parseInt(string);
		} catch (NumberFormatException npe){
			char[] stringint = string.toCharArray();
			for(char ch:stringint ){
				if (len>0){
					if ((int)ch>64 && (int)ch<91){
						stringintfin+=((int)ch+32); 
					}
					else{
						stringintfin+=(int)ch;
					}
				}
				else {
					break;
				}
				len--;
			}
		}
		return stringintfin;
	}	
}