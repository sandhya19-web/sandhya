package pack;

public class InsertAnElement {

	public static void main(String[] args) {
		int sub[] = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 };
		int element = 50;
		int newArray[]= new int[sub.length + 1];
		
		for (int i=0; i<sub.length; i++) {
			newArray[i] = sub[i];
		}
           newArray[newArray.length - 1] = element;
        
        // Print the new array
        System.out.println("Array after adding element:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
			
		
		
		
		System.out.println();
		
	}
}