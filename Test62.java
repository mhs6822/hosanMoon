package day09;

public class Test62 {

	static void add() {System.out.println("1");}
	static void add(int x) {System.out.println("2:" + x);}
	//static void add(int a) { }
	static void add(long a) {System.out.println("3:" + a);}
	static void add(long a, int b) {}
	static void add(int a, long b) {}
	
	public static void main(String[] args) {

		add(); 
		add(10L);
		add(1, 2L); 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
