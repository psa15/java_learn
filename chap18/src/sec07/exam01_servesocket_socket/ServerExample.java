package sec07.exam01_servesocket_socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {

	public static void main(String[] args) {
		// 통신용 서버소켓 프로그램
		//socket: 프로세스 간의 통신에 사용되는 양쪽 끝단.....이야....뭐래
		//IP:127.0.0.1
		
		ServerSocket serverSocket = null;
		//서버소켓 객체 생성 -> bind()메소드로 어떤 ip와 어떤 port를 사용하겠다
		try {
			serverSocket = new ServerSocket(); //서버에 연결을 대기하고 클라이언트의 요청을 받아 연결을 수락하기 위해 존재
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while(true) {
				System.out.println("[연결 대기중]");
				Socket socket = serverSocket.accept(); //실행되면 대기상태
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
			}
		} catch (Exception e) {
		
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
