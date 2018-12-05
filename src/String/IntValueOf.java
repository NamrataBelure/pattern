package String;

public class IntValueOf {
		   public static void main(String args[]){
		       String str="-2427";
		       int num1 = 110;
		       //num2 would be having a negative value
		       int num2 = Integer.valueOf(str);
		       int sum=num1+num2;
		       System.out.println("Result is: "+sum);
		   }
		}