package sec03.exam02_increase_decrease;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// 증감 연산자  ++, --
		//기능? 변수에 1을 더하거나 빼는 것을 누적한다.
		//변수 앞, 뒤에 증감 연산자를 사용
		// ++변수, 변수++, --변수, 변수--
		
		int x = 10;
		int y= 10;
		int z;
		
		System.out.println("----------");
		
		x++; //x = x + 1 -> 11
		++x; // x = x + 1 -> 12
		System.out.println("x= " + x);
		//x의 변수값을 먼저 읽어와서 출력한 후에, x변수에 1을 더함
		System.out.println("x= " + x++); //12 출력 후 x에 더하기 1 해서 x = 13
		System.out.println("x= " + x); //13 출력
		//x변수에 1을 더한 후에 x의 변수값을 읽어와서 출력
		System.out.println("x= " + ++x); // x에 1을 먼저 더한 후 14 출력
		System.out.println("x= " + x); //그대로 14 출력
		
		System.out.println("y = " + y); //10
		System.out.println("y = " + --y); //9
		System.out.println("y = " + y--); //9
		System.out.println("y = " + y); //8
		
		x = 10;
		z = ++x;
		
		System.out.println("x = " + x); //11
		System.out.println("z = " + z);
		
		x = 10;
		z = x++;
		
		System.out.println("x = " + x); //11
		System.out.println("z = " + z); // z= x(10) -> x= x+1(11)

	}

}
