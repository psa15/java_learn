package sec06.exam01_stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100)); //데이터 넣기
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));

		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); //데이터 꺼내기
			System.out.println("꺼내온 동전: " + coin.getValue() + "원");
		}
		//컬렉션 기억장소에서 데이터가 존재하지 않을 경우,  pop()메서드 사용시 예외 발생
//		coinBox.pop();
	}

}
