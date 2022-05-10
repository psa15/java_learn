package sec11.exam01_final;

//final 변수: 변수의 값을 변경할 수 없다.
public class Person {

	final String nation = "Korea";
	final String ssn;
	String name;
	
	//생성자 정의
	public Person(String ssn, String name) {
		this.ssn = ssn; 
		this.name = name;
	}
}
