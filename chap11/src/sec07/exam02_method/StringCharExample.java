package sec07.exam02_method;

public class StringCharExample {

	public static void main(String[] args) {
		/*
		  2000년대 이전세대 1 남자 2 여자
		  2000년 이후 세대 3 남자 4 여자
		  외국인 남자 5, 여자6
		 */
		String ssn = "010504-3054564";
		char sex = ssn.charAt(7); // sex = 3 (char형으로 저장)
		switch(sex) {
		case '1' : //char여서 '', String이면 ""
		case '3' :
			System.out.println("male");
			break;
		case '2' :
		case '4' :
			System.out.println("female");
			break;
		}

	}

}
