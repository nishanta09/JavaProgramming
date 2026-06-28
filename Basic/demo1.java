package Basic;
		/*

		Before we continue, let’s briefly define the terms pass-by-reference and pass-by-value:
		Pass-by-reference: When a method is called, the method arguments reference 
		the same variable in memory as the caller.

		Pass-by-value: When a method is called, the caller passes a copy of the argument variables 
		to the method resulting in two values in memory.
		
		Key Rule to Remember
		Java passes copies of references, not references themselves.
		
		*/
    class Balloon{
        	private String color;

	public Balloon() {}
	
	public Balloon(String c) {
		this.color = c;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}




public class demo1 {
    public static void main(String[] args)
    {   
        
        Balloon red = new Balloon("Red"); // memory reference = 50
		Balloon blue = new Balloon("Blue"); // memory reference = 100
        System.out.println(red);
        System.out.println(blue);
		
		swap(red, blue);
		 System.out.println("After the swap method executes:");
		 System.out.println("`red` color value = " + red.getColor());   
		 System.out.println("`blue` color value = " + blue.getColor());
		
		changeValue(blue);
		 System.out.println("After the changeValue method executes:");
		 System.out.println("`blue` color value = " + blue.getColor());
       
    }

    // Generic swap method
	public static void swap(Object o1, Object o2){  //copies of references 
		Object temp = o1;
		o1 = o2;
		o2 = temp;
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(((Balloon) o1).getColor());
        
	}

	private static void changeValue(Balloon balloon) { // balloon = 100
		balloon.setColor("Red"); // balloon = 100
		balloon = new Balloon("Green"); // balloon = 200
		balloon.setColor("Blue"); // balloon = 200
	}
}