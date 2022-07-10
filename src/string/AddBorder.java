package string;

public class AddBorder {
	
	/*Dado un arry de Strings, agregar un borde
	 * String[] n = saa,
	 * 			 sss,
	 * 			 ldd;
	 * 
	 * Quedaçia en:
	 * 
	 * ****
	 * *saa*
	 * *sss*
	 * *ldd*
	 * *****
	 */
	
	String[] solution(String[] picture) {
	    
	    String[] result = new String[picture.length + 2];
	    
	    String firstAndLastLine = "*".repeat((picture[0].length() + 2));
	    result[0] = firstAndLastLine;
	    result[result.length-1] =  firstAndLastLine;
	    
	    for (int i = 1; i<= picture.length; i++){
	        result[i] = "*" + picture[i-1] + "*";
	    }
	    
	    return result;
	}

}
