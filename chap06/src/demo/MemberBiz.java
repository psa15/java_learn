package demo;

public class MemberBiz {

	//회원가입
	public void insert(String userId, String passwd, String name, String addr, int age, String tel) {
		//DB 저장
	}
	//회원 삭제
	public void delete(String userId, String passwd) {
		//DB에서 삭제
	}
	//회원 수정
	public void update(String userId, String passwd, String name, String addr, int age, String tel) {
		//DB수정
	}
	//아이디 주복 체크
	public boolean duplicate(String userId) {
		//DB에서 아이디 존재 유무 체크
		return true;
	}
	//비밀번호 찾기
	public String searchPW(String userID) {
		//DB에서 아이디에 해당하는 비밀번호 가져오기
		return "1234";
	}
}
