package p09.abstract_class2;

// The type Cat must implement the inherited abstract method Animal.sound()
public class Cat extends Animal {

	public Cat() {
		super.kind = "표유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
