package sec03.exam04_deep_clone;

public class MemberExample {
	
	//깊은 복사
	//original 객체외 cloned객체는 깊은 복사가 되어 있다.
	//참조타입의 기억장소는 각각 생성되어 있다.
	public static void main(String[] args) {
		
		Member original = new Member("Kimgeewon", 25, new int[] {90, 90}, new Car("소나타"));
		
		Member cloned = original.getMember();
		
		
		original.scores[0] = 100;
		original.scores[1] = 100;
		original.name = "김지원";
		
		System.out.println("original:  " + original.scores[0]); //100
		System.out.println("original:  " + original.scores[1]); //100
		System.out.println("original:  " + original.name);
		
		System.out.println("cloned:  " + cloned.scores[0]); //90
		System.out.println("cloned:  " + cloned.scores[1]); //90
		//참조타입의 기억장소도 새롭게 생성되어 값이 저장됐기 때문에 cloned는 복제된 그대로 유지됨
		System.out.println("cloned:  " + cloned.name);
	}
}
