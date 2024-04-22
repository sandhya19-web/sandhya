package pack;

public class ArrayAssigment1{
		public static void main(String a[]) {
			
			//Assignment No 1
			
            int b[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
            int sub[] = new int[b.length];
    
            int min = b[0];
            int max = b[0];
           
          
            for(int i=0; i<=sub.length-1; i++) {
            	sub[i] = b[i];
            
            	
            	if (sub[i]<min) {  //need if function to determine the max and mn=in value of the array
            		min = sub[i];
            	}
            	if (sub[i]>max);{
            		max = sub[i];
            		
            	}
            	
            }
			System.out.println(min);
			System.out.println(max);
		
	
			
			
			
		
    	   
            }
  
            	
            		
            	
            }
			
			
			
			
		
		
	
	



