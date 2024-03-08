package 자동차만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int endPoint;
        int people;
        int choice;
        int function;
        boolean onOff;
        int pcnt =0;
        while(true) {
            System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주 : ");
            try {
                endPoint = sc.nextInt();

            }catch (Exception e){
                System.out.println("정해진 지역에서만 선택해주세요.");
                continue;
            }
            System.out.print("이동할 승객 수 입력: ");
            try {
                people = sc.nextInt();
                if(people>100||people<1){
                    System.out.println("1명~100명 중에서만 입력 가능.");
                    continue;
                }
            }catch (Exception e){
                System.out.println("입력 똑바로 해주세요.");
                continue;
            }
            System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
            try {
                choice = sc.nextInt();
            }catch (Exception e) {
                System.out.println("입력 똑바로 해주세요");
                continue;
            }
            System.out.print("부가기능 [1]ON [2]OFF : ");
            try {
                function = sc.nextInt();
                if(function != 1 && function != 2 ){
                    continue;
                }
            }catch (Exception e){
                System.out.println("입력 똑바로 해주세요");
                continue;
            }
            onOff = (function==1)? true:false;
            break;
        }

        int[] nav = {0, 400, 200, 150, 300};


        CarForm car = null;

        if(choice == 1){
            car = new SportCar("Ferrari");
            ((SportCar)car).onOff(onOff);
            pcnt = people%2==0?people/2:people/2+1;
        } else if (choice == 2) {
            car = new Car("GV80");
            ((Car)car).onOff(onOff);
            if(onOff){
                pcnt = people%5==0?people/5:people/5+1;
            }
            else pcnt = people%4==0?people/4:people/4+1;
        } else if (choice == 3) {
            car = new Bus("관광버스");
            ((Bus)car).onOff(onOff);
            pcnt = people%20==0?people/20:people/20+1;
        }else {
            System.out.println("선택하신 차가 없습니다.");
        }

        int totalPrice=(nav[endPoint]*pcnt/car.fe)*2000;
        int cnt = 0;
        int litter = (nav[endPoint]*pcnt/car.fe);
        if(litter % car.fuelBox != 0){
            cnt = litter / car.fuelBox + 1;
        }else cnt = litter / car.fuelBox;

        String str = "";
        double totalTime = (double)nav[endPoint]*pcnt/car.speed;
        totalTime *= 60;
        int hour = (int) (totalTime/60);
        int min = (int)(totalTime-hour*60);


        System.out.println("====="+car.carName+"=====");
        System.out.println("총 비용 : " + totalPrice + "원");
        System.out.println("총 주유 횟수 : " + cnt);
        System.out.println("총 이동 시간 : " + hour+"시간 "+ min+"분");

    }
}
//(총거리/연비)/연료통 ==> 나머지가 있으면 몫에 +1 없으면 그냥 몫으로
//        (그 몫에다가 * 연료통 크기) * 2000
