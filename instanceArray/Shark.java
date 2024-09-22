package instanceArray;

public class Shark extends Animal {
	
	Shark(String type, String name) {
		super(type, name);
	}
	
	@Override
	void sleep() {
		System.out.println(this.name + " sleep in the sea.");
	}
}
