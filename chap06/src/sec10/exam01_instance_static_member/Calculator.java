package sec10.exam01_instance_static_member;

public class Calculator {
	//인스턴스 멤버: new 키워드가 힙영역에 메모리 생성
	//정적멤버: new 키워드 X, JVM이 static 영역에 메모리 생성
	
	
	//생성자
	/*s_int는 static인데 
	 Calculator myClac = new Calculator(); 
	 이렇게만 해서 main()메소드를 실행해도 static 멤버: 1 이렇게 출력
	 -> new 생성되기 전에 이미 static 메모리에 s_int가 생성됐다는 뜻
	 Calculator myClac2 = new Calculator();
	 Calculator myClac3 = new Calculator();
	 이렇게 코드 추가하여 실행하면  static 멤버: 3 이렇게 출력됨!
	 새롭게 myCalc2,3이 만들어지는게 아니라 그냥 s_int를 공유!
	 내 웹사이트에 방문한 누적 방문자수를 표시하고 싶으면 static 사용!
	 static 필드의 값을 공유!
	 i_int 는 인스턴스필드기 때문에 new로 매번 기억장소가 새롭게 생성되어 항상 1이 나옴
	 */
	public Calculator() {
		s_int++;
		System.out.println("static 멤버: " + s_int);
		
		i_int++;// 각각 객체마다 자신의 힙영역의 i_int기억장소를 접근
		System.out.println("instance 멤버: " + i_int);
	}
	
	
	//필드
	int i_int; //인스턴스 필드
	static int s_int; //static 필드(=non 인스턴스필드)
	
	//메소드
	//static 메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int multiply(int x, int y) {
		return x * y;
	}
	
	//인스턴스 메소드
	int minus(int x, int y) {
		return x - y;
	}
	
	double divide (int x, int y) {
		return x / (double) y;
	}
}
