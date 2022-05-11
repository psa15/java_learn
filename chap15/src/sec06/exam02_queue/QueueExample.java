package sec06.exam02_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("SendMail", "김지원"));
		messageQueue.offer(new Message("SendSMS", "염미정"));
		messageQueue.offer(new Message("SendKakaotalk", "탄야"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case "SendMail" :
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "SendSMS" :
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			case "SendKakaotalk" :
				System.out.println(message.to + "님에게 카톡을  보냅니다.");
				break;
			}
		}

	}

}
