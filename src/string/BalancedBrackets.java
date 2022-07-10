package string;

import java.util.Deque;
import java.util.LinkedList;

/*
 * A string containing bracket characters is said to be balanced if:
 * A matching opening bracket occurs to the left of each corresponding closing bracket
 * Brackets enclosed within balanced brackets are also balanced
 * It does not contain any non-bracket characters
 * Null is considered to be unbalanced, while the empty string is considered to be balanced.
 * 
 * (esta solución la tomé de Baeldung, es un típico problema de entrevista
 */

public class BalancedBrackets {

	public boolean solution1(String str) {
		
		//primero chequear si es null or uneven
		if (null == str || ((str.length() % 2) != 0)) {
		    return false;
		 // después chequear si tiene algun otro caracter distinto del paréntesis
		} else {
		    char[] ch = str.toCharArray();
		    for (char c : ch) {
		        if (!(c == '(' || c == ')')) {
		            return false;
		        }
		    }
		}
		
		//así se van eliminando los pares
		while (str.contains("()")) {
		    str = str.replaceAll("\\(\\)", "");
		}
		
		return (str.length() == 0);
		

	}
	
	//Esta solucion usa Deque
	public boolean solution2(String str) {
		
		Deque<Character> deque = new LinkedList<>();
		
		for (char ch: str.toCharArray()) {
			//agregamos opening bracket al deque
		    if  (ch == '(') {
		        deque.addFirst(ch);
		    
		    //si no es de opening debería ser de cierre:
		    } else {
		    	//chequeamos que deque no esté vacío
		        if (!deque.isEmpty()
		        	//y que en la pila tenemos uno que hace par con nuestro char
		            && (deque.peekFirst() == '(' && ch == ')')) {
		        	//entonces removemos el '(' (nuestro ch temporal no es necesario agregarlo ni removerlo,
		        	// el loop simplemente seguirá su camino.
		            deque.removeFirst();
		        } else {
		            return false;
		        }
		    }
		}
		return deque.isEmpty();
	}
}
