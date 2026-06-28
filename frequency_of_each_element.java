import java.util.Scanner;


class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];

        int[] visit = new int[size];

        for(int i = 0 ; i<arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }
           
             
            for(int i = 0 ; i<arr.length ; i++)
                {   

                if(visit[i]==0)
                {
                        int count = 1;
                for(int j = i+1 ; j<arr.length ;j++)
                {

                        
                            if(arr[i] == arr[j])
                            {
                                visit[j]= 1;
                                count++;
                            }
                        
                    }
                    System.out.println(arr[i] + " " + count);
            }
        }


            



        
        input.close();


    }

    


}
