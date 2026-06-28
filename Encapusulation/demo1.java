package Encapusulation;

class Book{
    private int pageNumber;


    public void setPageNumber(int x)  //giving controlled access to data membesrs using setters.
    {   if(x>0)                        //encapsulation not like data hiding , it is giving controlled access to data members using member funcion
    {
        this.pageNumber= x;
    }
    }
    public int  getPageNumber()
    {
        return pageNumber;
    }
}







public class demo1 {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setPageNumber(4);

        System.out.println(b1.getPageNumber());

    }
}
