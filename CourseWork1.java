import java.util.Arrays;
import java.util.Scanner;
/*
 * Software and Programming II
 * Fabricio Graminhani
 * username: fgrami01
 * date:05/10/2014
 */

public class Coursework1 {
	
	public static void main(String[] args) {
		
		final static int LENGTH = 100;//constant to array size, easy to change later if necessary 
		int[] array1 = new int[LENGTH];//creates and initializes array 1 to size previously stated
		int[] array2 = new int[LENGTH];//creates and initializes array 2 to size previously stated
		int flag1 = -1;//variable to be used as the user input
		int flag2 = -1;
		int noRepeat1 = 0;
		int noRepeat2 = 0;
		int counter = 0;//counter variable to be used in the number of common elements
		
		Scanner input = new Scanner(System.in);
		
		/*
		 ask user for values and store in array 1 and ignore if repeated numbers are
		 entered, user enters "zero" to stop. Jarek Bukowski worked with me on this part
		 of the code, specially on the part not to print the repeated numbers.
	    */
		do{
			System.out.print("Please insert data for array 1 (0 to quit): ");
			flag1 = input.nextInt();
			if(flag1 != 0){
				for(int i = 0; i <= flag1; i++){
					if(flag1 == array1[i]){
						i = noRepeat1;
					}else if(i == noRepeat1){
						array1[i] = flag1;
						noRepeat1++;
						i = noRepeat1 + 1;
						
					}
				}
			}
		}while(flag1 != 0 && noRepeat1 < 100);
		
		/*
		 ask user for values and store in array 2 and ignore if repeated numbers are
		 entered, user enters "zero" to stop. Jarek Bukowski worked with me on this part
		 of the code, especially on the part not to print the repeated numbers.
	    */
		do{
			System.out.print("Please insert data for array 2 (0 to quit): ");
			flag2 = input.nextInt();
			if(flag2 != 0){
				for(int i = 0; i <= flag2; i++){
					if(flag2 == array2[i]){
						i = noRepeat2;
					}else if(i == noRepeat2){
						array2[i] = flag2;
						noRepeat2++;
						i = noRepeat2 + 1;
						
					}
				}
			}
		}while(flag2 != 0 && noRepeat2 < 100);

		//prints values for array 1 
		System.out.print("\nValues for array 1 is: ");
		for(int i = 0; i < array1.length; i++){
			if(array1[i] != 0){
				System.out.print(array1[i] + " ");
			//if user's first input is "zero", this message will print for Array 2
			} else if (array1[0] == 0) {
				System.out.print("This array is empty.");
					break;
				}
		    }
		    
		//prints values for array 2
		System.out.print("\nValues for array 2 is: ");
		for(int i = 0; i < array2.length; i++){
			if(array2[i] != 0){
				System.out.print(array2[i] + " ");
			//if user's first input is "zero", this message will print for Array 2	
			} else if (array2[0] == 0) {
				System.out.print("This array is empty.");
				break;
			}
		}
		
		/*
		compares values from array 1 and array 2, if the values are the same
		it prints them. Also, a counter keeps track of the number of elements
		that are the same.
		*/
		if (array1[0] == 0 && array2[0] == 0) {
			System.out.print("\nBoth arrays are empty!");
		} else {
			System.out.print("\nCommon data is: ");
	        for(int i = 0; i < array1.length; i++){
	        	for(int j = 0; j < array2.length; j++){
	        	    if(array1[i] == array2[j]){			 
	        			if(array1[i] != 0){
		             	    System.out.print(array1[i] + " ");
		             	    counter++;
	    			    } 
	        		}
	        	}
	        }
		}
		
		//prevents the "common data" message from showing in case both arrays are empty.
		if (array1[1] != 0 && array2[1] != 0) {
	    //prints the number of common values which were stored in the variable "counter".
		System.out.print("\nNumber of common data: " + counter);
		}
		
		//closes input
		input.close();
	}
	
}

       
    

 
