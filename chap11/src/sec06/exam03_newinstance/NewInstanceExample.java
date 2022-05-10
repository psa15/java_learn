package sec06.exam03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("sec06.exam03_newinstance.SendAction"); //sec06.exam03_newinstance.SendAction 를 통해 간접적으로 정보 get
			//객체생성
			Action action = (Action) clazz.newInstance(); //SendAction은 Action인페를 구현하니까
			action.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
