package sec11.exam02_static_final;

public class Earth {

	//상수: 불변의 값을 이름으로 정의해서 사용
	//상수로 값을 변경할 수가 없다.
	
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS; //PI는 이클립스에서 제공하는 상수
		
	}
}
