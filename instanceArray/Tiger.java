package instanceArray;

public class Tiger extends Animal {

	Tiger(String type, String name) {
		super(type, name);
	}
	
	@Override
	void sleep() {
		System.out.println(this.name + " sleep in the mountain.");
	}
}
