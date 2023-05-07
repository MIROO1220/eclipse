package p09.practice2;

public class Chicken extends Animal implements Edible {

	@Override
	public String howToEat() {
		return "Fried로 먹습니다.";
	}

	@Override
	public String sound() {
		return "꼬꼬댁 꼬꼬";
	}

}
