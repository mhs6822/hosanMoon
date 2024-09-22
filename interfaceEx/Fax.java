package interfaceEx;

public interface Fax {

	public static final String FAX_NUMBER = "02-1234-5678";
	public abstract void send(String tel);
	public abstract void receive(String tel);
	
}