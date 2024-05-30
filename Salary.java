package temperoralcoupling.test;

public class Salary implements Payment {
	 public final int amount;
	 public final Medium<MailInfo> medium;
	
	public Salary(int amount){
	  this(amount, new Email());
	}
	
	public Salary(int amount, Medium<MailInfo> medium){
		this.amount = amount;
		this.medium = medium;
	}

	@Override
	public void payto() {
		this.medium.send(new MailInfo());	
	}
	
	public static void main(String args[]) {
		Payment pymt = new Salary(10);
		pymt.payto();
	}
}
