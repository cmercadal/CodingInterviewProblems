package array;

public class AscendingArray {
	
	//You are given an array of integers. 
	//On each move you are allowed to increase exactly one of its element by one. 
	//Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
	
	public static int solution(int[] inputArray) {

	    int sum = 0;
	    for (int i=1; i< inputArray.length; i++){
	        if ((inputArray[i]-inputArray[i-1]) <1){
	            sum += 1 + Math.abs(inputArray[i]-inputArray[i-1]);
	            inputArray[i] += 1 + Math.abs(inputArray[i]-inputArray[i-1]);       
	        }
	    }
	    
	    return sum;
	}

}
