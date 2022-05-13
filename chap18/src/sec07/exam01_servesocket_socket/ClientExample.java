package sec07.exam01_servesocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	//클라이언트 소켓프로그램
	//통신 목적 준비: 서버IP/TCP, port번호 알아야함
	public static void main(String[] args) {
		Socket socket = null;
		
		try { //연결시도 했다가 연결 안되면 예외발생
			socket = new Socket();
			System.out.println("[연결 요청]");
			//연결시도
			socket.connect(new InetSocketAddress("localhost", 5001)); //접속정보
			System.out.println("[연결 성공]");
		} catch (Exception e) {	}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
