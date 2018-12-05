package Exercises;

public class disp {

	private static disp d;

	public void display(int x){
		int y = 0;
		if(x>=10)
		{
			y=x;
			
		}
     System.out.println("value of y="+y);
	}
	
	public static void main(String[]args){
		disp.d =new disp();
		d.display(23);
		
		
	}

}
