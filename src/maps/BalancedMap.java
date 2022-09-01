package maps;

import java.util.HashMap;
import java.util.Map;

public class BalancedMap {
	
	//para chequear si un string tiene un número parejo de caracteres
	
	boolean solution(String inputString) {
	    
	    Map<String, Integer> mapa = new HashMap<String, Integer>();
	    char[] chars = inputString.toCharArray();
	   
	    for (char c: chars){
	        if (mapa.containsKey(String.valueOf(c))){
	            mapa.put(String.valueOf(c), mapa.get(String.valueOf(c))+1);
	        }
	        else {
	            mapa.put(String.valueOf(c), 1);
	        }
	    }
	    
	    for (int temp: mapa.values()){
	        if (temp%2 != 0) {return false;}
	    }
	    
	    return true;

	}

}
