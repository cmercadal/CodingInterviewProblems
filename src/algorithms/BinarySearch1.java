package algorithms;

public class BinarySearch1 {
	
	//Basics of binary search
	
	//Find the index of an element in an array with binary search. If not present, return -1
	public int findIndexWithBiarySearch(int num, int[] array) {

		int start = 0;
		int end = array.length;
		int middle = (int) Math.floor((start+ end)/2);
		
		while(array[middle] != num && start <= end) {
			
			if (num < array[middle]) {
				end = middle -1;
			}
			else {
				start = middle;
			}
			
			middle = (int) Math.floor((start+ end)/2);
			
		}
		
		// If we've exited the loop it means we've either found the value or the array can't be devided further
	    return array[middle] == num ? middle : -1;
		
	    /*
	     * Y un repaso de ternary operator:
	     *  array[middle] == num SI ES VERDAD RETORNA (?)  middle SI NO RETORNA (:) -1;
	     */
		
	}

}
