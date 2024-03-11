package 인터페이스;

public class Button {
    OnClickListener listener; // OnClickListener 참조 변수
    void setOnClickListener(OnClickListener listener){
        this.listener = listener;
    }

    void touch(){
        listener.onClick(); // 객체의 onClick() 호출
    }
    interface OnClickListener{
        void onClick();
    }
}
