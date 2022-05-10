package sec05.exam02_array_bynew;

public class ArrayCopyExample2 {

	public static void main(String[] args) {
		// 배열복사기능
//		System.arraycopy(원본 배열, 원본 배열의 요소위치, 타겟배열, 타겟배열의 요소 위치, 원본배열의 복사할 개수); 사용
		
		String[] oldStringArr = {"김지원","해방일지","염미정"}; 
		String[] newStringArr = new String[5]; //기본값 null
		
		System.arraycopy(oldStringArr, 0, newStringArr, 0, oldStringArr.length);
		
		for (int i = 0; i < newStringArr.length; i++) {
			System.out.println(newStringArr[i]);
		}
	}

}
