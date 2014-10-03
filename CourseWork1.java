package coursework1;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Created by Fabricio Graminhani on 30/09/2014.
 */
public class CourseWork1 {
    public static void main(String[] args) {

        //creates array 1 to hold up to 100 elements
        final int LENGTH = 100;
        int[] array1 = new int[LENGTH];
        int[] array2 = new int[LENGTH];

        int currentSizeArr1 = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert data for array 1: ");
        while (input.hasNextInt()) {
            for (int i = 0; i < LENGTH; i++) {

                array1[i] = input.nextInt();

                System.out.print(array1[i]);
                //System.out.println("Array1 elements are: " + Arrays.toString(array1));
                //for (int j = 0; j < array1.length; j++) {
                //System.out.println(array1[j]);
                //}
            }
        }
    }
}

