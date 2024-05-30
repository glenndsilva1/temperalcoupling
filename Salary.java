package temperoralcoupling.test;

public class DispathSalary implements Payment {
	 public final int amount;
	 public final Medium<MailInfo> medium;
	
	public DispathSalary(int amount){
	  this(amount, new Email());
	}
	
	public DispathSalary(int amount, Medium<MailInfo> medium){
		this.amount = amount;
		this.medium = medium;
	}

	@Override
	public void payto() {
		this.medium.send(new MailInfo());	
	}
	
	public static void main(String args[]) {
		Payment pymt = new DispathSalary(10);
		pymt.payto();
	}
}
