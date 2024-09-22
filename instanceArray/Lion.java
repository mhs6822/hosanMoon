package instanceArray;

public class Lion extends Animal {
	
	Lion(String type, String name) {
		super(type, name);
	}
	
	@Override
	void sleep() {
		System.out.println(this.name + " sleep in the forest");
	}
}
