package sec03.exam02_hashcode;



public class Key {

	public int number;
	
	//constructor
	public Key(int number) {
		this.number = number;
	}
	
	//method override
	//1)아래 내용을 주석 걸었을 경우,
	//2) 주석을 해제했을 경우 각각 테스트해서 학습
	//동일한 객체다 아니다의 기준을 잡는 성격: equals(), hasbCode()
	@Override
	public boolean equals(Object obj) {
//		System.out.println("test"); //실행되는지 시각적으로 테스트 
		
		if(obj instanceof Key) { //교과서적인 타입확인! true라면 형변환
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
//		System.out.println("test-hashCode()");//실행되는지 시각적으로 테스트 
		
		return number;
	}
}
