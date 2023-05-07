package p09.practice5;

import p09.practice2.Edible;

public class InterfacePoly {

	public static void main(String[] args) {
		
		Object[] arr = {
				new SeperateVolume("푸코의 진자"),
				new SeperateVolume("서양의 미술사"),
				new AppCDInfo("Spring3.0CD")
		};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Lendable) {
				Lendable e = (Lendable) arr[i];
				e.checkOut("김내리", "20140709");
			}
		}
	}

}
