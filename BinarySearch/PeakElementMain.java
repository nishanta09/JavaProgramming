    package BinarySearch;

    
    

    public class PeakElementMain {
        public static void main(String[] args) {
          

            int [] arr = {0,2,1,0};

           

            System.out.println(findPeakELement(arr));




        }   

        public static  int findPeakELement(int[] arr) {
               
      
    
        int length = arr.length-1;
        
        if(length==1)
        {
            return 0;
        }
        else if(arr[0]>arr[1])
        {
            return 0;
        }

        else if(arr[length]>arr[length-1])
        {return length;
        }

        else{

            int start = 1;
            int end = length-1;

            while(start<=end)
            {
                int mid = start + (end-start)/2;

                if(arr[mid]>arr[mid+1]  && arr[mid]>arr[mid-1])
                {
                        return mid;
                }

                else if(arr[mid]>arr[mid-1])
                {
                    start=mid+1;
                }
                else if(arr[mid]>arr[mid+1])
                {
                    end = mid-1;
                }
            }




        }

        return -1;
    }
}


    
    