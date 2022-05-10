package sec10.exam02_bank_loan;

public class BankLoanExample {
	
	public static void main(String[] args) {
		//static으로 이율을 변경하고 밑의 이율을 지움
		// BankLoan.iyul = 5; 이 값만 바꿔주면 됨!
		BankLoan.iyul = 5;
		// loan1.iyul = 3; //이렇게 해도 모든 이율은 3으로 변경됨(static이니까) 근데 오해의 소지가 많아 안씀
		
		BankLoan loan1 = new BankLoan();
		loan1.name = "염미정";
		loan1.tel = "010-1234-1234";
		loan1.price = 1000;
//		loan1.iyul = 3;
		
		BankLoan loan2 = new BankLoan();
		loan2.name = "홍길동";
		loan2.tel = "010-1234-1235";
		loan2.price = 1500;
//		loan2.iyul = 3;
		
		BankLoan loan3 = new BankLoan();
		loan3.name = "구씨";
		loan3.tel = "010-1234-1236";
		loan3.price = 2000;
//		loan3.iyul = 3;
	}
}
