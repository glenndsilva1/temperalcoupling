package temperoralcoupling.test;

public class Email implements Medium {
	private final MailInfo m;
	
	public Email(MailInfo mailinfo){
		this.m = mailinfo;
	}
	
	@Override
	public void send() {
		System.out.println("Hey I am send mail to mail info " + m);
	}
}
