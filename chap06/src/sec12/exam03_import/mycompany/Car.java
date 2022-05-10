package sec12.exam03_import.mycompany;

import sec12.exam03_import.hankook.SnowTire;
import sec12.exam03_import.hyundai.Engine;
import sec12.exam03_import.kumho.BigWidthTire;

public class Car {

	//필드
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	
	//패키지명.클래스명 변수 = new 패키지명.클래스명(); ->full name 형식
	sec12.exam03_import.hankook.Tire tire3 = new sec12.exam03_import.hankook.Tire();
	sec12.exam03_import.kumho.Tire tire4 = new sec12.exam03_import.kumho.Tire();
}
