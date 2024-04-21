package pack;

public class MinimumAndMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,89,62,65,20,2};
		int min=arr[0];
		int max=arr[0];
		
		for (int i=0; i<arr.length; i++) {
			
			if(arr[i]<min) {
				min=arr[i];
						
		}
		
		if(arr[i]>max) {
			max=arr[i];
			
		}
		
	}

		System.out.println( "Minimum "  + min );
		System.out.println( "Maximum "  + max);
		
}
}

