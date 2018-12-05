package keywords;

public class SuperEX {

	public static void main(String[] args) {
    System.out.println("..........c1.................");
    Car c1=new Car();
    System.out.println("...........c2................");
    Car c2=new Car();
    System.out.println(".............c3..............");
    Car c3=new Car();

	}
}
class Vehical{
	static{
		System.out.println("static field initialization");
		System.out.println("inside company static block");
	}
	{
		System.out.println("instances field initialization");
		System.out.println("inside company instanecs block");
	}
	public Vehical(){
		System.out.println("inside company constructor");
	}
}
class Car extends Vehical{
	public Car(int i){
		super();
		System.out.println("inside Car constructor:");
	}
	public Car(){
		
	}
	static{
		System.out.println("static field initialization-car");
		System.out.println("inside car company static block");
	}
	{
		System.out.println("instances field initialization-car");
		System.out.println("inside car company instanecs block");
	}
	
}
class Bike extends Car{
 public Bike(){
	 super(10);
	 System.out.println("inside Bike constructor:");
 }
	static{
		System.out.println("static field initialization-Bike");
		System.out.println("inside Bike company static block");
	}
	{
		System.out.println("instances field initialization-Bike");
		System.out.println("inside Bike company instanecs block");
	}
}