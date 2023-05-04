package edu.kh.poly.ex1.model.vo;

public class Tesla extends Car { // 전기차
	
	private int batteryCapacity; // 배터리 용량
	
	// ctrl + space -> enter
	public Tesla() {
		super(); // 부모 생성자(Car)
	}
	
	// 매개변수 생성자
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}
	
	// getter / setter
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
	}

}
