package sec03.exam04_shallow_clone;

public class MemberExample {

	//얕은복사
	//original 객체외 cloned객체는 얕은 복사가 되어 있다.
	//참조타입의 기억장소는 공유가 되어있다.
	public static void main(String[] args) {
		
		Member original = new Member("Kimgeewon", 25, new int[] {90, 90}, new Car("소나타"));
		
		Member cloned = original.getMember();
		
		original.scores[0] = 100;
		original.scores[1] = 100;
		
		System.out.println("original:  " + original.scores[0]); //100
		System.out.println("original:  " + original.scores[1]); //100
		
		System.out.println("cloned:  " + cloned.scores[0]); //100
		System.out.println("cloned:  " + cloned.scores[1]); //100
		//-> 기억장소가 공유되고 있음을 알 수 있음
	}
}
