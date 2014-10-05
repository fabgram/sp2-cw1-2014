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

        final int LENGTH = 100;
        //creates arrays 1 and 2 to hold up to 100 elements
        int[] array1 = new int[LENGTH];
        int[] array2 = new int[LENGTH];
        int flag = -1;
        int counter = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < array1.length; i++){
        	System.out.print("Please insert data for array 1 (0 to quit): ");
    		flag = input.nextInt();
        	if(flag == 0){
        		break;	
        	}
        	array1[i] = flag;
        }
          
        for(int i = 0; i < array2.length; i++){
        	System.out.print("Please insert data for array 2 (0 to quit): ");
    		flag  = input.nextInt();;
        	if(flag == 0){
        		break;	
        	}
        	array2[i] = flag;
        }
        
        System.out.print("\nValues for array 1 is: ");
        for(int i = 0; i < array1.length; i++){
        	if(array1[i] != 0){
        		System.out.print(array1[i] + " ");
        	}
        }
        
        System.out.print("\nValues for array 2 is: ");
        for(int i = 0; i < array2.length; i++){
        	if(array2[i] != 0){
        		System.out.print(array2[i] + " ");
        	}
        }

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
        System.out.print("\nNumber of common data: " + counter);
        input.close();
	}
	
}

       
    

 
