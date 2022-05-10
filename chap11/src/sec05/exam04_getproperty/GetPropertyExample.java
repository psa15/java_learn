package sec05.exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {

		//운영체제와 자바관련 시스템환경정보를 읽고자 할 때 사용
		String osName = System.getProperty("os.name"); //"os.name" : 예약된 키워드
		String userName = System.getProperty("user.Name");
		String userHome = System.getProperty("user.home");
		
		/*
		 System.getProperty("예약된 이름");
		 */
		
		System.out.println("운영체제 이름: " + osName);
		System.out.println("사용자 이름: " + userName);
		System.out.println("사용자 홈디렉토리: " + userHome);
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for (Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.println("[" + key + "]" + value);
		}

	}

}
