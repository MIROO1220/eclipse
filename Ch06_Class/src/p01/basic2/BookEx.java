package p01.basic2;

public class BookEx {

	public static void main(String[] args) {

		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		Book chunHyang = new Book("춘향전");
		
		littlePrince.printBookInformation();
		chunHyang.printBookInformation();
		
		littlePrince.title = "2023년 어린왕자";
		littlePrince.printBookInformation();
	}

}
