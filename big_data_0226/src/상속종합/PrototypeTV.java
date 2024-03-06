package 상속종합;

public class PrototypeTV {
    boolean isPower;
    int channel;
    int volume;

    public PrototypeTV(){
        this.isPower = false;
        this.channel = 10;
        this.volume = 10;
    }
    public PrototypeTV(boolean isPower, int channel, int volume){
        this.isPower = isPower;
        this.channel = channel;
        this.volume = volume;
    }
    public void setChannel(int cnl){
        if(cnl>0 && cnl<1000){
            channel = cnl;
        }else System.out.println("채널 설정 범위를 벗어났습니다.");
    }
}
