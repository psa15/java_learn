package sec05.exam02_array_bynew;

public class MainStringArrayArgument {
	
	public static void main(String[] args) {
		
		//main()메서드의 파라미터 사용법 - String[] args
		
		if (args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java.exe MainStringArrayArgument 값1 값2");
			System.exit(0); //프로그램 종료
		}
		
		System.out.println("테스트");
		
		System.out.println(args[0]);
		System.out.println(args[1]);
	}

}
