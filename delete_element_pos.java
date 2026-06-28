import java.util.Scanner;;
public class delete_element_pos {

    public void delete(char [] arr , int pos)
    {
        for (int i= pos-1 ; i<arr.length-1; i++)
        {
            arr[i] = arr[i+1];
        }

        arr[arr.length-1] = '\0';   //remeber this 
      

    }



}

class Demo{
    public static void main(String[] args) {
        delete_element_pos obj = new delete_element_pos();
        char[] arr = {'a','b','c','d','e'};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which position you want to enter");
        var pos = sc.nextInt();

        obj.delete(arr, pos);


        for(int i = 0 ; i<arr.length ; i++)
        {
            System.out.print(arr[i]);
        }
        
        sc.close();
    }
}