package BinarySearch;

public class DemoA {
    public static void main(String[] args) {
        
    
        String [] str = {"Apple" , "Boy","Cat", "Dog","ELe"};
       
        String k =  "ELe";

            
        System.out.println(binarySearch(str, k));
       
    } 
    public static String binarySearch(String [] arr , String k)
    {
            int start = 0;
            int last = arr.length-1;

            while(start<=last)
            {
                int mid = (start+last)/2;

                

                if(arr[mid].compareTo(k) == 0)
                {   
                    return "Element found";
                }

                else if((k.compareTo(arr[mid])) > 0 )
                {
                        start  = mid + 1;
                }
                else
                {
                    last = mid - 1;
                }

            }


            return "not found";
    }
   
}