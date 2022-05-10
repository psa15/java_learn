package sec10.exam05_memory_access;

//멤버 접근
public class ClassAccessInfo {

	//instance member field
	int field1;
	
	//instance method
	void method1() {
		
	}
	
	//static member field
	static int field2;
	
	//static member method
	static void method2() {}
	
	//static block: 블록: 실행을 하겠단 의미
	//정적블록은 메모리가 생성이 되어있을 경우에 접근이 가능
	static {//메모리가 생성이 되어야 실행됨
		
		/*
		 field1 = 100; //why error? : 인스턴스필드는 new라는 키워드로 메모리를 생성하기 전까진 X // met
		 method1도 에러남: ctrl + spacebar 를 쳐도 안나오면 문법적으로 안맞는다는 뜻
		 */		
		
		//정적블록이 실행되기 전에 static성격이므로 메모리가 생성되어 있어 접근 가능
		field2 = 100;
		method2();
	}
	
	static void method3( ) {
		field2 = 100;
		method2();
		
		//ctrl + spacebar 목록에 안떴지만 어거지 코딩은 에러
		/*
		 field1 = 100;
		 method1();
		 */
		
		//instance member 사용하기 위해서는 메모리 생성작업해야함
		ClassAccessInfo obj = new ClassAccessInfo();
		obj.field1 = 100;
		obj.method1();
	}
}
