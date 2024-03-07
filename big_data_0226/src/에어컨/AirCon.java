package 에어컨;
// 전원 : ON/OFF
// 온도 설정 기능
// 현재 온도 표시 기능
// Cooler ON/OFF
// Heater ON/OFF
// 바람 강도 (1,2,3단)


import java.util.Calendar;
import java.util.Scanner;

public class AirCon {
    boolean isPower;
    int setTemp;
    int currTemp;
    boolean isCooler;
    boolean isHeater;
    int windStep;

    AirCon(){
        final int[] monthTemp = {-5,3,10,15,22,28,32,30,24,16,8,4};
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        currTemp = monthTemp[month];
        isPower = false;
        setTemp = 18;
        isCooler = false;
        isHeater = false;
        windStep = 1;
    }

    void airConInfo(){
        String onOffStr = (isPower) ? "ON":"OFF";
        String heaterStr = (isHeater) ? "ON":"OFF";
        String coolerStr = (isCooler) ? "ON":"OFF";
        final String[] windStr = {"","1단계","2단계","3단계"};
        System.out.println("==========에어컨 정보==========");
        System.out.println("전원 : " + onOffStr);
        System.out.println("현재 온도 : " + currTemp);
        System.out.println("설정 온도 : " + setTemp);
        System.out.println("히터 : " + heaterStr);
        System.out.println("쿨러 : " + coolerStr);
        System.out.println("바람 세기 : " + windStr[windStep]);
        System.out.println();
    }
    public void setAirconState() {
        Scanner sc = new Scanner(System.in);
        System.out.println("현재 온도가 " + currTemp + " 입니다.");
        System.out.print("온도를 설정 하세요 : ");
        setTemp = sc.nextInt();
        System.out.println("설정 온도는 " + setTemp + " 입니다.");
        System.out.print("바람 세기를 설정 하세요(1단/2단/3단) : ");
        windStep = sc.nextInt();
        if (currTemp > setTemp) { // 현재가 더운 상태
            System.out.println("Cooler 가 동작 합니다.");
            isCooler = true;
            isHeater = false;
        } else if(currTemp < setTemp) { // 현재가 추운 상태
            System.out.println("Heater 가 동작 합니다.");
            isCooler = false;
            isHeater = true;
        } else {
            isCooler = false;
            isHeater = false;
        }
    }
    public void setPower(boolean power) {
        isPower = power;
    }
    public int getWindStep() {
        return windStep;
    }

    public boolean isHeater() {
        return isHeater;
    }

    public boolean isCooler() {
        return isCooler;
    }
    public void setCurrTemp(int n) {
        currTemp += n;
    }
    public int getCurrTemp() {
        return currTemp;
    }
    public int getSetTemp() {
        return setTemp;
    }
}
