package p08.import_ex.mycompany;

import java.util.Calendar;

import p08.import_ex.hankook.SnowTire;
import p08.import_ex.hankook.Tire;
import p08.import_ex.hyundai.Engine;
import p08.import_ex.kumho.BigWidthTire;

// 1. 다른 package에 있는 class를 사용하기 위해서는 import 키워드 사용
//	  형식 : import package 이름 + class 이름

// 2. package이름은 class를 구분짓는 단위
// 	  -> class이름이 동일하지만 package이름이 틀리면 다른 class로 인식
//	  -> 즉, class이름은 package이름을 포함한 개념

public class Car {
	
	Engine engine;
	SnowTire snowTire;
	BigWidthTire BigTire;
	Tire tire1;
	p08.import_ex.kumho.Tire tire2; // import문을 쓰게되면 hankook과 충돌
	Calendar calendar;
	
}
