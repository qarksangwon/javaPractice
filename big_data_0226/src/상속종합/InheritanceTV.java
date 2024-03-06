package 상속종합;
// 시제품 TV 제작, 상속받아 기능이 개선된 판매용 TV 만들기

public class InheritanceTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.setPower(true);
        tv1.viewTV();
        tv1.setChannel(200, true);
        tv1.viewTV();
        tv1.setChannel(200, false);
        tv1.viewTV();
    }
}

class TV extends PrototypeTV{
    String name;
    boolean isInternet;
    TV(){
        // 기본 생성자에서 기본 생성자 상속받는 super()은 생략 가능.
        name = "LG TV";
    }
    TV(String name,boolean isPower, int channel, int volume){
        super(isPower,channel,volume);
        isInternet = false;
        this.name = name;
    }

    void setPower(boolean isPower){
        this.isPower = isPower;
    }
    void setVolume(int vol){
        if(vol >= 0 && vol <= 100) this.volume = vol;
        else System.out.println("볼륨 설정 범위를 벗어났습니다.");
    }

    @Override
    public void setChannel(int cnl){
        if(cnl > 1 && cnl < 2000){
            channel = cnl;
            System.out.println("채널이 " + cnl+"번으로 변경됐습니다.");
        }else System.out.println("채널 설정 범위를 벗어났습니다.");
    }

    public void setChannel(int cnl, boolean isInternet){
        if(isInternet){
            System.out.println("인터넷 모드 입니다.");
            this.isInternet = true;
        }else{
            this.isInternet = false;
            if(cnl > 1 && cnl < 2000){
                channel = cnl;
                System.out.println("채널이 "+cnl+"번으로 변경됐습니다.");
            }else System.out.println("채널 설정 범위를 벗어났습니다.");
        }
        System.out.println();
    }

    void viewTV(){
        String powerState = isPower ? "ON" : "OFF";
        String internetState = isInternet ? "ON" : "OFF";
        System.out.println("이름 : " + name);
        System.out.println("전원 : " + powerState);
        System.out.println("채널 : " + channel);
        System.out.println("볼륨 : " + volume);
        System.out.println("인터넷 모드 : " + internetState);
        System.out.println();
    }
}