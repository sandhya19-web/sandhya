package pack;

public class ArrayExample {
	public static void main(String a[]) {
		int k = 20;
		int j;
		j = 80;
		int u = 90; 
		char c = 's';
		double d = 5.6;
		

		
		
		int z[] = {50, 60 ,70 ,80 ,90,80,90};  //z.lenght =  5
		
		int max = z[0];
		
		
		
		
		int sub[] = new int[z.length]; //7 
	
		int total= 0;
		
		for(int i = 0 ;i<=sub.length-1;i++)
		{
			sub[i] = z[i];
			System.out.println(sub[i]);
			total = total+sub[i];
			
		}
		System.out.println("Total values "+total);
		
/*
 * Assignment 1: Write a Java program to find the maximum and minimum value of
 * an array.
*/
		
		for (int p =1; p<sub.length; p++)
		{
			if( max < sub[p] ){
				max = sub[p];
			}
		
		 }
		System.out.println("Max value of the Array is :" + max);

		
/*
 * Assignment 2 : Java Program to Add Elements in an Array. Input: Array: [ 1 ,
 * 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ] Element: 50
*/

		 int[] array = new int[10];
		 
		 for (int q =0; q<array.length; q++) {
			 array[q] = q+1;
				/*
				 * System.out.println(array[q]);
				 */
		 }
		int newArray[] = new int[11];
		for (int r =0; r< array.length; r++) {
			newArray[r] = array[r];
			System.out.println(newArray[r]);
		
		}
		newArray[10] = 50;
		System.out.println(newArray);

		
		
		 
		 
		 
		 
		 
		 
/*
 * Assignment 3 : Java Array Program to Remove Duplicate Elements From an Array
 * Input: arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}			 * 
 * Output: arr[] = {1, 2, 3, 4, 5}
 * Explanation: All the elements in the array should be unique there should not
 * be any duplicate element in array.
*/
		
	
		

		
		
		
//		 i = 0    0<5
//	     i = 1    1<5
//	     i= 2     2<5
//	     i =3     3<5
//	     i = 4    4<5
//	     i=5      5<5
		
		
//		for(int i=0; i < z.length ; i++)
//		{
//		    	System.out.println(z[i]);  // 50  60  70  80   90
//		}
//		
		
		
		
		
		
		
		
	}

}
