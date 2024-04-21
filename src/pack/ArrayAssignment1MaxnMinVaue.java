
/*
* Assignment 1: Write a Java program to find the maximum and minimum value of
* an array.
*/
package pack;

public class ArrayAssignment1MaxnMinVaue {
	
	public static void main(String[] args) {
		
	// TODO Auto-generated method stub

	 int array[] = {10,20,30,40,60};
	 int max =array[0];
	 int min= array[0];
	
	for (int i =1; i<array.length; i++)
	{
		if( max < array[i] )
		{
			max = array[i];
		}
	
	 }
	System.out.println("Max value of the Array is :" + max);
	
	for (int j =1;j < array.length; j++) {
		if(min >array[j]) {
	
		min =array[j];
		}
	}
	System.out.println("Min Value Of the Array is :" +min );
	
}
}