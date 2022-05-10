package sec05_try_with_resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/* 자동리소스 닫기(.close()->안해도 됨) + 예외처리 기능
		try() {//()가 생김!!!!!!!!!!!! ->()안에서 객체생성구문을 작성했을 때
			
		} catch(Exception ex) {
			
		}
		*/
		
		/*
		 힙영역에 생성된 메모리는 JVM안의 G.C(Garbage Collector)라는 메모리관리자가 힙영역의 메모리,
		 즉, 객체가 더 이상 사용할 일이 없는 것을 코드내에서 스캔 확인 후 힙영역의 메모리를 소멸시키는 작업을 함
		 
		 try-catch 문법 안의 객체생성구문을 사용하면 gc가 찾아가 소멸시키기 전에 자동으로 메모리가 close되게 처리해줌
		 */
		
		//예외처리를 요구하는 메서드 -> 1)예외처리 2)예외전가-나를 호출한 쪽으로 떠넘기기
		//예외전가
		try(FileInputStream fis = new FileInputStream("file.txt")){ //main()가 상위 개념이기 때문에 
			fis.read();
		} catch(Exception ex) {
			System.out.println();
		}
		/* 예외처리
		 try(FileInputStream fis = new FileInputStream("file.txt")){ 
			fis.read();
		} catch(Exception ex) {
			System.out.println("예외처리 코드 실행");
		}
		 */
		
		//원래는 .close();를 사용해야만 함
		FileInputStream fis2 = null;
		try{ //main()가 상위 개념이기 때문에 
			fis2 = new FileInputStream("file.txt");
				fis2.read();
		} catch(Exception ex) {
			System.out.println("예외처리 코드가 실행됨");
		}finally {
			fis2.close();
		}
		
	}

}
