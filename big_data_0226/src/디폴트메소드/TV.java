package 디폴트메소드;

public class TV implements RemoteControl{
    private int volume;

    @Override
    public void turnON() {
        System.out.println("TV ON");
    }

    @Override
    public void turnOFF() {
        System.out.println("TV OFF");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MaxVolume){
            this.volume = RemoteControl.MaxVolume;
        }else if(volume < RemoteControl.MinVolume){
            this.volume = RemoteControl.MinVolume;
        }else{
            this.volume = volume;
        }
        System.out.println("소리를 " + volume + "로 변경했습니다.");
    }
}
