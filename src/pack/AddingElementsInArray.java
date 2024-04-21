
/*
 * Assignment 2 : Java Program to Add Elements in an Array. Input: Array: [ 1 ,
 * 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ] Element: 50
*/
package pack;
import java.util.Arrays;


public class AddingElementsInArray {
	public static void main(String[] args) {
		int[] array = new int[10];
		
		for (int i=0;i<array.length;i++) {
			array[i]=i+1;
		}
		System.out.println("Exsisting Array is :"+ Arrays.toString(array));
		
		  int[] newArray = new int[11];
		 
		 for (int j=0;j<newArray.length;j++) {
			 if (j!=newArray.length-1) {
		       newArray[j]= array[j];
		       } 
		 newArray[10]=50; 
		 }
		 System.out.println("The New Array is:" + Arrays.toString(newArray));
		
}
}

