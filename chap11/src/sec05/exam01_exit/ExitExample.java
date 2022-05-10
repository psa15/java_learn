package sec05.exam01_exit;

public class ExitExample {

	public static void main(String[] args) {

		if(args.length != 2) {
			System.exit(0); //0값은 정상적인 종료의 의미로 해석. 0이외의 값을 사옹시에는 비정상적인 종료의 의미로 해석
		}

	}

}
