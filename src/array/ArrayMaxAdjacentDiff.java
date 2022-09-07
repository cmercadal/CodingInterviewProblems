package array;

public class ArrayMaxAdjacentDiff {
	
	//Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
	
	int solution(int[] inputArray) {
	    
	    int max = 0;
	    
	    for (int i = 1; i < inputArray.length; i++){
	        
	        int abs = Math.abs(inputArray[i]- inputArray[i-1]);
	        
	        max = Math.max(max, abs);
	    }
	    
	    return max;

	}

}
