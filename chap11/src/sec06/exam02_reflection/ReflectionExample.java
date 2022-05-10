package sec06.exam02_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {

		Class clazz = Class.forName("sec06.exam02_reflection.Car"); //또다른 예외 발생가능하므로 예외전가시 최상위인 Exception 선택
		//clazz: Car클래스 참조
		System.out.println("클래스명");
		System.out.println(clazz.getName());
		System.out.println();
		
		System.out.println("생성자 정보");
		Constructor[] constructors = clazz.getDeclaredConstructors(); //constructors : Car클래스의 생성자 메소드들 참조
		//2번 반복
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			//생성자의 파라미터 정보를 참조
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters); // 밑의 메소드 호출
			System.out.println(")");
		}

		System.out.println("필드정보");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		System.out.println("메소드 정보");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			//메소드의 파라미터 정보 참조
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
			
		}
	}
	//생성자의 파라미터정보를 출력
	private static void printParameters(Class[] parameters ) {
		for(int i = 0; i < parameters.length; i++) {
			System.out.println(parameters[i].getName());
			if(i < (parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
}
