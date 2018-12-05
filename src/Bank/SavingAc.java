package Bank;

public class SavingAc {
    private double bal;
	private double Int;
	     
	public SavingAc(){
		bal=0;
		Int=0;
		
	    }
	public SavingAc(double initialbal,double initialInt){
	bal=initialbal;
	Int=initialInt;

	}
	public void deposite(double a){
		bal=bal+a;
	}
	public void withdraw(double a){
		bal=bal-a;
	}
	public void addInterest(){
		bal=bal+bal*Int;
	}
	public double getbal(){
		return bal;
	}
}


