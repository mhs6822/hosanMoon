package interfaceEx;

public class ComplexerMain {

	public static void main(String[] args) {

		Complexer com = new Complexer();
		System.out.println(Complexer.INK); 
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-1234-1234");
		com.receive("02-1234-1234");

	}
}
