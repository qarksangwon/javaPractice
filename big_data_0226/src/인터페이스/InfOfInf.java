package 인터페이스;
// 중첩 인터페이스 = 클래스 내부에 선언한 인터페이스

public class InfOfInf {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.setOnClickListener(new CallListener());
        // Button 의 setOnClickListener 를 통해
        // interface 인 OnClickListener 를 상속받는 객체를 생성
        // 생성한 객체를 매개변수로 전달
        btn.touch();
        // touch 메소드 안에는 onClick() 을 호출하는 내용이 있음

        btn.setOnClickListener(new MessageListener());
        // 이번엔 MessageListener 객체를 생성
        btn.touch();
    }
}
