
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // print the array elements using while loop
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)Math.floor(Math.random()*50);
        }
        System.out.println("The original array");
        printArray(arr);
        System.out.println();
        System.out.println("Reverse Array");
        printReverseArray(arr);

    }
    // print array using while loop
    public static void printArray(int[] arr){
          int N = arr.length;
        int i = 0;
        while(i < N){
            System.out.print(arr[i] + " ");
            i++;
        }
       
    }

    // print array in reverse order
    public static void printReverseArray(int[] arr){
        int i = arr.length-1;
        while(i >= 0){
            System.out.print(arr[i] + " ");
            i--;
        }
    }
}
