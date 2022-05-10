package sec06.exam01_class;

/*
	일반적인 클래스를 이용
	1) 클래스 설계 (정의)
	2) 클래스를 이용하여 new 연산자로객체 생성
	3)객체.필드 또는 객체.메소드() 호출
	
	리플렉션 기술을 이용한 작업
	1) 객체를 통하여. 해당 객체의 클래스 정보 참조
	2) 클래스 문자열 정보를 통하여 해당 객체의 클래스 정보를 참조
	
	위의 두 가지 방법을 통하여 Class 객체를 생성
	이 때 Class객체는 어떤 클래스 또는 인터페이스를 참조하게 된다.
	
	 리플렉션(Reflection)
	  : 구체적인 클래스 타입을 알지 못해도 해당 클래스의 메소드, 필드, 생성자 등 클래스의 구성요소에 접근하는 기술
	  : 객체를 통해 클래스의 정보를 분석해내는 프로그램 기법
	  : 런타임시 실행되는 객체의 정보를 이용하여 객체의 클래스를 참조하는 특징
 */

public class CarExample {

	public static void main(String[] args) {

		//Class객체를 참조하는 방법
		//3)
		Class obj = String.class; //컴파일 했을 때의 바이트코드파일
		System.out.println(obj.getName()); //java.lang.String
		
		Car car = new Car();
		
		//1) 객체를 통해 클래스 정보 참조
		//class1객체가 Car클래스를 참조함
		//car객체를 통해여 클래스 정보를 참조
		//class1객체에 Car클래스의 정보가 대입됨
		Class class1 = car.getClass(); //java.lang.Class
		
		System.out.println(class1.getName());
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getPackage().getName());
		
		//2) 문자열을 통해 클래스 정보를 참조 -> 자주 사용하는 형태
		try {
			Class class2 = Class.forName("sec06.exam01_class.Car");
			//위와 똑같이 정보가 대입되어 아래를 다 뽑을 수 있음
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());
			System.out.println(class2.getPackage().getName());
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
