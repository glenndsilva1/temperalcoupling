package test;

public class Salary implements Payment {
	 public final int amount;
	 public final Medium<String> medium;
	 
	public Salary(int amount){
	  this(amount, new Email(new MailInfo("glenndsilva@gmail.com","ccavenue.info","Test","Test")));
	}
	
	public Salary(int amount, Medium<String> medium){
		this.amount = amount;
		this.medium = medium;
	}

	@Override
	public void sendto() {
		this.medium.send(this.amount+"");
	}
	
	public static void main(String args[]) {
		Payment pymt = new Salary(10);
		pymt.sendto();
	}
}
