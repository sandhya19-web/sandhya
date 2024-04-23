package pack;

public class ArrayAssigment3 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		
		//using HashSet to convert array to remove duplicate element 
		HashSet<Integer> set = new HashSet<>();

		
		//Using for loop to add element in the HashSey
		for (int i=0; i<arr.length; i++) {
			set.add(arr[i]);
			
		}
		//creating new array for the unique element
		int uniquearray[] = new int[set.size()];
		
		//copying unique element to new array
		int index = 0;
	    for (int element : set) {
	        uniqueArray[index++] = element;
	    }
	    
	    for (int i = 0; i < uniqueArray.length; i++) {
	        System.out.print(uniqueArray[i] + " ");
	    }
	        	
	        }

	
    }


