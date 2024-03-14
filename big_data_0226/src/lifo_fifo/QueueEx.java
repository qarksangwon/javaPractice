package lifo_fifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Message> msgQueue = new LinkedList<>();
        msgQueue.offer(new Message("Mail", "백이진"));
        msgQueue.offer(new Message("SMS", "스티브"));
        msgQueue.offer(new Message("Kakao", "서울시"));

        while(!msgQueue.isEmpty()) { // 메시지큐가 비어 있는지 확인
            Message msg = msgQueue.poll(); // 메시지큐에서 한개의 메시지를 꺼냄
            switch(msg.command) {
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "Kakao" :
                    System.out.println(msg.to + "에게 카톡을 보냅니다");
                    break;
            }
        }
    }
}
class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
