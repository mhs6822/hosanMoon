package instanceArray;

public class Eagle extends Animal {

	Eagle(String type, String name) {
		super(type, name);
	}
	
	@Override
	void sleep() {
		System.out.println(this.name + " sleep in the sky.");
	}
}
