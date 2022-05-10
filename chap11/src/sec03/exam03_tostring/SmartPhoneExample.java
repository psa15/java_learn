package sec03.exam03_tostring;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("google", "android");
		
		String strobj = myPhone.toString();//SmartPhone.java의 toString()
		
		//1)
		System.out.println(strobj);
		//2)
		System.out.println(myPhone); //객체를 출력하는 목적으로 객체만 호출하면 toString()메서드가가 포함(myPhone.toString()으로 동작됨)

	}

}
