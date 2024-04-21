package pack;

import java.util.Arrays;

public class ArrayAssignement1 {
	
	//Assignment1 to find  maximum and minimum value of an array. 	
	private static int minNumber (int[] num, int min) {
		
		for (int i=0; i<num.length ; i++) {
			if(num[i]< min) {
				min = num[i];
			}
		}
		
		return min;
	}
	
	private static int maxNumber(int[] num, int max) {
		
		for (int i=0; i < num.length; i++) {
			
			if(num[i] > max) {
				max = num[i];
			}
		}
		return max;
	}
	
	 //Assignment2 Add Elements in an Array.
	private static int[] addElement(int[] arr, int n) {
		
		int element = 50;
		int newarr[]= new int [n+1];
		
		for(int i=0; i < n ; i++) {
			
			newarr[i] = arr[i];
		}
		
		newarr[n] = element;
		return newarr;
	}

	//Assignment3 Remove Duplicate Elements From an Array
	private static int removeDeplicate(int[] dupArr, int dup) {
		
		int[] temp = new int[dup];
		int j=0;
		
		for (int i=0; i < dup-1; i++) {
			
			if(dupArr[i] != dupArr[i+1]) {
				
				temp[j++] = dupArr[i];
			}
		}
			
			temp[j++] = dupArr[dup-1];
			
			
			for(int k=0; k< j; k++) {
				dupArr[k] = temp[k];
			}				
		return j;
	}

	
	public static void main (String a[]) {
		
		//Assignment1
		int num[] = {20,30,10,5,40,60,50};
		int min = num[0];
		int max = 0;

		min = minNumber(num, min);
		max = maxNumber(num, max);
		
		System.out.println("Maximum value in the array is:: "+min);
	    System.out.println("Minimum value in the array is:: "+max);
	    
	    //Assignment2 Add Elements in an Array.
	    int arr[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
	    int n =10;
	    
	    int[] addEle = addElement(arr,n);
	    System.out.println("Output after adding the new element:: "+Arrays.toString(addEle));
	    
	    //Assignment3 Remove Duplicate Elements From an Array
	    int dupArr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	    int dup = dupArr.length;
	    
	    dup = removeDeplicate(dupArr , dup);
	    System.out.print("Output after removing duplicate elements:: ");
	    for (int i = 0; i < dup; i++) 
	    	System.out.print(dupArr[i]+" ");
	}	
}
