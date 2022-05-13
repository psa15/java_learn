package sec06.exam01_inetaddress;

import java.net.InetAddress;

public class InetAddressExample {

	public static void main(String[] args) throws Exception{
		// 자기 컴퓨터의 IP 참조
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내 컴퓨터의 IP주소: " + local.getHostAddress());

		InetAddress[] iArr = InetAddress.getAllByName("www.ezenac.co.kr"); 
		//host: 인터넷 상에 연결되어있는 웹사이트들의 이름
		//리턴값 - InetAddress[] : 클래스배열, 객체배열
		//naver.com: domain주소 (www.은 웹개발자가 만들어야 함)
		
		for(InetAddress remote : iArr) {
			System.out.println("www.ezenac.co.kr IP주소:  " + remote.getHostAddress());
			
		}
	}

}
