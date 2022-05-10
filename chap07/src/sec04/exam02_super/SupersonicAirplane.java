package sec04.exam02_super;

public class SupersonicAirplane extends Airplane {

	public static final int NORMAL = 1; //static final 데이터타입 -> 상수! 상수명은 대문자
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		} else {
			super.fly();//부모클래스의 메서드를 호출함(super키워드 사용)(자식클래스에서 메서드를 재정의하면 목록에서 안나오기 때문에)
		}
	}
	
	
}
