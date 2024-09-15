package day09;

class Circle3 {
	int radius; 
	Circle3(int radius) {
		this.radius = radius; 
	}
	void set(int radius) {
		this.radius = radius; 
	}
	Circle3 getSelf() {
		return this;
	}
}
public class Test69 {
	public static void main(String[] args) {

		Circle3 c1 = new Circle3(1); 
		Circle3 c2 = new Circle3(2); 
		Circle3 c3 = new Circle3(3); 
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println();
		System.out.println(c1.getSelf());
		System.out.println(c2.getSelf());
		System.out.println(c3.getSelf());
		
		
//		System.out.println(c1.radius);
//		System.out.println(c2.radius);
//		System.out.println(c3.radius);
//		System.out.println();
//		c1.set(4);
//		c2.set(5);
//		c3.set(6);
//		System.out.println(c1.radius);
//		System.out.println(c2.radius);
//		System.out.println(c3.radius);
//		
		
		
		
	}
}
