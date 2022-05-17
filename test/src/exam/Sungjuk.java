package exam;

public class Sungjuk {
	//필드
	private String name;
	private int[] jumsu = new int[4];
	
	//getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int[] getJumsu() {
		return jumsu;
	}
	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	/* 더 줄이자
	public double getAvg() {
		double avg;
		avg = getSum() / jumsu.length; //자동 형변환
		return avg;
	}
	*/
	//평균 메소드
	public double getAvg() {
		return (double)getSum() / jumsu.length;
	}
	//총점 메소드
	public int getSum() {
		int sum = 0;
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i];
		}
		return sum;
	}
}
