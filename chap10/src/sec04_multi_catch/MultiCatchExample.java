package sec04_multi_catch;

//예외가 다중으로 발생되는 경우 다중 catch로 작업하기
//다중 catch Exception 작성 시 하위레벨 -> 상위레벨
public class MultiCatchExample {

	public static void main(String[] args) {
		try {
		//예외 발생(인덱스)
		String data1 = args[0];
		String data2 = args[1];
		
		//숫자변환 예외 발생
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		//String data1 = args[i]; 여기서 예외발생하던가
		//Integer.parseInt() 여기서 발생하던가
		
		int result = value1 + value2;

		
		System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("매개값의 수가 부족");
		} catch (NumberFormatException ex) {
			System.out.println("숫자로 변환 불가");
		} catch (Exception ex) {
			System.out.println("알 수 없는 예외 발생");
		}finally { //생략 가능 - 보통 반드시 처리를 해야하는 작업을 이 안에 코딩, 예외 발생과 상관없이 실행됨
			System.out.println("다시 실행");
		}
	}

}
