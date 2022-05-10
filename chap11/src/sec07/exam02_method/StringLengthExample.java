package sec07.exam02_method;

public class StringLengthExample {

	public static void main(String[] args) {

		String ssn = "1234561234567"; //13자리
		int length = ssn.length(); //메소드 제공
		if(length == 13) {
			System.out.println("ssn ok");
		}else {
			System.out.println("ssn no");
		}
		/*
		int[] arr = {50,60};
		
		int count = arr.length; //속성제공
		 */
	}

}
