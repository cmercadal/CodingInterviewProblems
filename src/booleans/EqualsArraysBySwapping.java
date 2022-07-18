package booleans;

import java.util.Arrays;

public class EqualsArraysBySwapping {
	
	/*Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
	 * Given two arrays a and b, check whether they are similar.
	 */
	
	
	//esta respuesta no es mia pero me pareció genial
	boolean solution(int[] a, int[] b) {
	    
		int sum = 0;
	    for (int i = 0; i < a.length; i++) {if (a[i] != b[i]) {sum++;}}
	    Arrays.sort(a);
	    Arrays.sort(b);
	    
	    return Arrays.equals(a, b) && sum < 3;}

}
