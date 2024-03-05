package 생성자;

public class Tv {
    private boolean isON; //전원
    private int channel; //채널정보
    private int volume; // 소리크기

    Tv(){
        isON = false;
        channel = 11;
        volume = 10;
    }

    Tv(boolean isON, int channel, int volume){
        this.isON = isON;
        this.channel = channel;
        this.volume = volume;
    }

    public void setON(boolean onOFF) {
        isON = onOFF;
        System.out.println("TV : " + ((isON) ? "ON" : "OFF"));
    }
    public void setChannel(int cnl) {
        if (cnl >= 1 && cnl <= 999) {
            channel = cnl;
            System.out.println("채널을 변경 하였습니다.(현재 채널 : " + channel + ")");
        }else{
            System.out.println("제공하는 채널은 1번부터 999번 까지 입니다.");
        }
    }
    public void setVolume(int vol) {
        if (vol >= 0 && vol <= 100) {
            volume = vol;
            System.out.println("볼륨을 변경 하였습니다. (현재 볼륨 : " +volume +")" );
        }else if(vol<0) System.out.println("볼륨은 0 미만으로 줄일 수 없습니다.");
        else System.out.println("볼륨은 100을 초과할 수 없습니다.");
    }
    public void tvInfo() {
        String onOffStr = (isON) ? "ON" : "OFF";
        System.out.println("====== TV State ======");
        System.out.printf("전원 : %s\n", onOffStr);
        System.out.printf("볼륨 : %d\n", volume);
        System.out.printf("채널 : %d\n", channel);
        System.out.println();
    }

}
