package sec07.exam02_method;

public class StringIndexOfExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); //3 만약 없다면 -1 출력
		System.out.println(location);
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군");
		} else {
			System.out.println("자바 관련 없는 책이군");
		}

	}

}
