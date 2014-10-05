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
		
		final int LENGTH = 100;//constant to array size, easy to change later if necessary 
        int[] array1 = new int[LENGTH];//creates and initializes array 1 to size previously stated
        int[] array2 = new int[LENGTH];//creates and initializes array 2 to size previously stated
        int flag = -1;//variable to be used as the user input
        int counter = 0;//counter variable to be used in the number of common elements
        Scanner input = new Scanner(System.in);

        //ask user for values and store in array 1, "zero" to exit loop
        for(int i = 0; i < array1.length; i++){
        	System.out.print("Please insert data for array 1 (0 to quit): ");
    		flag = input.nextInt();
        	if(flag == 0){
        		break;	
        	}
        	array1[i] = flag;
        }
         
        //ask user for values and store in array 2, "zero" to exit loop
        for(int i = 0; i < array2.length; i++){
        	System.out.print("Please insert data for array 2 (0 to quit): ");
    		flag  = input.nextInt();;
        	if(flag == 0){
        		break;	
        	}
        	array2[i] = flag;
        }
        
        //prints values for array 1 
        System.out.print("\nValues for array 1 is: ");
        for(int i = 0; i < array1.length; i++){
        	if(array1[i] != 0){
        		System.out.print(array1[i] + " ");
        	}
        }
        
      //prints values for array 2
        System.out.print("\nValues for array 2 is: ");
        for(int i = 0; i < array2.length; i++){
        	if(array2[i] != 0){
        		System.out.print(array2[i] + " ");
        	}
        }
        /*
        compares values from array 1 and array 2, if the values are the same
        it prints them. Also, a counter keeps track of the number of elements
        that are the same.
        */
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
        
        //prints the number of common values which were stored in the variable "counter"
        System.out.print("\nNumber of common data: " + counter);
        
        //closes input
        input.close();
	}
	
}

       
    

 
