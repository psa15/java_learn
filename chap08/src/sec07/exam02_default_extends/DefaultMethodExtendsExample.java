package sec07.exam02_default_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		
		//익명구현객체 - 1회성
		ChildInterface ci1 = new ChildInterface() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				
			}
		};
		
		ci1.method1();
		ci1.method2(); //익명구현객체에는 없지만 부모인터페이스(ParentInterface)의 default method2()호출
		ci1.method3();
		
		ChildInterface2 ci2 = new ChildInterface2() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				
			}
		};
		
		ci2.method1();
		ci2.method2(); //자신의 재정의된 메소드 호출
		ci2.method3();
		
		ChildInterface3 ci3 = new ChildInterface3() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
		};
		ci3.method1();
		ci3.method2(); //ChildInterface3 구현객체의 method2()호출
		ci3.method3();
	}

}
