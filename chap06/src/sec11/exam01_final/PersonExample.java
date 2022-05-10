package sec11.exam01_final;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "김지원");
		
		System.out.println(p1.nation);
		System.out.println(p1.name);
		System.out.println(p1.ssn);
		
//		p1.nation = "USA"; //nation은 final 변수라 값 변경 하려면 에러
//		p1.ssn = "12312323";
		
		p1.name = "염미정";
	}
}
