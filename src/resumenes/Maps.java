package resumenes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maps {
	
	/* Doesn't allow duplicate keys
	 * Uses hashing to store or add objects (faster access to elements)
	 * No specific order
	 * 
	 * TreeMap: ordena de menor a mayor (si los valores son enteros, por ejemplo)
	 * 
	 * LinkedHashMap: Inserta en el Map los elementos en el orden en el que se van insertando
	 * Búsqueda es mas lenta
	 */

	public void metodosMap(HashMap<String, Integer> mapa) {
		
		Map<Integer, String> mapa2 = new HashMap<Integer, String>();
		
		mapa.size();
		
		mapa.isEmpty(); //devuelve True si está vacío
		
		mapa.put("clave", 5); //con Sets se usa .add()
		
		mapa.get("clave"); //retorna valor
		
		mapa.containsKey("clave"); // Devuelve true si "clave" es ua key en el mapa
		
		mapa.containsValue(5); //Devuelve true si hay un valor que coincide
		
		mapa.values(); //devuelve Collection de valores
		mapa.keySet(); //devuelve set con keys
		
		mapa.clear(); // Borra todos los componentes del Map
		
		mapa.remove("clave"); // Borra el par clave/valor de la clave que se le pasa como parámetro
		
		
		//para recorrer: entrySet devuelve un par clave valor a la vez
		for (Map.Entry<String, Integer> parKeyValueTemporal: mapa.entrySet()) {
		    System.out.println("key: " + parKeyValueTemporal.getKey() + " value: " + parKeyValueTemporal.getValue());
		}

		//iterador
		Iterator it = mapa.keySet().iterator();
		
		while(it.hasNext()){
		  String key = (String) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + mapa.get(key));
		}
		
		
	}
	
}
