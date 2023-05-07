package p04.final_method;

public class Car {
	
	public int speed = 0;
	
	public void speedUp() {
		speed++;
	}
	
	public void speedDown() {
		speed--;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
