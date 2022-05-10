package sec08.exam01_class_kinds;

//abstract키워드 때문에 추상클래스
//추상클래스: 추상메소드가 1개라도 존재하면 클래스명에 abstract키워드를 사용해야 함
public abstract class Abstract {

	//구성요소: 필드(기억장소 해당), 생성자, 메서드 + 추상메소드 사용 가능
	
	//field
	int x;
	int y;
	
	//method
	void methodA() {}
	
	//추상메서드: 메소드가 헤더만 존재, 블록 X
	abstract void a(); //추상메소드 - 실행하고자 하는 블록이 없음
}
