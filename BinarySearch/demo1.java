package BinarySearch;
/*binary search either make the order in ascending or descending order then  apply the logic */

public class demo1 {
    public static void main(String[] args) {

      int [] arr = {-1,0,1,5,7,9,11,13};
      int k = 11;

      System.out.println(binarysearch(arr, k ));





            

    }

    public static String binarysearch(int[] arr , int k)
    {   
        int start = 0;
        int last = arr.length-1 ;


        while(start <=last)
        {
            int mid = (start+last)/2;

            if(arr[mid] == k)
            {
                return "Element found";
            }

            else if(arr[mid] < k)      //change the sign if array is like 12,11,5,3,2,1 in descending order 
            {
                start = mid+1;
            }

            else
            {
                last = mid-1;
            }

        }

    
        return "Element not found";
    }

    
}
