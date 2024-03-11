package 디폴트메소드;

public interface RemoteControl {
    int MaxVolume = 100; // final static 이 생략된것. 전역 상수 변수
    int MinVolume = 0;
    void turnON();
    void turnOFF();
    void setVolume(int volume);

    //default method : JDK 8 이후 추가됨.
    default void setMute(boolean mute){
        if(mute) System.out.println("무음 처리");
        else System.out.println("무음 해제");
    }

    //static 이 붙으면 상속을주는게 아니라 static 영역에 따로 메소드,
    // 즉 객체로 부르는 메소드가 아닌 interface 소속 메소드기 때문에 구현 가능
    static void changeBattery(){
        System.out.println("==건전지 교체==");
    }

}
