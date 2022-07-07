package array;

import java.util.stream.Stream;

public class LongerStrings {
	
	//Dado un array de strings, devuelve otro solo con las palabras mas largas
	
	String[] solution(String[] inputArray) {
		
		int max = 0;
		
		for (String s: inputArray){
	        max = Math.max(max, s.length());
	    }
		
		int longestLength = max;
		
		return Stream.of(inputArray)
				.filter(s -> s.length() == longestLength)
				.toArray(String[]::new);
		
	}
	
	

}
