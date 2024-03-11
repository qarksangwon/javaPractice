package 인터페이스;

public interface NetworkAdaptor {
    void connect(); //public abstract 가 생략돼있다.!
    void send(String msg);
}

class Wifi implements NetworkAdaptor{
    @Override
    public void connect(){
        System.out.println("Wifi 연결");
    }

    @Override
    public void send(String msg) {
        System.out.println("Wifi >> "+msg);
    }
}

class FiveG implements NetworkAdaptor{
    @Override
    public void connect(){
        System.out.println("5G 연결");
    }

    @Override
    public void send(String msg) {
        System.out.println("5G >> "+msg);
    }
}

class LTE implements NetworkAdaptor{
    @Override
    public void connect(){
        System.out.println("LTE 연결");
    }

    @Override
    public void send(String msg) {
        System.out.println("LTE >> "+msg);
    }
}
