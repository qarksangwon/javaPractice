package 디폴트메소드;
// 디폴트 메소드 = 인터페이스에 있는 구현 메소드를 의미함.
// 메서드 앞에 default 예약어 사용하고 { } 구현부가 있어야 함.

import java.util.Scanner;

public class DefaultMethodEx {
    public static void main(String[] args) {
        RemoteControl rc;
        Scanner sc = new Scanner(System.in);
        System.out.print("제품 선택 [1]Audio [2]TV : ");
        int sel = sc.nextInt();
        if(sel == 1 ) rc = new Audio();
        else rc = new TV();
        rc.turnON();
        rc.setVolume(70);
        rc.setMute(true);
        RemoteControl.changeBattery();


    }
}


