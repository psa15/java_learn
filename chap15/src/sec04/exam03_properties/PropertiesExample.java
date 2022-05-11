package sec04.exam03_properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {

		Properties properties = new Properties();
		//경로확인
		String path = PropertiesExample.class.getResource("database.properties").getPath();
//		System.out.println(path);

		path = URLDecoder.decode(path, "utf-8"); //예외전가
		
//		System.out.println(path);
		
		//database.properties 파일을 참조해서 메모리상에 로드
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String nickname = properties.getProperty("nickname");
		
		System.out.println("driver: " + driver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
		System.out.println("nickname: " + nickname);
	}

}
