package temperoralcoupling.test;


public class Salary implements Payment {
	 public final int amount;
	 public final Medium medium;
	 
	public Salary(int amount){
	  this(amount, new Email(new MailInfo()));
	}
	
	public Salary(int amount, Medium medium){
		this.amount = amount;
		this.medium = medium;
	}

	@Override
	public void payto() {
		this.medium.send();
	}
	
	public static void main(String args[]) {
		Payment pymt = new Salary(10);
		pymt.payto();
	}
}
