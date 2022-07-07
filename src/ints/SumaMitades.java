package ints;

public class SumaMitades {
	
	//Dado un numero even, descubrir si la suma de la primera mitad es igual a la suma de la segunda mitad

	public static boolean solution(int n) {

		// c-'0' permite castear a char
	    int[] digits = Integer.toString(n).chars().map(c -> c-'0').toArray();
	    
	    int sum1= 0;
	    int sum2 = 0;
	    
	    for (int i=0; i< digits.length / 2; i++){
	        sum1 += digits[i];
	    }
	    
	    for (int j = digits.length-1; j>= digits.length / 2; j--){
	        sum2 += digits[j];
	    }
	    return sum1==sum2;
	}
	
	
	
	public static boolean solution2(int n) {

	    String s = n+"";
	    int sum = 0;
	    
	    for(int i=0; i<s.length()/2; i++)
	        sum+=(s.charAt(i)-s.charAt(s.length()-1-i));
	    
	    return sum==0;
	}
	
	
	
	public static boolean solution3(int n) {

	    String s = Integer.toString(n);
	    return s.substring(0, s.length()/2).chars().sum() == s.substring(s.length()/2).chars().sum();
	}
	

	
}
