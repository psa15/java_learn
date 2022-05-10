package sec07.exam02_field_initialize2;

public class Korean {

	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자를 수동으로 정의
	public Korean(String name, String ssn) { //String n, String s 로 써도 됨
		
//		name = name; //좌측은 위의 필드 name, 우측은 파라미터의 name
//		ssn = ssn;  //-> 헷갈림
		
		//this.필드 (this: Korean이라는 클래스를 가리킴)
		this.name = name;
		this.ssn = ssn;
	}
	
}
