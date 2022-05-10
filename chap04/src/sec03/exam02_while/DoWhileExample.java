package sec03.exam02_while;
//java.util 패키지에 Scnner클래스를 사용시 패키지며을 생략가능하게 해주는 구문
import java.util.Scanner; //java.util.*; -> java.util 패키지에 있는 걸 다 줄여 쓸 수 있음

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메시지를 입력");
		System.out.println("프로그램을 종료시 q 입력");
		//패키지명.쿨래스명 : 패키지명을 생략해서 사용하려면 import문 작업
		//Scanner 클래스: 키보드로 부터 입력받을 때 사용
		//Scanner 쓰고 엔터누르는 슌건  3번째 줄 import 삽입됨
		//클래스는 데이터타입의 기능을하나
		//사용법: 클래스명 변수 = new 클래스명()
		Scanner sc = new Scanner(System.in);  //import문으로 인해 java.util.Scanner라고 작성해야하는데 생략됨
		String inputString = ""; //sc.nextLine()의 값을 받아들이기 위해 만들어 짐
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
				
		//if (inputString == "q") -> X
	}

}
