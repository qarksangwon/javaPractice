package 인터페이스;

public class MessageListener implements Button.OnClickListener{

    @Override
    public void onClick() {
        System.out.println("메세지를 보낸다.");
    }
}
