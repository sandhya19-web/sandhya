package pack;

public class AssignmentArrays {
	public static void main(String[] args) {
	
		int arr[] = { 1, 12,9, 29, 8,-6,52, 100 };
		
		
ArrayTest i= new ArrayTest();
		
		System.out.println("MAX Value : "+ i.max(arr));
		System.out.println("MIN Value : "+i.min(arr));

	}
	
	
	int max(int arr[]) {
		int max = arr[0];
		for (int a = 0; a < arr.length; a++) {
			if (arr[a] > max) {
				max = arr[a];
			}
		}
		return max;
	}

	int min(int arr[]) {
		int min = arr[0];
		for (int b = 0; b < arr.length; b++) {
			if (arr[b] < min) {
				min = arr[b];
			}
		}
		return min;
	}


		
	}
	

