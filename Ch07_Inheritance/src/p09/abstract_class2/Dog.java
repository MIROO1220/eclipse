package p09.abstract_class2;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
