import java.util.Scanner;
class insert_element_pos_value
{
    public static void main(String[] args) {
        
        char arr[] = {'A','B','C','D','E'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position you want to enter: ");
        int pos = sc.nextInt();

        System.out.println("Enter the charater you want to enter:");
        char value = sc.next().charAt(0);
        
        insert( arr,pos , value );    
        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

        public static void insert(char [] arr , int pos , char value)
        {
            for(int i = arr.length-1 ; i>=pos-1; i--)
            {
                arr[i]=arr[i-1];
            }

            arr[pos-1]= value;
            
        }




}



