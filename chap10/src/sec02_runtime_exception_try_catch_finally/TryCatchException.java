package sec02_runtime_exception_try_catch_finally;

import java.sql.SQLException;
import java.sql.Statement;

public class TryCatchException {
	public static void main(String[] args) {
		
		//jdk에서 제공하는 메서드 중 예외관련 작업을 문법적으로 처리를 해야하는 것들이 존재.
		Statement stmt = null;
		try {
			stmt.executeQuery("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
