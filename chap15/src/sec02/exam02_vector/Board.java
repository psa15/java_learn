package sec02.exam02_vector;

public class Board /*extends Object*/ {

	String subject;
	String content;
	String writer;
	public Board(String subject, String content, String writer) {
//		super(); //지워도 컴파일 과정에서 클래스 파일에 자동 생성 ->Object 클래스의 생성자 메소드 의미
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
