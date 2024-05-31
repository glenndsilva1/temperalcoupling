package test;

public class Email implements Medium<String>{
	private final MailInfo m;
	
	public Email(MailInfo mailinfo){
		this.m = mailinfo;
	}
	@Override
	public void send(String m) {
		System.out.println("Hey I am send mail to mail info " + this.m + " And Salary is " + m);
	}
}
