package pack;

public class Arrayminmax {
	public static void main(String a[])
	{
		int arr[]= {2,3,4,5,6,7,9};
		
		   int min=arr[0];
		   int max=arr[0];
		   
		   for(int i=0;i<arr.length;i++)
		   {
			   if(arr[i]<min) {
				   min=arr[i];
				   System.out.println("minimum number "+min);
				   
				   
			 }
			  if(arr[i]>max) {
				  max=arr[i];
				  System.out.println("maximum number "+max);
			  }
				  
			  }
		   }
	}

