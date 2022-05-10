package sec07.exam02_method;

public class StringEqualsExample {

	public static void main(String[] args) {

		String strVar1 = new String("김지원");
		String strVar2 = "김지원";
		
		//갖고 있는 값이 주소, -> 주소 비교
		if(strVar1 == strVar2) {
			System.out.println("same Object");
		} else {
			System.out.println("different Object");
		}

		//문자열 비교
		if(strVar1.equals(strVar2)) {
			System.out.println("same String data");
		} else {
			System.out.println("different String data");
		}
	}

}
