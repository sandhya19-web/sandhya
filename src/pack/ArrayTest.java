package pack;


public class ArrayTest{	

	public static void main(String[] args) {
		int arr[] = { 1, 5, 9, 23, 21, -9, 52, 143 };
		
		ArrayTest at = new ArrayTest();
		
		System.out.println("MAX Value : "+ at.max(arr));
		System.out.println("MIN Value : "+at.min(arr));

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