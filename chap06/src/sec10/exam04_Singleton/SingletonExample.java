package sec10.exam04_Singleton;

public class SingletonExample {

	public static void main(String[] args) {

		//생성자가 public이 아니라 private이기 때문에 객체 생성 불가
//		Singleton singleton = new Singleton();
		
		//생성되어 있는 객체를 참조
		//Singleton.java의 7번째 라인 singleton 기억장소
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		//obj1과 obj2와 Singleton.java의 7번째 라인 singleton의 주소값은 같다. 이미 생성되어 있기 때문에

		if (obj1 == obj2) {
			System.out.println("동일한 Singleton객체입니다.");
		}else {
			System.out.println("동일한 Singleton객체가 아니다.");
		}
	}

}
