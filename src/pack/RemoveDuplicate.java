package pack;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,2,3,4,4,4,5};
		int sub[] = new int[arr.length];
		int k=0;
		int i,j, a;
		boolean dup;
		for( i=0; i<arr.length; i++) {
			dup = false;
			for(j=i+1; j<arr.length; j++) {
						if (arr[i] == arr[j]) {
						dup = true;
						j=arr.length;
											}
			}
		if (dup == false) {
			sub[k]=arr[i];
			
			k++;
		}

			}
		System.out.println("New array is: ");
		for(a=0; a<k; a++) {
		System.out.print(sub[a] + " "); 
		}
	}
}
