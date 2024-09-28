package encapsulation;

// encapsulation

class Person {
	private String name;
	private int age;
	
	public String  getName() {   // getter
		return name;
	}
	public void setName(String name) {  // setter
		this.name = name;
	}
	
	public int getAge() {    // getter
		return age;
	}
	public void setAge(int age) {    // setter
		if (age>0 && age<150 ) {
			this.age = age;
		} else {
			System.out.println("check age again!");
		}
	}
}

public class Encapsulation {

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("Tom");
		p.setAge(27);
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
	}
}
