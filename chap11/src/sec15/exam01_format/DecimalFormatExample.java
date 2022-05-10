package sec15.exam01_format;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		//정수값으로 표현 (반올림적용)
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num)); //1234568
		
		//소수부분 첫째자리까지 표현
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num)); //1234567.9
		
		//정수부분 열자리까지 표현 + 소수 부분 다섯자리까지 표현 + 빈 자리는 0으로 채움
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num)); //0001234567.89000
		
		//정수값으로 표현(반올림 적용)
		df = new DecimalFormat("#");
		System.out.println(df.format(num)); //1234568
		
		//소수부분 첫째자리까지 표현
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num)); //1234567.9
		
		//정수부분 열자리까지 표현 + 소수 부분 다섯자리까지 표현 + 빈 자리는 채우지 X
		df = new DecimalFormat("##########.#####");
		System.out.println(df.format(num)); //1234567.89
		
		//소수부분 첫째자리까지 표현(반올림 적용)
		df = new DecimalFormat("#.0");
		System.out.println(df.format(num)); //1234567.9
		
		//소수부분 첫째자리까지 표현(반올림 적용 + 양수표현)
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num)); //+1234567.9
		
		//소수부분 첫째자리까지 표현(반올림 적용 + 음수표현)
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num)); //-1234567.9
		
		//정수부분은 3자리 마다 콤마(,) 적용 + 소수부분은 첫째자리까지 표현 (반올림 적용)
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num)); //1,234,567.9
		
		//지수 표현법(큰 수, 작은 수를 간소화하는 표현방식의 목적
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num)); //1.2E6 (-> 1.2 * 10의6)
		
		//num이 양수면 +#,###, 음수면 -#,###
		df = new DecimalFormat("+#,###; -#,###");
		System.out.println(df.format(num)); //+1,234,568
		
		//num변수의 값에 100을 곱한 후 % 붙임
		df = new DecimalFormat("#.# %");
		System.out.println(df.format(num)); //123456789 % (-> 1234567.89 * 100 + "%")
		
		//\u00A4 유니코드 값 원화(￦)가 출력 + 3자리마다 콤마
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num)); //￦ 1,234,568


	}
}
