package pack;

public class Array {
	
	public static void main(String[] args) {
        // 0,1,2,
int arr[] = {20,13,12,1,14,59};

int min = arr[0];//20
int max=arr[0];//20

for(int i=0; i<arr.length; i++) { 
	 
	 if(min > arr[i])//2>2,2>5,2>1
  {
     min = arr[i];
  }else if(max < arr[i]) {
 	 
 	 max=arr[i];
  }
}
System.out.println("The minimum element is" +  " " +min); 

System.out.println("The maximium element is" +  " " +max); 
}


}
