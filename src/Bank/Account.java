package Bank;

public class Account {

	public static void main(String[] args) {
		
			       SavingAc	ac=new SavingAc(1000,0.7);
			       ac.deposite(400);
			       ac.withdraw(250);
			       ac.addInterest();
			       System.out.println(ac.getbal());
			       System.out.println("Expected :1955.0");

				}
			


}

