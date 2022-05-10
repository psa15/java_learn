package sec10.exam02_static_block;

public class Television {

	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	//static 블록: static필드들을 초기화할 때 사용
	static {
		info = company + "-" + model;
	}
	
	//생성자 메소드로 초기화? -> 모든 필드와 메서드가 static이면 객체 생성할 필요 없는데 생성자도 사용할 일 없음
}
