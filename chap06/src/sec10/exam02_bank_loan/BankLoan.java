package sec10.exam02_bank_loan;

//은행대출상품
public class BankLoan {

	//대출상품의 특징은 이율이 고정
	//정보
	//이름, 연락처,대출금액, 이율
	
	
	/*
	 염미정 1000만원
	 김지원 1500만원
	 구씨 2000만원
	 
	 이율(고정) 3%
	 */
	
	String name;
	String tel;
	int price;
//	int iyul;
	
	//이율이 변경된다면??
	/*
	 이율은 동일하게 적용되어야 하는데 이율이 변경된다면
	 이율을 static으로 변경하여 기억저장소를 하나만 생성하면 된다!
	 */
	static int iyul;
}
