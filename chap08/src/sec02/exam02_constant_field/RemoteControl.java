package sec02.exam02_constant_field;

public interface RemoteControl {

	//상수-대문자!
	int MAX_VOLUME = 10; //코딩은 일반 변수선언과 같지만 컴파일시 상수로 추가됨
	//= public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 5;
}
