package temperoralcoupling.test;

public class Email implements Medium<MailInfo>{
	@Override
	public void send(MailInfo m) {
		System.out.println("Hey I am send mail to mail info");
		
	}
}
