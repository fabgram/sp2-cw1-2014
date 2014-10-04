import java.lang.System;
import java.util.Arrays;
import java.util.Scanner; 

public class Coursework1 {
	public static void main(String[] args) {

        //creates array 1 to hold up to 100 elements
        final int LENGTH = 100;
        int[] array1 = new int[LENGTH];
        int[] array2 = new int[LENGTH];
        int sentinel = 0;
        int currentSize1 = 0;
        int currentSize2 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please insert data for array 1: ");
        while (input.hasNextInt()) {
            for(int i = 0; i < LENGTH; i++){
            array1[i] = input.nextInt();

            System.out.print("A porra eh essa: " + array1[i] + ",");
            }

            //System.out.print(" ");


        }
       
    }
}

