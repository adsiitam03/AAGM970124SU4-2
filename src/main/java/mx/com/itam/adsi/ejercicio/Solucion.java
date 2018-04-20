package mx.com.itam.adsi.ejercicio; 
 
	import org.apache.log4j.Logger; 
	 
	

	/**
	  *Clase Solucion
	  *
	  *Determina si la cadena es la repetición de subcadenas
	  *@author Mónica E. Alba Glez. 160502
	*/ 
	public class Solucion{ 

	  
		Solucion(){
		}
			

	  public static void main(String...argv) { 
	    System.out.println(repetido("holaholahola"));

	  } 
	  
	  /**
	    *Verifica si la cadena entregada es se puede describir como repeticiones de subcadenas
	    *@param s cadena
	    *
	  */ 
	  public static boolean repetido(String s){
	    
	      boolean sigue = true;
		boolean encuentra = false;
		int longitud = s.length();
		int l = longitud/2;
		while(sigue){
			if(l <= 0){
				sigue = false;
			}else{
				String sub = achicaCadenaYRepite(s,l);
				if(sub.equals(s)){
					sigue = false;
					encuentra = true;
				}else{
					l--;
				}	
			}
		}
		return encuentra;	
			

	  } 

		public static String achicaCadenaYRepite(String s, int longitud){
			int veces = s.length()/longitud;			
			String sub = "";
			for(int i = 0; i < longitud; i++){
				sub+=s.charAt(i);
			}
			String resp = "";
			for(int j = 0; j < veces; j++){
				resp  += sub;
			}
			return resp;
		}
	}
