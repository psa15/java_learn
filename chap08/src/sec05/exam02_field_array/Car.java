package sec05.exam02_field_array;

//데이터타입이 동일하면서 같은 용도의 변수일 경우에는 배열로 처리 가능
public class Car {

	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	
	void run() {
		//향상된 for문
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
