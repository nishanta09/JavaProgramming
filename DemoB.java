public class DemoB {
    public static void main(String[] args) {
        
    
        int [] arr = {2000,3000,2500,4000} ;

        System.out.println("Smallest element is " + largest(arr));


    }

    public static int largest(int [] arr)
    {   
        int max = arr[0];

        for(int j = 1 ; j<arr.length ; j++)
        {
            if(max<arr[j])
            {
                max = arr[j];
            }
        }

        return max ;

    }
}
