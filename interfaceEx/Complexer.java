package interfaceEx;

public class Complexer implements Printer, Scanner, Fax {

	@Override
	public void send(String tel) {
		System.out.println("Sending... fax message from " + FAX_NUMBER + " to " + tel );
	}

	@Override
	public void receive(String tel) {
		System.out.println("Receiving... fax message from " + tel + " to " + FAX_NUMBER);
	}

	@Override
	public void scan() {
		System.out.println("Scanning....");
	}

	@Override
	public void print() {
		System.out.println("Printing....");
	}
}
