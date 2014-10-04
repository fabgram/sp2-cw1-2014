import java.lang.System;
import java.util.Arrays;
import java.util.Scanner; 

public class Coursework1 {
	public static void main(String[] args) {

        //creates array 1 to hold up to 100 elements
        final int LENGTH = 100;
        int[] array1 = new int[LENGTH];
        int[] array2 = new int[LENGTH];
        Scanner input = new Scanner(System.in);
        

            for(int i = 0; i < array1.length; i++){
            	System.out.print("Please insert data for array 1 (0 to quit): ");
            	array1[i]  = input.nextInt();
            	if(array1[i] == 0){
            		break;	
            	}
            }
            
            for(int i = 0; i < array2.length; i++){
            	System.out.print("Please insert data for array 2 (0 to quit): ");
            	array2[i]  = input.nextInt();
            	if(array2[i] == 0){
            		break;	
            	}	
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
            
            //int[] common = new int[100];
            System.out.print("\nCommon data is: ");
            for(int i = 0; i < array1.length; i++){
            	for(int j = 0; j < array2.length; j++){
            		if(array1[i] == array2[j]){
            			 array1[i] = array1[i];
            			 if(array1[i] != 0){
                     		System.out.print(array1[i] + " ");
                     	}
            		}
            	}
            }	
            
		}  
                
	}


       
    

 
