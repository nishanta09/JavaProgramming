import java.util.Arrays;
import java.util.Scanner;


public class ArrayRotation {

       public static void reverse(int[] arr  , int start , int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int [] arr = new int[size];

        for(int i = 0 ; i< arr.length ; i++)  //taking array input
        {
            arr[i] = input.nextInt();
        }

        int k = input.nextInt();   //input from the user no . of rotations

       
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length-1);
       

        System.out.println(Arrays.toString(arr));
        
    

            input.close();

    }

 
}
