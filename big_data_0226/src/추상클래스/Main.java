package 추상클래스;
// 추상 클래스는 객체 생성 안됨.
// 추상 메소드와 일반 메소드 혼합해서 사용 가능
// 추상 메소드는 자식 클래스에서 무조건 오버라이딩 사용해야함.
// 다중 상속 지원하지 않음

public class Main {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("Galaxy S24");
        sp.setPower(true);
        sp.call();
        sp.internet();
    }
}

class SmartPhone extends  Phone{
    public SmartPhone(String name){
        super(name);
    }
    @Override
    void call(){
        System.out.println("상속받은 통화 기능 구현");
    }

    public void internet(){
        System.out.println("인터넷 기능");
    }
}
