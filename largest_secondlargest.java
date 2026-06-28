


class largest_secondlargest
{
    public static void main(String[] args)
    {
        
        int array [] = {-1, -2, -3, -4, -5};  // if we have negative numbers in the array then we have to initialize max and max2 with Integer.MIN_VALUE.
        // int max = -1;
        // int max2 = -1;      
        int max = Integer.MIN_VALUE;  
        int max2 =Integer.MIN_VALUE;

        

        for(int i = 0 ; i<array.length; i++)   //find the maximum number.
        {
           if(array[i]>max)
           {
               max = array[i];
           
            }
         



        }
        for (int i = 0 ; i<array.length; i++)
        {
            if(array[i]>max2 && array[i]<max)    // focus on this 
            {
                max2 = array[i];
            }
        }


        System.out.println("The maximum number is : " + max );
        System.out.println("The second maximum number is : " + max2 );
        
       

     
    }
 
   

}
  

    
