package p09.abstract_class2;

public class TestAnimal {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		
		dog.sound();
		cat.sound();
		
		System.out.println();
		
		Animal animal = cat; // promotion
		animal.sound(); // override => polymorphism
		
		animal = dog;
		animal.sound();
	}

}
