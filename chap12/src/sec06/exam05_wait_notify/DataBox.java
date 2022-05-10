package sec06.exam05_wait_notify;

//공유자원 클래스
public class DataBox {

	private String data;
	//data가 null이면 생산자 스레드가 물건 생산
	//null이 아니면 소비자 스레드가 물건구매행위실행
	
	//물건을 소비하는 메소드
	//소비자스레드가 사용할 메서드
	public synchronized String getData() {
		if(this.data == null) {//마치 마트 진열대에 제품이 없는 경우
			try {
				//자신의 CPU점유를 해제, 일시정지 상태로 변경
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String returnValue = data;
		//소비자가 물건을 구매한 의미
		
		System.out.println("소비자스레드가 읽은 데이터: " + returnValue);
		data = null; //보관함에 물건이 비어져있는 상태를 의미
		//물건 채우라고 생산자스레드 깨우기
		notify(); //다른 스레드가 wait()에 의해 일시정지인 상태를 대기상태(runnable)로 변경 해줌
		
		return returnValue;
	}
	
	//물건을 생산하는 메소드
	//생산자스레드가 사용할 메서드
	public synchronized void setData(String data) {
		if(this.data != null) {//진열대에 제품이 존재하고 있음을 의미(구매되지 않은 상태, 물건 재고가 존재)
			try {
				wait(); //보관함에 재고가 존재하니 물건 생산 작업 X -> cpu점유 해제, 일시정지 상태
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//물건을 생산하여 진열대에 진열
		this.data = data;
		System.out.println("생상자가 생성한 데이터: " + data);
		
		//잠든 소비자 스레드 깨워서 사가라함
		notify();
	}
}
