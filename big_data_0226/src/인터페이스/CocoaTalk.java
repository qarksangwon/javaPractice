package 인터페이스;

public class CocoaTalk {
    private String to; // 상대방 이름
    private String msg; // 메세지

    public CocoaTalk(String name){
        to = name;
    }
    public void writeMsg(String msg){
        this.msg = to + " : " + msg;
    }

    public void send(NetworkAdaptor na){
        na.send(msg);
    }
}
